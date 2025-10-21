package inicio;

public class ProductoPedido {
    private Producto producto;
    private int cantidad;

    public ProductoPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }


    public double getSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return producto.getNombre() + " x" + cantidad + " = $" + getSubtotal();
    }
}

/*COMENTARIOS */
/*la clase pedido sirve para crear un items de forma individual
 con su cantidad y el subtotal */
/*el constructor inicia con un producto y su cantidad*/
/*no hay setter para evitar modificar el pedido una vez creado
 * se crea el metodo subtotal utilizado luego en la clase pedido
 /*toString muestra los datos de forma mas legible*/