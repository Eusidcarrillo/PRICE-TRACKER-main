
package Logica;

import Entidades.Ifunciones;
import java.util.ArrayList;

public class Producto implements Ifunciones {
    
    private String nombre;
    private ArrayList<Articulo> articulos;
   
    public Producto() {
        this.articulos = new ArrayList();
    }

    public Producto(String nombre) {
        this();
        nombre=nombre.toUpperCase();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos=articulos;
        
    }
    
    public void agregarElemento(Articulo articulo){
        articulos.add(articulo);
    }

    public void Imprimir() {
        System.out.println("Nombre   " +"Precio   " + "Proveedor   " + "Ubicacion   " + "\n");
        
        for(Articulo art: articulos){
             System.out.println(art.toString());
        }
    }

    @Override
    public int buscar(long codigo) {
        for(int i=0; i<articulos.size(); i++){
            if( articulos.get(i).getCodigo() == codigo){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int eliminar(long codigo) {
        int b = buscar(codigo);
    
        if( b == -1){
            System.out.println("El elemento no existe");
        }
        else{
            System.out.println("Elemento eliminado");
            articulos.remove(b);
        }
        return b;
    }
}
