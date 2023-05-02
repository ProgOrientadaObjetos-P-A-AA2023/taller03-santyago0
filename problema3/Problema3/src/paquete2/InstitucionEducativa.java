package paquete2;

/**
 *
 * @author santy
 */
public class InstitucionEducativa {
    // Atributos
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private int gastoProyectadoEstudiante;
    private int presupuesto;
    
    //Métodos establecer
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerTipoInstitucion(String x){
        tipoInstitucion = x;
    }
    
    public void establecerNumeroAlumnos(int x){
        numeroAlumnos = x;
    }
    
    public void establecerNumeroDocentes(int x){
        numeroDocentes = x;
    }
    
    public void establecerNumeroSedes(int x){
        numeroSedes = x;
    }
    
    public void establecerGastoProyectadoEstudiante(int x){
        gastoProyectadoEstudiante = x;
    }
    
    public void calcularPresupuesto(){
        presupuesto = numeroAlumnos*gastoProyectadoEstudiante;
    }
    
    //Mátodos obtener
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    
    public int obtenerGastoProyectadoEstudiante(){
        return gastoProyectadoEstudiante;
    }
    
    public int obtenerPresupuesto(){
        return presupuesto;
    }
    
}
