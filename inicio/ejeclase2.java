package inicio;
import java.util.Scanner;

public class ejeclase2 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int precioProd = 10;

    System.out.print("Ingrese su nombre: ");
    String nombre = entrada.nextLine();
    
    System.out.print("Ingrese cantidad necesaria: ");
    int cantProd = entrada.nextInt();
    int total = cantProd * precioProd;
    int porcentaje = total * 15 / 100;
    if (total >= 100){
        int totalDesc= total - porcentaje;
        System.out.print(nombre + " le corresponde un descuento del 15%, el total a pagar es: " + totalDesc);
    } else{
         System.out.print( nombre + " su total a pagar es: " + total);
    }
    
}
}