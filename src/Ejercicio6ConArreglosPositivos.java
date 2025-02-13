import java.util.Scanner;

public class Ejercicio6ConArreglosPositivos {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);int cantidad;
        System.out.println("ingrese la cantidad de numero enteros positivos que desea procesar");
        cantidad = Sc.nextInt();
        while(cantidad<0){  
            System.out.println("numero invalido ingrese un numero positivo");
        cantidad=Sc.nextInt();
        }
        
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            int numero;
            do {
                System.out.println("Ingrese un número entero positivo entre 1 y 100:");
                numero = Sc.nextInt();
                if (numero <= -100 || numero > 100) {
                    System.out.println("Número inválido; Por favor, ingrese un número positivo entre -1 y 100.");
                }
            } while (numero <= 0 || numero > 100);
            numeros[i] = numero;
        }
        System.out.println("Los números ingresados por usted son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i]);
        }

        int suma = 0;
        int pares = 0;
        int impares = 0;
        int maximo = numeros[0];
        int minimo = numeros[0];
        int primos = 0;

        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
            if (numeros[i] % 2 == 
            
            
            
            
            
            0) {
                pares++;
            } else {
                impares++;
            }

            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }

            if (esPrimo(numeros[i])) {
                primos++;
            }
        }
        System.out.println("Suma de todos los elementos: " + suma);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
        System.out.println("Cantidad de números primos: " + primos);
        
        System.out.println("Números en orden inverso:");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }


        Sc.close();
    }
 
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
        



    }
    
}
