package inicio;

import java.util.Scanner;

import java.util.ArrayList;

public class Menu {
    public static void main(String[] args){
    Scanner lector = new Scanner(System.in);

    ArrayList<Producto> productos = new ArrayList<Producto>();
    ArrayList<Categoria> categorias = new ArrayList<Categoria>();
    ArrayList<Pedido> pedidos = new ArrayList<>();

    GestorProducto.cargarCategoriasPorDefecto(categorias);


    int opcion= 0;

        do{
            System.out.println("******************");
            System.out.println("Bienvenido al MENU");
            System.out.println("1. Crear nueva categoria");
            System.out.println("2. Crear nuevo producto");
            System.out.println("3. Listar productos");
            System.out.println("4. Modificar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Crear pedido");
            System.out.println("7. Salir");
             System.out.println("Elija una opcion: ");
            opcion= lector.nextInt();
            lector.nextLine(); 

            switch(opcion){
                case 1:
                GestorProducto.agregarCategoria(lector, categorias);
                break;
                case 2:
                GestorProducto.agregarProducto(lector, productos, categorias);
                break;   
                case 3:
                GestorProducto.listarProductos(productos);
                break;
                case 4: 
                 GestorProducto.modificarProducto(lector, productos, categorias);
                break;
                case 5:
                GestorProducto.eliminarProducto(lector, productos); 
                break;
                case 6:
                GestorProducto.crearPedido(lector, productos, pedidos);
            }

            } while(opcion!=7);
            System.err.println("Saliendo del programa");
            System.err.println("*********************");
        }
        }


/*COMENTARIOS */
/*Scanner lector lo uso para leer los datos que ingresa el usuario x consola*/

/*Arraylist lo uso para almacenar los objetos de categorias, productos y pedidos*/

/* Do While, para repetir el menu hasta que el usuario elija salir opcion 7*/

/*nextLine() luego del nextInt() se usa para limpiar el buffer despues 
de leer lo que ingresa el usuario y que no tire error */

/* en cada Case del Swich se llama a un metodo correspondiente a la accion
 que se desea realizar, todos los metodos estan ubicados en la clase GestorProducto
 para hacer que el codigo de Menu quede mas limpio y ordenado */

