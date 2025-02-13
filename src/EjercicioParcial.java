import java.util.Scanner;
public class EjercicioParcial {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] numeros= new int[8];
        System.out.println("ingrese 8 numero entre 20 y 80:");
        

        for(int i=0; i<numeros.length; i++){
            System.out.println("ingrese un numero");
            numeros[i]=Sc.nextInt();
            while (numeros [i] <20) {
                System.out.println("numero invalido es menor al rango perimitido");
                numeros[i]=Sc.nextInt();
                if(numeros[i]>80){
                    System.out.println("numero invalido fuera de rango");
                }
            }
          
        Sc.close();
            

        }
        int suma= 0;
        int numerosmayores= 0;
            for (int i = 0; i < 8; i++) {
                suma += numeros[i];
                }
             double promedio= (double)suma/8;
            System.out.println("promedio: "+promedio);
            
            
            
            for (int i = 0; i < 8; i++){
                if (numeros[i] >promedio) {
                    numerosmayores ++ ;
        
            }
        }
            System.out.println("numeros mayores al promedio  "+numerosmayores);
           


             
       
        }
    
        
        
        
        
    
}
