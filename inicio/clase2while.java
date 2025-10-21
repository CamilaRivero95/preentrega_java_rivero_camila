package inicio;
import java.util.Scanner;

public class clase2while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
       int contador = 0;
    
     System.out.print("Ingrese un numero: "); 
     int numero = entrada.nextInt();

     while (contador < numero){
        contador++;
        System.out.print(contador + ", ");
     }
     

    }
    
}
