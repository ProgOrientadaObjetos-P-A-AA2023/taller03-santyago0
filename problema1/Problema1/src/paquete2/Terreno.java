package paquete2;

/**
 *
 * @author santy
 */
public class Terreno {
    // Atributos
    private double costo_terreno;
    private int ancho;
    private int largo;
    private int area;
    private double valorMetroCuadrado;
    
    // Métodos establecer
    public void calcularCosto_terreno(){
        costo_terreno = valorMetroCuadrado*area;
    }
    
    public void establecerAncho(int x){
        ancho = x;
    }
    
    public void establecerLargo(int x){
        largo = x;
    }
    
    public void establecerArea(){
        area = ancho*largo;
    }
    
    public void establecerValorMetroCuadrado(double x){
        valorMetroCuadrado = x; 
    }
    
    // Métodos obtener
    public double obtenerCosto_terreno(){
        return costo_terreno;
    }
    
    public int obtenerAncho(){
        return ancho;
    }
    
    public int obtenerLargo(){
        return largo;
    }
    
    public int obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
}
