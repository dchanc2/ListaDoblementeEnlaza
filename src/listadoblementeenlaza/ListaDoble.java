/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeenlaza;

import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class ListaDoble {
    private NodoDoble inicio, fin;
    int tamaño;
    public ListaDoble(){
        this.inicio=null;
        this.fin=null;
        this.tamaño=0;
    }
        // Metdodo para saber si la lista esta vacia
    public boolean ListaVacia(){
        return inicio==null;
    }
    //Metdodo para agregar al inicio
        public void agregarAlInicio(int el){
        if(!ListaVacia()){
            inicio=new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior=fin;
        }else{
            inicio=fin=new NodoDoble(el);
        }tamaño++;
    }
    // Metodo para agregar nodo al final
    public void agregarAlFinal(int el){
        if(!ListaVacia()){
            fin=new NodoDoble(el, null, fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(el);
        }tamaño++;
    } 
        // Metodo para mostrar lista de Inicio a Fin
    public void ListaInicioFin(){
        if(!ListaVacia()){
            String datos="<-->";
            NodoDoble auxiliar=inicio;
            while(auxiliar!=null){
                datos = datos + "["+auxiliar.dato+"]<-->";
                auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, 
                    "Mostrando Lista de Inicio a Fin",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // Metodo para mostrar lista de Fin a Inicio
        public void ListaFinInicio(){
        if(!ListaVacia()){
            String datos="<-->";
            NodoDoble auxiliar=fin;
            while(auxiliar!=null){
                datos = datos + "["+auxiliar.dato+"]<-->";
                auxiliar=auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, 
                    "Mostrando Lista de Fin a Inicio",JOptionPane.INFORMATION_MESSAGE);
        }
    }
        // Metodo para mostrar el tamaño de la lista
        public void TamañoLista(){
            JOptionPane.showMessageDialog(null, "El tamaño de la lista es: "+tamaño);
        }
        // Metodo para buscar un elemento por su valor
        public void BuscarValor(int ValorDato) {
            NodoDoble actual = inicio;
        int indice = 0;
        while (actual != null) {
            if (actual.dato == ValorDato) {
                JOptionPane.showMessageDialog(null, "El Elemento si esta en la lista, en si indice: "+indice);
                return;
            }
            actual = actual.siguiente;
            indice++;
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado en la lista");
    }
    // Metodo ´para buscar un elemento con su indice
        public void BuscarIndice(int Indice){
            if (Indice < 0 || Indice >= tamaño) {
            JOptionPane.showMessageDialog(null, "El indice "+Indice+" no esta en la lista");
            return;
        }

        NodoDoble actual = inicio;
        for (int i = 0; i < Indice; i++) {
            actual = actual.siguiente;
        }  
        JOptionPane.showMessageDialog(null, "Elemento en el índice " + Indice + ": " + actual.dato);
    }
     // Metodo para eliminar un nodo
        public void Borrar(int ValorDato) {
        NodoDoble actual = inicio;
        while (actual != null) {
            if (actual.dato == ValorDato) {
                if (actual.anterior == null) {
                    inicio = actual.siguiente;
                    if (inicio != null) {
                        inicio.anterior = null;
                    }
                } else if (actual.siguiente == null) {
                    fin = actual.anterior;
                    fin.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                tamaño--;
                JOptionPane.showMessageDialog(null, "Elemento "+ValorDato+" se ha eliminado");
                return;
            }
            actual = actual.siguiente;
        }
        JOptionPane.showMessageDialog(null, "El elemento no esta en la lista");
    }
}
