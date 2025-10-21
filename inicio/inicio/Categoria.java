package inicio;
public class Categoria extends Item{



public Categoria(String nombre){
    super(nombre);
  
}

@Override
public String getDetalle(){
    return "Categoria: " + getNombre();
}
@Override public String toString(){
    return "Categoria" + super.toString();
}
}

/*COMENTARIOS */
/*extends extiende la clase items, hereda nombre e id */
/*getDetalle definido en items devuelve la categoria por su nombre */
