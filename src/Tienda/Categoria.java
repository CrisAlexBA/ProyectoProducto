
package Tienda;

import java.util.ArrayList;
/**
 *
 * @author Cristian Alexander Bedon Astudillo
 */
public class Categoria {
    private String nombre;
    ArrayList<Producto> listaProductos;
    ArrayList<Categoria> listaCategorias;

    public Categoria(String nombre, ArrayList<Producto> listaProductos){
        
        this.nombre = nombre;
        this.listaProductos = listaProductos;
    }
    
    public String productosMayores(ArrayList<Producto> listaProducto, int indice){
        String cadena = " ";
        if(listaProducto.size() == indice){
            return cadena;
        }else{
            if(listaProducto.get(indice).getPrecio()>= 10000){    
                String aux = listaProducto.get(indice).getNombre() + ", ";
                cadena = cadena + aux;
                if(!listaProducto.get(indice).getListaProductos().isEmpty()){
                    productosMayores(listaProducto, indice+1);
                }else{
                   productosMayores(listaProducto.get(indice).getListaProductos(), indice); 
                }
            }else{
                if(!listaProducto.get(indice).getListaProductos().isEmpty()){
                    productosMayores(listaProducto, indice+1);
                }else{
                   productosMayores(listaProducto.get(indice).getListaProductos(), indice); 
                }
            }
        }
        return cadena;
    }
    public boolean buscarProductosRojo(ArrayList<Producto> listaProducto, int indice){
        boolean bandera = false;
        if(bandera == false){
            return bandera;
        }else{
            if(listaProducto.get(indice).getColor().equalsIgnoreCase("rojo") == false){    
                if(!listaProducto.get(indice).getListaProductos().isEmpty()){
                    buscarProductosRojo(listaProducto, indice+1);
                }else{
                   buscarProductosRojo(listaProducto.get(indice).getListaProductos(), indice); 
                }
            }else{
                bandera = true;
            }
        }
        return bandera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
    
}
