package paquete1;

import paquete2.EquivalenteHora;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear objetos de tipo EquivalenteHora
        EquivalenteHora equ = new EquivalenteHora();
        EquivalenteHora equ2 = new EquivalenteHora();
        
        // Valores a establecer
        double horas = 36;
        
        double horas2 = 72;
        
        // Usar métodos establecer para darle valores a los atributos
        equ.estalecerHoras(horas);
        
        equ2.estalecerHoras(horas2);
        
        // Llamar a los métodos correspondientes para calcular el equivalente
        // de las horas establecidas en minutos, segundos y días
        equ.establecerMinutos();
        equ.establecerSegundos();
        equ.establecerDias();
        
        equ2.establecerMinutos();
        equ2.establecerSegundos();
        equ2.establecerDias();
        
        // Imprimir los datos con los métodos obtener
        System.out.printf("Equivalencia de Horas\n\nHoras: %.1fh\n"
                + "%.1fh en Minutos: %.1f min\n%.1fh en Segundos: %.1f seg\n"
                + "%.1fh en Días: %.1f días\n",equ.obtenerHoras()
                ,equ.obtenerHoras(),equ.obtenerMinutos()
                ,equ.obtenerHoras(),equ.obtenerSegundos()
                ,equ.obtenerHoras(),equ.obtenerDias());
        
        System.out.println("\n\n");
        
        System.out.printf("Equivalencia de Horas\n\nHoras: %.1fh\n"
                + "%.1fh en Minutos: %.1f min\n%.1fh en Segundos: %.1f seg\n"
                + "%.1fh en Días: %.1f días\n",equ2.obtenerHoras()
                ,equ2.obtenerHoras(),equ2.obtenerMinutos()
                ,equ2.obtenerHoras(),equ2.obtenerSegundos()
                ,equ2.obtenerHoras(),equ2.obtenerDias());
    }
    
}
