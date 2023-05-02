package paquete1;

import paquete2.EquipoCelular;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo EquipoCelular
        EquipoCelular cel = new EquipoCelular();
        
        // Valores a establecer
        String sistemaOperativo = "Android";
        double tamanioPantalla = 6.4;
        double costoInicial = 292.96;
        String ivaPorcentaje = "27,05%";
        double ivaCostoInicial = 79.25;
        String direccionMac = "0C:8D:CA:78:47:B7";
        String infoIMEI = "350579457199775";
        
        // Usar métodos establecer para darle valores a los atributos
        cel.establecerSistemaOperativo(sistemaOperativo);
        cel.establecerTamanioPantalla(tamanioPantalla);
        cel.establecerCostoInicial(costoInicial);
        cel.establecerIvaPorcentaje(ivaPorcentaje);
        cel.establecerIvaCostoIncial(ivaCostoInicial);
        cel.establecerDireccionMac(direccionMac);
        cel.establecerInfoIMEI(infoIMEI);
        
        // Llamar a los métodos correspondientes para calcular el presupuesto
        cel.calcularCostoFinal();
        
        // Imprimir los datos con los métodos obtener
        System.out.printf("Equipo Celular\n\nSistema Operativo: %s\n"
                + "Tamaño de la Pantalla: %.1f''\nCosto Inicial: $%.2f\n"
                + "Porcentaje del iva: %s\nCosto del iva Inicial: $%.2f\n"
                + "Dirección MAC: %s\nInformación IMEI: %s\n---------"
                + "------------------------\nCosto Final: $%.2f\n"
                ,cel.obtenerSistemaOperativo(),cel.obtenerTamanioPantalla()
                ,cel.obtenerCostoInicial(),cel.obtenerIvaPorcentaje()
                ,cel.obtenerIvaCostoInicial(),cel.obtenerDireccionMac()
                ,cel.obtenerInfoIMEI(),cel.obtenerCostoFinal());
    }
    
}
