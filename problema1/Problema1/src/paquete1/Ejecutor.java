package paquete1;

import paquete2.Terreno;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear objetos de tipo terreno
        Terreno terr = new Terreno();
        Terreno terr2 = new Terreno();
        
        // Valores a establecer
        int ancho = 700;
        int largo = 1100;
        double valorMetroCuadrado = 569.99;
        
        int ancho2 = 400;
        int largo2 = 950;
        double valorMetroCuadrado2 = 299.50;
        
        // Usar métodos establecer para darle valores a los atributos
        terr.establecerAncho(ancho);
        terr.establecerLargo(largo);
        terr.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        terr2.establecerAncho(ancho2);
        terr2.establecerLargo(largo2);
        terr2.establecerValorMetroCuadrado(valorMetroCuadrado2);
        
        // Llamar al método correspondiente para calcular el área del terreno
        // y el costo del terreno
        terr.establecerArea();
        terr.calcularCosto_terreno();
        
        terr2.establecerArea();
        terr2.calcularCosto_terreno();
        
        // Imprimir los datos con los métodos obtener
        System.out.printf("Costo de un Terreno\n\nAncho del terreno: %d m\n"
                + "Largo del terreno: %d m\nÁrea del terreno: %d m2\n"
                + "Valor por metro cuadrado: $%.2f\n-----------------------"
                + "----------\nCosto final: $%.2f\n",terr.obtenerAncho()
                ,terr.obtenerLargo(),terr.obtenerArea()
                ,terr.obtenerValorMetroCuadrado()
                ,terr.obtenerCosto_terreno());
        
        System.out.println("\n\n");
        
        System.out.printf("Costo de un Terreno\n\nAncho del terreno: %d m\n"
                + "Largo del terreno: %d m\nÁrea del terreno: %d m2\n"
                + "Valor por metro cuadrado: $%.2f\n-----------------------"
                + "----------\nCosto final: $%.2f\n",terr2.obtenerAncho()
                ,terr2.obtenerLargo(),terr2.obtenerArea()
                ,terr2.obtenerValorMetroCuadrado()
                ,terr2.obtenerCosto_terreno());
    }
    
}
