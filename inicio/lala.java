package inicio;
import java.util.Scanner;

public class lala {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);


        
    int [] precios  = new int[10];

    for(int i=0; i < precios.length; i++){
        System.out.println("Ingrese el precio: ");
        precios[i] = scanner.nextInt();
    }
        
    }

    
}
