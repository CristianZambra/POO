package ProgramaDenuncia;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ancerrato
 */
class Crimenes {
   private String nombre;
    private String descripcion;

    public Crimenes(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
 
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Descripción: " + descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
