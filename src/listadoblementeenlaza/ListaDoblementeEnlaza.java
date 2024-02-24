
package listadoblementeenlaza;

import javax.swing.JOptionPane;


public class ListaDoblementeEnlaza {


    public static void main(String[] args) {
       ListaDoble Lista =new ListaDoble();
        
        int opcion=0, elemento;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1. Insertar al Inicio \n 2. Insertar al Final \n 3. Recorrer hacia delante"
                        +"\n 4. Recorrer hacia atras \n 5. Mostrar tamaño de la lista"
                        +"\n 6. Mostrar si la lista esta vacia"
                        +"\n 7. Buscar elemento por valor"
                        +"\n 8. Buscar elemento por indice"
                        +"\n 9. Borrar un elemento"+"\n 10. Salir","Menu de opciones",JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Elemento: ",
                                "Insertando al inicio",JOptionPane.INFORMATION_MESSAGE));
                       // Agregando al inicio
                        Lista.agregarAlInicio(elemento);
                         break;
                    case 2:
                         elemento=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Elemento: ",
                                 "Insertando al final",JOptionPane.INFORMATION_MESSAGE));
                       // Agregando al final
                        Lista.agregarAlFinal(elemento);
                        break;
                    case 3:
                        // Recorrer hacia adelante
                        if(!Lista.ListaVacia()){
                            Lista.ListaFinInicio();
                        }else{
                           JOptionPane.showMessageDialog(null, "No hay nodos aun");
                        }
                        break;
                    case 4:
                        // Recorrer hacia atras
                        if(!Lista.ListaVacia()){
                            Lista.ListaInicioFin();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos aun"); 
                        }
                        break;
                    case 5:
                        // Mostrar tamaño de la lista
                        Lista.TamañoLista();
                        break;
                    case 6:
                        // Mostrar si la lista esta vacia
                        if(!Lista.ListaVacia()){
                            JOptionPane.showMessageDialog(null, "La Lista no esta vacia");
                        }else{
                            JOptionPane.showMessageDialog(null, "La Lista esta vacia");
                        }
                        break;
                    case 7: 
                        // Buscar elemento por su valor
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a buscar..","Buscando Nodo",
                                JOptionPane.INFORMATION_MESSAGE));
                        Lista.BuscarValor(elemento);
                        
                        break;
                    case 8:
                        // Buscar elemente por su indice
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el indice a buscar..","Buscando Nodo",
                                JOptionPane.INFORMATION_MESSAGE));
                        Lista.BuscarIndice(elemento);
                        break;
                    case 9:
                         // Se elimina nodo
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a eliminar..","Eliminando Nodo",
                                JOptionPane.INFORMATION_MESSAGE));
                        Lista.Borrar(elemento);
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        break;
                    default:
                        JOptionPane.showConfirmDialog(null, "Opcion incorrecta");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
            }
        }while(opcion != 10);
    
    }
 }
    

