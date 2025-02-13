import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPares = 0;
        int sumaImpares = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa 1 numero: ");
            numeros[i] = scanner.nextInt();
            if (i<=0){
                System.out.println("numero invalido");
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sumaPares ++;
            } else {
                sumaImpares ++;
            }
        }
        System.out.println(" pares: " + sumaPares);
        System.out.println(" impares: " + sumaImpares);



        
    }
}
