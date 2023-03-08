package clase3;

import java.util.Scanner;

public class Ejercicio2Clase3 {
    public static void main(String[] args) {
        String nombres;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres, separandolos por un espacio:");
        nombres = entrada.nextLine();
        
        String[] vectNombres = nombres.split(" ");
        
        System.out.println("");
        for(String nombre: vectNombres){
            System.out.println(nombre);
        }
    }
}
