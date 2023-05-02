package paquete1;

import paquete2.EquivalenteHora;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo EquivalenteHora
        EquivalenteHora equ = new EquivalenteHora();
        
        // Valores a establecer
        double horas = 36;
        
        // Usar métodos establecer para darle valores a los atributos
        equ.estalecerHoras(horas);
        
        // Llamar a los métodos correspondientes para calcular el equivalente
        // de las horas establecidas en minutos, segundos y días
        equ.establecerMinutos();
        equ.establecerSegundos();
        equ.establecerDias();
        
        // Imprimir los datos con los métodos obtener
        System.out.printf("Equivalencia de Horas\n\nHoras: %.1fh\n"
                + "%.1fh en Minutos: %.1f min\n%.1fh en Segundos: %.1f seg\n"
                + "%.1fh en Días: %.1f días\n",equ.obtenerHoras()
                ,equ.obtenerHoras(),equ.obtenerMinutos()
                ,equ.obtenerHoras(),equ.obtenerSegundos()
                ,equ.obtenerHoras(),equ.obtenerDias());
    }
    
}
