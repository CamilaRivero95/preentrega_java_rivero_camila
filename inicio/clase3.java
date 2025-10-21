package inicio;
import java.util.Scanner;

public class clase3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int saldo =100;
        System.out.println("Su saldo actual es: " + saldo);
        while(saldo > 0){
            System.out.println("Ingrese cuanto desea gastar: ");
            int gasto = entrada.nextInt();

            if (gasto <= saldo){
                saldo = saldo - gasto;
                System.out.println("Le resta: "+ saldo);
            } else{
                 System.out.println("Saldo no suficiente");
                continue;
            }
        }
        System.out.println("Su saldo final es: " + saldo);
    }
    
}
