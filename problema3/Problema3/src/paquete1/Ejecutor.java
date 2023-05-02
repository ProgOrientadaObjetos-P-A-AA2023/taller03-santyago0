package paquete1;

import paquete2.InstitucionEducativa;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo InstitucionEducativa
        InstitucionEducativa esc = new InstitucionEducativa();
        
        // Valores a establecer
        String nombre = "Calasanz";
        String tipoInstitucion = "Fiscomisional";
        int numeroAlumnos = 2000;
        int numeroDocentes = 100;
        int numeroSedes = 1;
        int gastoProyectadoEstudiante = 48;
        
        // Usar métodos establecer para darle valores a los atributos
        esc.establecerNombre(nombre);
        esc.establecerTipoInstitucion(tipoInstitucion);
        esc.establecerNumeroAlumnos(numeroAlumnos);
        esc.establecerNumeroDocentes(numeroDocentes);
        esc.establecerNumeroSedes(numeroSedes);
        esc.establecerGastoProyectadoEstudiante(gastoProyectadoEstudiante);
        
        // Llamar a los métodos correspondientes para calcular el presupuesto
        esc.calcularPresupuesto();
        
        // Imprimir los datos con los métodos obtener
        System.out.printf("Institución Educativa\n\nNombre: %s\n"
                + "Tipo de Institución: %s\nNúmero de Alumnos: %d\n"
                + "Número de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectados por Estudiantes: $%d\n---------"
                + "------------------------------\nPresupuesto: $%d\n"
                ,esc.obtenerNombre(),esc.obtenerTipoInstitucion()
                ,esc.obtenerNumeroAlumnos(),esc.obtenerNumeroDocentes()
                ,esc.obtenerNumeroSedes(),esc.obtenerGastoProyectadoEstudiante()
                ,esc.obtenerPresupuesto());
    }
    
}
