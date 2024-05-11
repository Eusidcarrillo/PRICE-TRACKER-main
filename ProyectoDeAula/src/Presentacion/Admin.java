
package Presentacion;


public class Admin extends Usuario {
    
    private int contraseña;

    public Admin() {
    }

    public Admin(int contraseña, String nombre, long cedula) {
        super(nombre, cedula);
        this.contraseña = contraseña;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Admin{" + "contrase\u00f1a=" + contraseña + '}';
    }

}