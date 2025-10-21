package inicio;

public abstract class Item {

    private static int contadorId = 0;
    private final int id;
    private String nombre;

    public Item(String nombre) {
        this.id = ++contadorId;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getDetalle();

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre;
    }
  
}
    
/* COMENTARIOS */

/* Items es una clase abstracta para ser heredada por las otras clases hijas*/

 /* las subclases estan obligadas a implementar el metodo abstracto getDetalle */

 /* El contador utiliza una variable estatica para que sea compartida por las subclases 
 se usa para generar automaticamente un Id unico para cada objeto*/

 /* el FINAL en el atributo id es para que sea unico y no se modifique */

 /*es PRIVATE para que solo se pueda acceder dentro de la clase Items */

 /* el nombre puede cambiarse mediante su setter */

 /*Se crea un constructor que recibe un nombre como parametro */

 /*getDetalle es el metodo abstracto, no se usa dentro de esta clase
  pero si en las demas clases hijas
  */

