package ProgramaDenuncia;

public class Denuncia {
    private String tipoDenuncia;
    private String descripcionDenuncia;
    private String fechaHora;
    private String oficialencargado;
    private String informacionOfensor;
    private String estadoDenuncia;
    private String crimenesPrevios;
    private CodigoDenuncia codigoDenuncia;
    
    public Denuncia(String tipoDenuncia, String descripcionDenuncia, String fechaHora, String oficialencargado,
            String informacionOfensor, String estadoDenuncia, String crimenesPrevios, CodigoDenuncia codigoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
        this.descripcionDenuncia = descripcionDenuncia;
        this.fechaHora = fechaHora;
        this.oficialencargado = oficialencargado;
        this.informacionOfensor = informacionOfensor;
        this.estadoDenuncia = estadoDenuncia;
        this.crimenesPrevios = crimenesPrevios;
        this.codigoDenuncia = codigoDenuncia;
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

    public String getOficialencargado() {
        return oficialencargado;
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

    public void setOficialencargado(String oficialencargado) {
        this.oficialencargado = oficialencargado;
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