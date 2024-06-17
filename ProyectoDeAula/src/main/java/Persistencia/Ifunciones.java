
package Persistencia;

import Entidades.*;
import java.io.Serializable;
import java.util.List;


public interface Ifunciones extends Serializable{
    
    int buscarPosicion(long codigo);
    List<Producto> buscarProductosTipo(String tipo);
    Producto buscarProducto(long codigo);
    boolean eliminar(Producto a);
    void Imprimir();
    boolean agregarProducto(Producto producto);
    List<Producto> obtenerProductos();
    
}
