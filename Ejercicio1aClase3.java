package clase3;
import java.util.Scanner;

public class Ejercicio1aClase3 {
    public static void main(String[] args) {
        String texto = "", letra=" ", text_aux, letraActual="";
        Scanner entrada = new Scanner(System.in);
        int cantidad =0;
        char letraChar='a';
        
        String letraString = Character.toString(letraChar);
        
        System.out.println("Ingrese cadena de texto: ");
        texto = entrada.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese la letra que desea contar: ");
        letraChar = entrada.next().charAt(0);
        
        /*for (int i = 0; i < texto.length(); i++) {
            if((texto.charAt(i)).equals(letra.charAt(0))){
                cantidad++;
        }*/
        
        for (int i = 0; i < texto.length(); i++) {
            letraActual = Character.toString(texto.charAt(i));
            if(letraActual.equals(letraString)){
                cantidad++;
            }
        }
        
        
        
        /*for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i)==letraChar) {
                cantidad++;
            }
        }*/
        
        System.out.println("La letra se repite "+cantidad+" veces en la cadena de texto ingresada.");
        
        }
        
        
    }
    

