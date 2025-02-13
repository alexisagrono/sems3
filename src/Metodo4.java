import java.util.Scanner;

public class Metodo4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    saludar(sc);
    System.out.println("Digite su edad");
    int edad=sc.nextInt();
    mayorEdad(edad);
    System.out.println("su numero de la suerte es"+numeroSuerte(edad));

    } 

    public static void saludar(Scanner sc){
    System.out.println("Digite su nombre");
    String nombre=sc.nextLine();
    System.out.println("Seleccciona un idioma: 1.ingles, 2.aleman, 3.Italiano");
    int idioma=sc.nextInt();
    switch (idioma) {
        case 1:
            System.out.println("hello"+ nombre);
            break;
         case 2:
            System.out.println("hallo"+ nombre);
         break;
         case 3:
            System.out.println("Ciao"+ nombre);
         break;
        default:
           System.out.println("hola"+ nombre+"idioma no soportado");
            break;
    }
    }
    public static void mayorEdad(int edad){
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    public static String numeroSuerte(int edad){
        int multiplo3=0,aletorio;
        for (int i=0;i<=edad;i++){
            if(i%3==0){
            multiplo3++;
            }
        }
        aletorio=(int)Math.random()*100;
     return aletorio+""+multiplo3;

    }


}        