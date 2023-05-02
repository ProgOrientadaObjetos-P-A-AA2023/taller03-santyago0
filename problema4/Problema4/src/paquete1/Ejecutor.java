package paquete1;

import paquete2.EquipoCelular;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear objetos de tipo EquipoCelular
        EquipoCelular cel = new EquipoCelular();
        EquipoCelular cel2 = new EquipoCelular();
        
        // Valores a establecer
        String sistemaOperativo = "Android";
        double tamanioPantalla = 6.4;
        double costoInicial = 292.96;
        String ivaPorcentaje = "27,05%";
        double ivaCostoInicial = 79.25;
        String direccionMac = "0C:8D:CA:78:47:B7";
        String infoIMEI = "350579457199775";
        
        String sistemaOperativo2 = "IOS";
        double tamanioPantalla2 = 5.9;
        double costoInicial2 = 859.99;
        String ivaPorcentaje2 = "27,05%";
        double ivaCostoInicial2 = 232.63;
        String direccionMac2 = "2A:9B:DF:61:69:H7";
        String infoIMEI2 = "490087382189929";
        
        // Usar métodos establecer para darle valores a los atributos
        cel.establecerSistemaOperativo(sistemaOperativo);
        cel.establecerTamanioPantalla(tamanioPantalla);
        cel.establecerCostoInicial(costoInicial);
        cel.establecerIvaPorcentaje(ivaPorcentaje);
        cel.establecerIvaCostoIncial(ivaCostoInicial);
        cel.establecerDireccionMac(direccionMac);
        cel.establecerInfoIMEI(infoIMEI);
        
        cel2.establecerSistemaOperativo(sistemaOperativo2);
        cel2.establecerTamanioPantalla(tamanioPantalla2);
        cel2.establecerCostoInicial(costoInicial2);
        cel2.establecerIvaPorcentaje(ivaPorcentaje2);
        cel2.establecerIvaCostoIncial(ivaCostoInicial2);
        cel2.establecerDireccionMac(direccionMac2);
        cel2.establecerInfoIMEI(infoIMEI2);
        
        // Llamar a los métodos correspondientes para calcular el presupuesto
        cel.calcularCostoFinal();
        cel2.calcularCostoFinal();
        
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
        
        System.out.println("\n\n");
        
        System.out.printf("Equipo Celular\n\nSistema Operativo: %s\n"
                + "Tamaño de la Pantalla: %.1f''\nCosto Inicial: $%.2f\n"
                + "Porcentaje del iva: %s\nCosto del iva Inicial: $%.2f\n"
                + "Dirección MAC: %s\nInformación IMEI: %s\n---------"
                + "------------------------\nCosto Final: $%.2f\n"
                ,cel2.obtenerSistemaOperativo(),cel2.obtenerTamanioPantalla()
                ,cel2.obtenerCostoInicial(),cel2.obtenerIvaPorcentaje()
                ,cel2.obtenerIvaCostoInicial(),cel2.obtenerDireccionMac()
                ,cel2.obtenerInfoIMEI(),cel2.obtenerCostoFinal());
    }
    
}
