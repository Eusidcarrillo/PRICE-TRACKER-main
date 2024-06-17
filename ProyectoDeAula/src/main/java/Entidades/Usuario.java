
package Entidades;


public class Usuario {
    
    private String nombre;
    private long cedula;
    
   

    public Usuario() {
    }

    public Usuario(String nombre, long cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

   
    



    
    
    
}

