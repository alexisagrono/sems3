public class Subrutina {
    
public static void main(String[] args) {
    informacion();
    System.out.println("la sumas de 3 y 4 es :"+sumar(3,4));
    System.out.println("la resta de 5 y 5 es :"+resta(5,5));
    
    
}

 public static int sumar (int numero1, int numero2){
    int resultado;
    resultado=numero1+numero2;
    return resultado;
 
 }
 
 public static int resta (int numero1, int numero2){
    int resultado;
    resultado=numero1-numero2;
    return resultado;
 
 }
 public static void informacion(){
    System.out.println("este programa realiza sumas y restas de manera funcional");
 }

    

 

}


