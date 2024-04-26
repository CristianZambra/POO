package ProgramaDenuncia;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Denunciado {
    private String nombreCompleto;
    private int numeroID;
    private String direccionDomicilio;
    private String sexo;

    public Denunciado(String nombreCompleto, int numeroID, String direccionDomicilio, String sexo) {
        this.nombreCompleto = nombreCompleto;
        this.numeroID = numeroID;
        this.direccionDomicilio = direccionDomicilio;
        this.sexo = sexo;
    }


@Override
    public String toString() {
        return "Nombre: " + nombreCompleto + ", ID: " + numeroID + ", Dirección: " + direccionDomicilio + ", Sexo: " + sexo;
    }


public String getNombreCompleto() {
    return nombreCompleto;
}


public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
}


public int getNumeroID() {
    return numeroID;
}


public void setNumeroID(int numeroID) {
    this.numeroID = numeroID;
}


public String getDireccionDomicilio() {
    return direccionDomicilio;
}


public void setDireccionDomicilio(String direccionDomicilio) {
    this.direccionDomicilio = direccionDomicilio;
}


public String getSexo() {
    return sexo;
}


public void setSexo(String sexo) {
    this.sexo = sexo;
}


}
