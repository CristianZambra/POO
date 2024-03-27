package ProgramaDenuncia;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ancerrato
 */
class Denuncia {
      private String tipoDenuncia;
    private String descripcionDenuncia;
    private String fechaHora;
    private String agenteEncargado;
    private String informacionOfensor;
    private String estadoDenuncia;
    private String crimenesPrevios;
    private CodigoDenuncia codigoDenuncia;

    public Denuncia(String tipoDenuncia, String descripcionDenuncia, String fechaHora, String agenteEncargado, String informacionOfensor, String estadoDenuncia, String crimenesPrevios, CodigoDenuncia codigoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
        this.descripcionDenuncia = descripcionDenuncia;
        this.fechaHora = fechaHora;
        this.agenteEncargado = agenteEncargado;
        this.informacionOfensor = informacionOfensor;
        this.estadoDenuncia = estadoDenuncia;
        this.crimenesPrevios = crimenesPrevios;
        this.codigoDenuncia = codigoDenuncia;
    }
    

    @Override
    public String toString() {
        return "Tipo de denuncia: " + tipoDenuncia + ", Descripción: " + descripcionDenuncia + ", Fecha y hora: " + fechaHora + ", Agente encargado: " + agenteEncargado + ", Información del ofensor: " + informacionOfensor + ", Estado de denuncia: " + estadoDenuncia + ", Crímenes previos: " + crimenesPrevios + ", Código de denuncia: " + codigoDenuncia.getCodigo();
    }

    public String getTipoDenuncia() {
        return tipoDenuncia;
    }

    public String getDescripcionDenuncia() {
        return descripcionDenuncia;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getAgenteEncargado() {
        return agenteEncargado;
    }

    public String getInformacionOfensor() {
        return informacionOfensor;
    }

    public String getEstadoDenuncia() {
        return estadoDenuncia;
    }

    public String getCrimenesPrevios() {
        return crimenesPrevios;
    }

    public CodigoDenuncia getCodigoDenuncia() {
        return codigoDenuncia;
    }

    public void setTipoDenuncia(String tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public void setDescripcionDenuncia(String descripcionDenuncia) {
        this.descripcionDenuncia = descripcionDenuncia;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setAgenteEncargado(String agenteEncargado) {
        this.agenteEncargado = agenteEncargado;
    }

    public void setInformacionOfensor(String informacionOfensor) {
        this.informacionOfensor = informacionOfensor;
    }

    public void setEstadoDenuncia(String estadoDenuncia) {
        this.estadoDenuncia = estadoDenuncia;
    }

    public void setCrimenesPrevios(String crimenesPrevios) {
        this.crimenesPrevios = crimenesPrevios;
    }

    public void setCodigoDenuncia(CodigoDenuncia codigoDenuncia) {
        this.codigoDenuncia = codigoDenuncia;
    }
    
    
    
}