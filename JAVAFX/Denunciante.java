package ProgramaDenuncia;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Denunciante {
    private String nombreCompleto;
    private int numeroID;
    private String direccionDomicilio;
    private String tipoDenuncia;
    private String sexo;


    public Denunciante(String nombreCompleto, int numeroID, String direccionDomicilio, String tipoDenuncia,
            String sexo) {
        this.nombreCompleto = nombreCompleto;
        this.numeroID = numeroID;
        this.direccionDomicilio = direccionDomicilio;
        this.tipoDenuncia = tipoDenuncia;
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto + ", ID: " + numeroID + ", Dirección: " + direccionDomicilio + ", Tipo de denuncia: " + tipoDenuncia + ", Sexo: " + sexo;
    
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


    public String getTipoDenuncia() {
        return tipoDenuncia;
    }


    public void setTipoDenuncia(String tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}
