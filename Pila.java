package Pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author ilike
 */
public class Pila {
    private Nodo UltimoValorIngresado;
    int tamanio =0;
    String Lista = "";
    
    public Pila (){
        UltimoValorIngresado = null;
        tamanio = 0;
    }
            
    //isEmpty() 🡨 ¿Está vacía?
    public boolean isEmpty(){
        return UltimoValorIngresado == null;
        
    }
    
    public void  InsertNodo(int nodo){
        Nodo n_nuevo = new Nodo(nodo);
        n_nuevo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = n_nuevo;
        tamanio++;
        
    }
    
    //length() 🡨 Regresa el número de elementos en la pila.
    
    public int Lenght(){
        return tamanio;
    }
    
    //pop() 🡨 Saca el elemento del tope y lo regresa. El puntero al tope se mueve al anterior elemento
    public int Pop (){
        int aux = UltimoValorIngresado .informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamanio--;
        return aux;
    }
    
    
    //peek() 🡨 Consulta el elemento en el tope, sin sacarlo.
    public int peek(){
        return UltimoValorIngresado.informacion;
    }
    
    
    //push( value ) 🡨 Agrega un elemento al tope de la estructura.
    public void Push(int nodo){
        Nodo n_nuevo = new Nodo(nodo);
        n_nuevo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = n_nuevo;
        tamanio++;
        
    }
    
    public boolean PilaVacia(){
        return UltimoValorIngresado ==null;
    }
    
    public void vaciarPila(){
        while   (!PilaVacia()){
            Pop();
        }
    }
    
    
    //Mostrar valores de la pila 
    public void Valores(){
        Nodo scan = UltimoValorIngresado;
        
        while(scan !=null){
            Lista += scan.informacion + "\n";
            scan = scan.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista="";
        
    }
    
    
}
