package inicio;

/*se agrega la palabra extends luego 
el nombre de la clase de la que hereda 
en este caso de la clase alumno */
public class Profesor extends Alumno {
    int legajo;
    String cargo;
    Double sueldo;
    
    public Profesor(){
    }
    public Profesor(int legajo, String cargo, Double sueldo, int id, String nombre, String apellido){
        /*palabra reservada super, para llamar a la clase 
        madre "alumno" para heredar sus datos */
        super(id, nombre, apellido);
        this.legajo = legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    /*ahora crear los getters y setters de profesor */
    
    public int getLegajo(){
        return legajo;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }

        public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public Double getSueldo(){
        return sueldo;
    }
    public void setSueldo(Double sueldo){
        this.sueldo = sueldo;
    }
}

