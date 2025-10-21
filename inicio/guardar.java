package inicio;

import java.util.Scanner;

public class guardar {
        public static void main(String[] args) {

    Scanner scanner =new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("El nombre es: " + nombre );
        if(nombre.equals("Camila") ){
            System.out.println("Si, es Camila");
        } 
        else{
            System.out.println("Intruso");
        }  

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("El nombre es: " + apellido );
       

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("La edad es: " + edad );
    
        System.out.print("Ingrese su altura: ");
        Double altura = scanner.nextDouble();
        System.out.println("La altura es: " + altura );
        scanner.close();
    }
     }
    
