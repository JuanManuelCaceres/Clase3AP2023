package clase3;
import java.util.Scanner;

public class Ejercicio1bClase3 {
    public static void main(String[] args) {
        int aux=0, bandera=0;
        Scanner entrada = new Scanner(System.in);
        int vector1[] = new int[3];
        
        System.out.println("Ingrese el primer numero: ");
        vector1[0] = entrada.nextInt();
        System.out.println("");
        System.out.println("Ingrese el segundo numero: ");
        vector1[1] = entrada.nextInt();
        System.out.println("");
        System.out.println("Ingrese el tercero numero: ");
        vector1[2]= entrada.nextInt();
        System.out.println("");
        
        System.out.println("Vector Desordenado");
        for (int i = 0; i < 3; i++) {
            System.out.println("["+vector1[i]+"]");
        }
        System.out.println("");
        
        System.out.println("Presione 1 para ordenar Descendentemente");
        System.out.println("Presione 2 para ordenar Ascendentemente");
        
        bandera = entrada.nextInt();
        
        if (bandera==1) {
            System.out.println("Vector Ordenado Descendentemente");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    if (vector1[j]<vector1[j+1]) {
                        aux = vector1[j];
                        vector1[j]=vector1[j+1];
                        vector1[j+1]=aux;
                    }

                }
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("["+vector1[i]+"]");
            }    
        }
        if (bandera==2) {
            System.out.println("Vector Ordenado Descendentemente");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    if (vector1[j]>vector1[j+1]) {
                        aux = vector1[j];
                        vector1[j]=vector1[j+1];
                        vector1[j+1]=aux;
                    }

                }
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("["+vector1[i]+"]");
            }    
        }
    }
}
