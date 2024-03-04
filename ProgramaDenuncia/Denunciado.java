package ProgramaDenuncia;

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
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public int getNumeroID() {
        return numeroID;
    }
    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }
    public String getSexo() {
        return sexo;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }
    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    


}
