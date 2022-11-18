package Pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author ilike
 */
public class ClaseMain {
    public static void main(String[]args){
    int opcion = 0, nodo = 0;
    Pila pila = new Pila ();
            

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La Pila esta vacia?\n"
                        + "4. ¿Cual es el último valor ingresado en la Pila?\n"
                        + "5. ¿Cuantos nodos tiene la pila?\n"
                        + "6. Vaciar Pila\n"
                        + "7. Mostrar contenido de la Pila\n"
                        + "8. Agrega un elemento al tope de la estructura \n "        
                        + "9. Salir.\n\n"));
                
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Porfavor ingresa el valor a guardar en el nodo"));
                        pila.InsertNodo(nodo);
                        break;
                        
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                             + pila.Pop());
                        }else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                        
                    case 3:
                        if(pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila NO esta vacia");
                        }
                        break;
                        
                    case 4:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El último valor ingresado en la pila es: "
                             + pila.peek());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + pila.Lenght() + " nodos.");
                        break;
                        
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.vaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                        
                    case 7:
                        pila.Valores();
                        break;
                        
                    case 8:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Agrega un elemento al tope de la estructura:"));
                        pila.Push(nodo);
                        break;
                        
                    case 9:
                        opcion = 9;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                        break;
                }
                

            } catch (NumberFormatException e) {

            }
        } while (opcion != 9);
    }
}
