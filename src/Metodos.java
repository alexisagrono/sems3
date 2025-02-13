import java.util.Scanner;
public class Metodos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese el radio de su circulo: ");
        double radio= capturarRadio(sc);
        
       
       
        System.out.println("el perimetro de su circulo: "+perimetro (radio));
        System.out.println("el area de su circulo: "+area ( radio));
        System.out.println("el diametro de su circulo: "+diametro (radio));
        
       
    }
    public static double capturarRadio(Scanner sc) {
        double radio;
        while (true) {
            System.out.println("Digite el radio del círculo");
            radio = sc.nextDouble();
            if (radio <= 0) {
                System.out.println("El radio debe ser mayor que cero");
            } else {
                break;
            }
        }
        return radio;
    }
    public static double area (double radio){
double resultado= Math.PI*radio*radio;
return resultado;




    }
    public static double diametro (double radio){
        double resultado=2*radio;
        return resultado;
    }
     
    public static double perimetro (double radio){
        double resultado=2*Math.PI*radio;
        return resultado;
    }
    
    }
            
            
        
        

          

