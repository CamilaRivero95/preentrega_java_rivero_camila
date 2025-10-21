package inicio;
import java.util.Scanner;

public class clase2for {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
    System.out.print("Ingrese un numero: ");
    int numero = entrada.nextInt();
    for(int i=1; i <= numero; i++){
        System.out.print(i);
    }

  
    }
    
}
