
package Logica;

import Presentacion.Proveedor;

public class Articulo {
    
    private String nombreArticulo;
    private double precio;
    private long codigo;
       
    //RELACION CON LA CLASE PROVEEDOR
    private Proveedor vendidoEn;

    public Articulo() {
        
    }

    public Articulo(String nombreArticulo, double precio, long codigo, Proveedor vendidoEn) {
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.codigo = codigo;
        this.vendidoEn = vendidoEn;
    }
    
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Proveedor getVendidoEn() {
        return vendidoEn;
    }

    public void setVendidoEn(Proveedor vendidoEn) {
        this.vendidoEn = vendidoEn;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombreArticulo=" + nombreArticulo + ", precio=" + precio + ", codigo=" + codigo + ", vendidoEn=" + vendidoEn.getNombre()+ ", Ubicacion=" + vendidoEn.getUbicacion()+'}';
    }
}
    

    