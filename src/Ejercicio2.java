import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int[] numeros= new int [10];
    int numero= 0;
    int pares=0;
    int impares=0;
    System.out.println("digite un numero");
    for (int i = 0; i <numeros.length; i++) {
        numero = sc.nextInt();
        while (true){
            System.out.println("digite un numero entero positivo: ");
            numero=sc.nextInt();
            if(numero<=0){
                System.out.println("el  numero debe ser positivo");
    
            }else{
                numeros [i]=numero;
                break;
            }

         }
       
        
         
    }
    System.out.println("el array de numeros es: {");
    for(int i=0; i<numeros.length;i++){
        System.out.println( numeros[i]+" ");
    }
    
    for (int i = 0; i<numeros.length;i ++){
        if (numeros [i]%2==0){
            pares ++;
        }else{
            impares++;
        }
       


    }
   

    }
}
