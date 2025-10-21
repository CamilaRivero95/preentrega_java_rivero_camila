package inicio;

public class Producto extends Item{

   private Double precio;
   private int stock;
   private Categoria categoria;
    
    /*Creo un metodo constructor con atributos */

    public Producto(String nombre, Double precio, int stock, Categoria categoria){
        super(nombre);
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    /*Creo los getters y los setters */

    public Double getPrecio(){
        return precio;
    }
      public void setPrecio(Double precio){
        this.precio = precio;
    }

    public int getStock(){
        return stock;
    }
      public void setStock(int stock){
        this.stock = stock;
    }
    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    @Override
    public String getDetalle() {
        return "Producto: " + getNombre() +
               " | Precio: " + precio +
               " | Stock: " + stock +
               " | Categoría: " + categoria.getNombre();
    }

    @Override
    public String toString() {
        return "Producto{" + super.toString() +
               ", Precio=" + precio +
               ", Stock=" + stock +
               ", Categoria=" + categoria.getNombre() + "}";
    }

}




/*COMENTARIOS */
/*para la variable categoria, el tipo de dato es Categoria, que es una clase
personalizada, no es un numero, ni texto, ni caracter. es de tipo
privada y le va a permitir a "Producto" guardar la categoria a la que
pertenece*/

/*Extends osea hereda de la clase padre "ITEMS" los atributos: id y nombre, 
y el metodo toString */

/*al metodo constructor se le pasa automaticamente el nombre 
a traves de super(nombre) y tambien el id */

/*esta obligado a usar el metodo abstracto getDetalle() declarado en la
  clase Items para mostrar un resumen del producto */


