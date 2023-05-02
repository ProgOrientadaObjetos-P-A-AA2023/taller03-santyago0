package paquete2;

/**
 *
 * @author santy
 */
public class EquivalenteHora {
    // Atributos
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    // Métodos establecer
    public void estalecerHoras(double x){
        horas = x;
    }
    
    public void establecerMinutos(){
        minutos = horas*60;
    }
    
    public void establecerSegundos(){
        segundos = minutos*60;
    }
    
    public void establecerDias(){
        dias = horas/24;
    }
    
    // Métodos obtener
    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerSegundos(){
        return segundos;
    }
    
    public double obtenerDias(){
        return dias;
    }
    
}
