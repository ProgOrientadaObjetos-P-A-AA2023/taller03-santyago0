package paquete1;

import paquete2.InstitucionEducativa;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear objetos de tipo InstitucionEducativa
        InstitucionEducativa esc = new InstitucionEducativa();
        InstitucionEducativa esc2 = new InstitucionEducativa();
        
        // Valores a establecer
        String nombre = "Calasanz";
        String tipoInstitucion = "Fiscomisional";
        int numeroAlumnos = 2000;
        int numeroDocentes = 100;
        int numeroSedes = 1;
        int gastoProyectadoEstudiante = 48;
        
        String nombre2 = "APC";
        String tipoInstitucion2 = "Privado";
        int numeroAlumnos2 = 1500;
        int numeroDocentes2 = 80;
        int numeroSedes2 = 1;
        int gastoProyectadoEstudiante2 = 100;
        
        // Usar métodos establecer para darle valores a los atributos
        esc.establecerNombre(nombre);
        esc.establecerTipoInstitucion(tipoInstitucion);
        esc.establecerNumeroAlumnos(numeroAlumnos);
        esc.establecerNumeroDocentes(numeroDocentes);
        esc.establecerNumeroSedes(numeroSedes);
        esc.establecerGastoProyectadoEstudiante(gastoProyectadoEstudiante);
        
        esc2.establecerNombre(nombre2);
        esc2.establecerTipoInstitucion(tipoInstitucion2);
        esc2.establecerNumeroAlumnos(numeroAlumnos2);
        esc2.establecerNumeroDocentes(numeroDocentes2);
        esc2.establecerNumeroSedes(numeroSedes2);
        esc2.establecerGastoProyectadoEstudiante(gastoProyectadoEstudiante2);
        
        // Llamar a los métodos correspondientes para calcular el presupuesto
        esc.calcularPresupuesto();
        esc2.calcularPresupuesto();
        
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
        
        System.out.println("\n\n");
        
        System.out.printf("Institución Educativa\n\nNombre: %s\n"
                + "Tipo de Institución: %s\nNúmero de Alumnos: %d\n"
                + "Número de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectados por Estudiantes: $%d\n---------"
                + "------------------------------\nPresupuesto: $%d\n"
                ,esc2.obtenerNombre(),esc2.obtenerTipoInstitucion()
                ,esc2.obtenerNumeroAlumnos(),esc2.obtenerNumeroDocentes()
                ,esc2.obtenerNumeroSedes(),esc2.obtenerGastoProyectadoEstudiante()
                ,esc2.obtenerPresupuesto());
    }
    
}
