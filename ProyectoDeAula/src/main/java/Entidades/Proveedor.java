
package Entidades;

import Persistencia.Ifunciones;
import java.util.ArrayList;
import java.util.List;


public class Proveedor extends Usuario implements Ifunciones{
    
    private int contraseña;
    private String ubicacion;
    private ArrayList<Producto> catalogo;
    

    public Proveedor() {
        this.catalogo = new ArrayList();
       
    }


    public Proveedor( String nombre, long cedula, int contraseña, String ubicacion) {
        super(nombre, cedula);
        this.contraseña=contraseña;
        this.ubicacion=ubicacion;
        this.catalogo = new ArrayList();
        
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    @Override
    public int buscarPosicion(long codigo) {
       
         for(int i=0; i<catalogo.size(); i++){
             
             if( catalogo.get(i).getCodigo() == codigo){
                  return i;
             }
         }
         return -1;
    }

    @Override
    public boolean eliminar(Producto a) {
         return this.catalogo.remove(a);
    
    }

    @Override
    public void Imprimir(){
        System.out.println("Nombre   Precio   Proveedor   Ubicacion   \n");
        
        for(Producto cat: catalogo){
             System.out.println(cat.toString());
        }
    
}    
    
    @Override
    public boolean agregarProducto(Producto producto){
        if(catalogo.add(producto)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Producto> buscarProductosTipo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto buscarProducto(long codigo) {
       for(Producto a: catalogo){
           if(a.getCodigo() == codigo){
               return a;
           }
       }
       return null;
    }
    
    @Override
    public List<Producto> obtenerProductos(){
        
        return this.catalogo;
    }

    
    
    
    
}
    
    

    