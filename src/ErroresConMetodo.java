
import java.util.Scanner;


public class ErroresConMetodo {

   
    public static void main(String[] args) {
        
        double A,B;
        Scanner teclado = new Scanner(System.in);
        
        //Solicitamos los valores al usuario
        System.out.print("Ingrese el valor de A: ");
        A = teclado.nextInt();
        System.out.print("Ingrese el valor de B: ");
        B = teclado.nextInt();
        
        //Creamos el objeto y mandamos los valores A y B
        ErroresProg Rl = new ErroresProg(A,B);
        
        //Imprimimos los resultados
        System.out.println("\nEl Error Absoluto es: " + Rl.errorAbsoluto());
        System.out.println("El Error Relativo es: " + Rl.errorRelativo());
        System.out.println("El Error Relativ Porcentual es: " + Rl.errorRePorcentual());

      
    }
    
}
