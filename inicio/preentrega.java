package inicio;
import java.util.Scanner;
import java.util.ArrayList;

public class preentrega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    /*crear un metodo/funcion */
   
    
   

    
/*Creo un array comun y le asigno 3 elementos */
        String [] soyunarray = new String[3];
        soyunarray[0] = "manteca";
        soyunarray[1] = "dulce";
        soyunarray[2] = "choco";

/*Una forma de imprimir con for y length */
        for(int i=0; i < soyunarray.length; i++){
            System.out.println(soyunarray[i]);
        }
/*Otra forma de imprimir con for */
        for(int i=0; i < 3; i++){
            System.out.println(soyunarray[i]);
        }
        
  /*Creo un ArrayList */
  ArrayList<String> soyunarraylist = new ArrayList<>();
  soyunarraylist.add("River");
  soyunarraylist.add("Racing");
  soyunarraylist.add("Velez");

/*Asi se itera la lista, osea se accede y se muestra */
   
for(String mostrar : soyunarraylist ){
            System.out.println(mostrar);
        }

        /*Volvi a agregar otro elemento*/
soyunarraylist.add("patronato");
for(String mostrar : soyunarraylist ){
            System.out.println(mostrar);
        }
        
        /*Creo un array "Productos y asigno los elementos" */
        ArrayList<String> arrayProductos = new ArrayList<>();
        arrayProductos.add("Harina 000");
        arrayProductos.add("Harina Leudante");
        arrayProductos.add("Fideos Moñitos");
        arrayProductos.add("Manteca Sancor");

        for(String mostrar : arrayProductos){
            System.out.println(mostrar);
        }
        /*Eliminar un producto por objeto*/
        arrayProductos.remove("Harina Leudante");
        for(String mostrar : arrayProductos){
            System.out.println(mostrar);
        }
        /*Eliminar producto por indice */
        arrayProductos.remove(1);
        for(String mostrar : arrayProductos){
            System.out.println(mostrar);
        }
        /*En posicion 1 estaba "Fideo Moñitos" 
        ya que en el anterior elimine a otro */


        /*Usar .get para obtener un elemento 
        de una posicion */

        System.out.println(soyunarraylist.get(0));

        /*Verificar si existe un producto */
        if(soyunarraylist.contains("River")){
            System.out.println("Si existe River");
        } else{
            System.out.println("No existe River");
        }

        /*Verificar si existe un producto preguntando al usuario*/
        System.out.println("Que equipo desea verificar: ");
        
        String existe = scanner.nextLine();
        if(soyunarraylist.contains(existe)){
            System.out.println("Si existe " + existe);
        } else{
            System.out.println("No existe " + existe);
        }
        /* Mostrar longuitud de la cadena*/
        String cadena = " te CHAi";
        System.out.println("La longuitud es: " + cadena.length());
        /* Mostrar la primera letra */
        System.out.println("La primer letra es: " + cadena.charAt(1));
        /*pasar a minuscula y borrar espacios*/    
        String cadenaSinEspacios = cadena.trim();
        String cadenaMinuscula = cadenaSinEspacios.toLowerCase();         
        System.out.println("La cadena contine:" + cadenaMinuscula);
        /*pasar primer letra de cada palabra a mayuscula */
        /*Creo el string resultado vacio ahi donde voy a guardar mi nueva cadena */
        String resultado= "";
        /*creo mi cadena */
        String [] palabras= cadenaMinuscula.split(" ");
        for(int i=0; i<palabras.length; i++){
            String palabra =palabras[i];
            String inicial = palabra.substring(0,1);
            String palabraRestante = palabra.substring(1);
            resultado += inicial.toUpperCase() + palabraRestante + " ";
           
        }
        System.out.println(resultado);
      
        /*crea un array de 5 productos */
        String [] array2 = new String[5];
        array2[0] ="rojo";
        array2[1] ="verde";
        array2[2] ="amarillo";
        array2[3] ="naranja";
        array2[4] ="violeta";

        for(int i=0; i<array2.length; i++){
            System.out.println(array2[i]);
        }





    }

    }

    
