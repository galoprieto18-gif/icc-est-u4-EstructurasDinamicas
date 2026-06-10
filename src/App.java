import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;



public class App {
    public static void main(String[] args) throws Exception {
     
       runLinkedList();
        runQueue();
        runStack();

        System.out.println("Ejericio 1");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";
        String invertido = ejercicio1.invertString(texto);
        System.out.println(invertido);

        System.out.println();
        System.out.println("Ejercicio 2: Palíndromo");
        Ejercicio2 ejercicio2 = new Ejercicio2();

        System.out.println("¿radar es palíndromo? " + ejercicio2.esPalindromo("radar"));
        
        System.out.println("¿la palabra radar deve retornar: " + ejercicio2.esPalindromo("radar"));
        System.out.println("Computación es Palindromo: " + ejercicio2.esPalindromo("Computación"));
        
    }

    private static void runLinkedList(){
        LinkedList<String> lista = new LinkedList<>();
        
        lista.add("Computación");

            System.out.println(lista);
            
        }
        private static void runQueue(){
            Queue<String> cola = new LinkedList<>();
            
            cola.add("radar");
            System.out.println("COLA " + cola);
        }
        private static void runStack(){

            ArrayDeque<String> cola= new ArrayDeque<>();
            cola.push("Kevin");
            System.out.println("pila" + cola);

            System.out.println("-----------------------------------------");
           
            ArrayDeque<String> pila = new ArrayDeque<>();
            
            pila.push("Martin");
            System.out.println(pila);
        }
}
