package inicio;
import java.util.Scanner;
import java.util.ArrayList;

public class GestorProducto {

/*Agregamos categorias basicas predeterminadas*/

public static void cargarCategoriasPorDefecto(ArrayList<Categoria> categorias) {
        categorias.add(new Categoria( "Almacen"));
        categorias.add(new Categoria( "Limpieza"));
        categorias.add(new Categoria( "Frescos"));
        categorias.add(new Categoria( "Kiosco"));

        System.out.println("Categorias existentes: ");

    }

/*Agregar categoria*/

public static void agregarCategoria(Scanner lector, ArrayList<Categoria> categorias) {

        System.out.print("Ingrese nombre de la nueva categoria: ");
        String nombre = lector.nextLine();
        Categoria c = new Categoria(nombre);
        categorias.add(c);
        System.out.println("¡Categoria agregada con exito!");
    }

/*Crear producto */
        public static void agregarProducto(Scanner lector, ArrayList<Producto> productos, ArrayList<Categoria> categorias){
        
        /*se pide al usuario que ingrese nombre, precio y stock */
            System.out.println("Ingrese nombre");
            String nombre = lector.nextLine();
            System.out.println("Ingrese precio");
            double precio = lector.nextDouble();
            System.out.println("Ingrese stock");
            int stock = lector.nextInt();
        /*se muestra la lista con las categorias disponibles */
        System.out.println("Categorias disponibles: ");
        for (int i = 0; i < categorias.size(); i++) {
            System.out.println(i + ". " + categorias.get(i).getNombre());
        }
        /* se pide al usuario que seleccione la categoria y se valida que exista */
        System.out.print("Seleccione el número de la categoría: ");
        int indiceCat = lector.nextInt();
        lector.nextLine();
        if (indiceCat < 0 || indiceCat >= categorias.size()) {
            System.out.println("Categoria inválida.");
            return;
        }
        /*se crea un nuevo objeto y se lo agrega a la lista productos */
        Categoria categoriaSeleccionada = categorias.get(indiceCat);
        Producto p = new Producto( nombre, precio, stock, categoriaSeleccionada);
        productos.add(p);
        System.out.println("¡Producto agregado con exito!");

        }

/*Metodo buscar producto por ID */

  public static Producto buscarProductoPorId(ArrayList<Producto> productos, int id) {
        for (int i = 0; i < productos.size(); i++) {
        if (productos.get(i).getId() == id) {
            return productos.get(i);
        }
    }
    return null;
    }

/*Metodo listar productos */
/*is.Empty comprueba si la lisa esta vacia */
/*utilizo un for each*/
/*funciona gracias al metodo toString */

        public static void listarProductos(ArrayList<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        System.out.println("--- Lista de productos ---");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

/*Metodo listar categorias */
     public static void listarCategorias(ArrayList<Categoria> categorias) {
        if (categorias.isEmpty()) {
            System.out.println("No hay categorias registradas.");
            return;
        }

        System.out.println("\n--- Lista de categorias ---");
        for (Categoria c : categorias) {
            System.out.println(c);
        }
        }


 /* Eliminar producto */
 public static void eliminarProducto(Scanner lector, ArrayList<Producto> productos) {
    if (productos.isEmpty()) {
        System.out.println("No hay productos para eliminar.");
        return;
    }

    System.out.println("\n--- Lista de productos ---");
    for (int i = 0; i < productos.size(); i++) {
        Producto p = productos.get(i);
        System.out.println(i + ". " + p.getNombre() + " (ID: " + p.getId() + ")");
    }

    System.out.print("Ingrese el numero del producto que desea eliminar: ");
    int indice = lector.nextInt();
    lector.nextLine();

    if (indice < 0 || indice >= productos.size()) {
    System.out.println("Indice invalido.");
    return;
}
    Producto eliminado = productos.remove(indice);
    System.out.println("Producto \"" + eliminado.getNombre() + "\" eliminado exitosamente.");
}


/*Modificar datos */

public static void modificarProducto(Scanner lector, ArrayList<Producto> productos, ArrayList<Categoria> categorias) {
    if (productos.isEmpty()) {
        System.out.println("No hay productos para modificar.");
        return;
    }

    System.out.println("\n--- Lista de productos ---");
    for (int i = 0; i < productos.size(); i++) {
        Producto p = productos.get(i);
        System.out.println(i + ". " + p.getNombre() + " (ID: " + p.getId() + ")");
    }

    System.out.print("Ingrese el numero del producto que desea modificar: ");
    int indice = lector.nextInt();
    lector.nextLine();

    if (indice < 0 || indice >= productos.size()) {
        System.out.println("Indice invalido.");
        return;
    }

    Producto p = productos.get(indice);

    System.out.println("Ingrese nuevo nombre (actual: " + p.getNombre() + "): ");
    String nombre = lector.nextLine();
    if (!nombre.trim().isEmpty()) {
        p.setNombre(nombre);
    }

    System.out.println("Ingrese nuevo precio (actual: " + p.getPrecio() + "): ");
    String precioStr = lector.nextLine();
    if (!precioStr.trim().isEmpty()) {
        try {
            double precio = Double.parseDouble(precioStr);
            p.setPrecio(precio);
        } catch (NumberFormatException e) {
            System.out.println("Precio invalido, no se modificó.");
        }
    }

    System.out.println("Ingrese nuevo stock (actual: " + p.getStock() + "): ");
    String stockStr = lector.nextLine();
    if (!stockStr.trim().isEmpty()) {
        try {
            int stock = Integer.parseInt(stockStr);
            p.setStock(stock);
        } catch (NumberFormatException e) {
            System.out.println("Stock invalido, no se modifico.");
        }
    }

    System.out.println("Categorias disponibles:");
    for (int i = 0; i < categorias.size(); i++) {
        System.out.println(i + ". " + categorias.get(i).getNombre());
    }
    System.out.println("Ingrese nuevo número de categoria (actual: " + (p.getCategoria() != null ? p.getCategoria().getNombre() : "Sin categoría") + "): ");
    String catStr = lector.nextLine();
    if (!catStr.trim().isEmpty()) {
        try {
            int catIndice = Integer.parseInt(catStr);
            if (catIndice >= 0 && catIndice < categorias.size()) {
                p.setCategoria(categorias.get(catIndice));
            } else {
                System.out.println("Categoria invalida, no se modifico.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Categoria inválida, no se modifico.");
        }
    }

    System.out.println("Producto modificado exitosamente.");
}


 /*Metodo crear pedido*/   

 /*ATRIBUTOS: lector para que ingrese por consola
  ArrayList<Producto> para leer la lista de productos disponibles
  ArrayList<Pedido> para guardar el nuevo pedido*/


    public static void crearPedido(Scanner lector, ArrayList<Producto> productos, ArrayList<Pedido> pedidos){
        Pedido nuevo = new Pedido();
        listarProductos(productos); /*muestra lo disponible */

        while (true){
            System.out.print("Ingrese ID de producto (0 para terminar): ");
        int idProd = lector.nextInt();
        lector.nextLine();

        if (idProd == 0) break; /* si ingresa 0 se acaba el bucle */

        Producto prod = buscarProductoPorId(productos, idProd); /*busca x id */
        if (prod == null) { /*si no lo encuentra */
            System.out.println("Producto no encontrado.");
            continue; /*vuelvo a inciar el bucle para pedir un nuevo id */
        }

        System.out.print("Cantidad: ");
        int cantidad = lector.nextInt(); /*pide la cantidad */
        lector.nextLine();

        if (cantidad > prod.getStock()) {
            System.out.println("No hay suficiente stock.");
            continue; /*si la cantidad no es suficiente vuelve al inicio */
        }

        nuevo.agregarProducto(prod, cantidad); /* si esta todo ok agrega el producto */
        prod.setStock(prod.getStock() - cantidad); /* descuenta del stock la cantidad */
    }

    pedidos.add(nuevo);
    System.out.println("Pedido creado exitosamente:\n" + nuevo);
}
        }
    

/*esta clase organiza todas las operaciones realizadas dentro del menu
 * los metodos son static para ser usados por las demas clases */
 
 

