
import java.util.Scanner;
public class Tarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("ingrese un número entero :");
        int numero = scanner.nextInt();

   
        if (numero % 2 == 0) {
            System.out.println("Su número es par.");
        } else {
            System.out.println("Su  número es impar.");
        }

        if (esPrimo(numero)) {
            System.out.println("Su número es primo.");
        } else {
            System.out.println("Su número no es primo.");
        }

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
        } else {
            System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero) + ".");
        }

        scanner.close();
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


    public static long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

    
