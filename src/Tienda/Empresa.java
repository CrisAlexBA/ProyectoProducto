
package Tienda;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Categoria> listaCategorias;

    public Empresa(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = new ArrayList<>();
    }
    public String productosMayores(ArrayList<Categoria> listaCategoria, int indice){
        String cadena = " ";
        if(listaCategoria.size() == indice){
            return cadena;
        }else{
            cadena += listaCategoria.get(indice).productosMayores(listaCategoria.get(indice).getListaProductos(), indice);
            productosMayores(listaCategoria, indice+1);
        }
        return cadena;
    }
    public boolean buscarProductosRojo(ArrayList<Categoria> listaCategoria, int indice){
        boolean bandera = false;
        if(bandera == false){
            return bandera;
        }else{
            bandera = listaCategoria.get(indice).buscarProductosRojo(listaCategoria.get(indice).getListaProductos(), indice);
            buscarProductosRojo(listaCategoria, indice+1);
        }
        return bandera;
    }
}
