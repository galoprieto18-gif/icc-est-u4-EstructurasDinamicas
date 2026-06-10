import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {
    public String invertString(String texto){
        Deque<Character> pila = new ArrayDeque<>();
        for( int i = 0; i < texto.length(); i++){
            pila.push(texto.charAt(i));// 
        }
        String  invertida = "";
        while(!pila.isEmpty()){
            invertida += pila.pop(); 
            
        }
        return invertida;
    }
}