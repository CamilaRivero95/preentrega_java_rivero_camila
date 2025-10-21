package inicio;

import java.util.ArrayList;

public class Pedido {
    private static int contadorId = 0;
    private final int id;
    private ArrayList<ProductoPedido> items;
    private double total;

    public Pedido() {
        this.id = ++contadorId;
        this.items = new ArrayList<ProductoPedido>();
    }

    public int getId() {
        return id;
    }



    public void agregarProducto(Producto producto, int cantidad) {
        ProductoPedido item = new ProductoPedido(producto, cantidad);
        items.add(item);
        total = total + item.getSubtotal();
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
       String resultado = "Pedido ID: " + id + "\nProductos:\n";

    for (ProductoPedido item : items) {
        resultado += " - " + item + "\n";
    }

    resultado += "Total: $" + total + "\n";

    return resultado;
    }
}

/*contadorId lleva la cuenta de los pedidos generados, se va incrementando
 con nada pedido*/
 /*id unico e inmutable para cada pedido */
 /*ArrayList<ProductoPedido> inicia una lista vacia para cargar los pedidos */
 /*metodo publico para agregar porducto, tiene como parametros producto y cantidad */
 /*se usa un for each para recorrer el arraylist items */
 /*get.subtotal llama al metodo creado en l clase ProductoPedido */