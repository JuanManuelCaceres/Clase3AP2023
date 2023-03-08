package clase3;

import java.util.Scanner;

public class Ejercicio1cClase3 {
    public static void main(String[] args) {
        int longCadena=0, valorX=0, suma=0;
        
        System.out.print("Ingrese la longitud de numeros: ");
        Scanner entrada = new Scanner(System.in);
        longCadena = entrada.nextInt();
        
        int vectNumeros[]= new int[longCadena];
        
        for (int i = 0; i < longCadena; i++) {
            System.out.print("Ingrese el siguiente numero en la cadena: ");
            vectNumeros[i] = entrada.nextInt();
        }
        
        System.out.println("");
        System.out.print("Ingrese el valor de \"X\": ");
        valorX=entrada.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < longCadena; i++) {
            if (vectNumeros[i]>valorX) {
                suma=suma+vectNumeros[i];
            }
        }
        System.out.println("");
        
        System.out.print("La suma total es: " +suma);
        System.out.println("");
    }
}
