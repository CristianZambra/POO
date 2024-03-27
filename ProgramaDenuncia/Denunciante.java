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






}
