package inicio;

public class inicio {
    public static void main(String[] args) {

        Alumno alum1 = new Alumno();
        Alumno alum2 = new Alumno(2, "Carla", "Gutierrez");

System.out.println("La id del alumno 2 es: " + alum2.getId());
System.out.println("El nombre del alumno 2 es: " + alum2.getNombre());
System.out.println("El apellido del alumno 2 es: " + alum2.getApellido());

/*setear el alu1 que estaba vacio, 
osea cargarle datos */
alum1.setId(3);
alum1.setNombre("Mauro");
alum1.setApellido("Gutierrez");
System.out.println("-------------");

System.out.println("La id del alumno 1 es: " + alum1.getId());
System.out.println("El nombre del alumno 1 es: " + alum1.getNombre());
System.out.println("El apellido del alumno 1 es: " + alum1.getApellido());

/*el Set sirve para modificar datos
 * voy a modificar el id del alumno 2
 */
alum2.setId(35);
/*mostrar el nuevo id */
System.out.println("El nuevo id del alumno 1 es: " + alum2.getId());


/* **********HERENCIAS*************  */
/*Cargo el legajo del profesor */
Profesor profe = new Profesor();
profe.setLegajo(22);
System.out.println("el legajo de profesor es: " + profe.getLegajo());

/*CARGANDO LA HERENCIA QUE HEREDO LA CLASE 
"PROFESOR" DE "ALUMNO" EN ESTE CASO ID */
profe.setId(11);
/*PROBANDO SI CARGO */
System.out.println("el id de profesor es: " + profe.getId());


    }
    }
        