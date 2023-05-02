package paquete2;

/**
 *
 * @author santy
 */
public class EquipoCelular {
    // Atributos
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private String ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String infoIMEI;
    
    // Métodos establecer
    public void establecerSistemaOperativo(String x){
        sistemaOperativo = x;
    }
    
    public void establecerTamanioPantalla(double x){
        tamanioPantalla = x;
    }
    
    public void establecerCostoInicial(double x){
        costoInicial = x;
    }
    
    public void establecerIvaPorcentaje(String x){
        ivaPorcentaje = x;
    }
    
    public void establecerIvaCostoIncial(double x){
        ivaCostoInicial = x;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public void establecerDireccionMac(String x){
        direccionMac = x;
    }
    
    public void establecerInfoIMEI(String x){
        infoIMEI = x;
    }
    
    // Métodos obtener
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public double obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public String obtenerIvaPorcentaje(){
        return ivaPorcentaje;
    }
    
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    
    public String obtenerInfoIMEI(){
        return infoIMEI;
    }
    
}
