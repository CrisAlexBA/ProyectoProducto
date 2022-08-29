
package Tienda;

import java.util.ArrayList;


public class Producto{
    private String nombre;
    private int precio;
    private String color;
    private ArrayList<Producto> listaProductos;

    public Producto(String nombre, int precio, String color, ArrayList<Producto> listaProductos){
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.listaProductos = listaProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
}
