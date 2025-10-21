package inicio;
import java.util.Scanner;

public class ejmanuclase2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int precio = 10;
        System.out.print("Ingrese su nombre ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese la cantidad deseada: ");
        int cant= entrada.nextInt();
        int total = precio * cant;

        if (cant >= 100){
            System.out.println("Le corresponde un descuento");
        }

        

        System.out.println(nombre + ": su total a pagar es: " + total);


        
    }
    
}
