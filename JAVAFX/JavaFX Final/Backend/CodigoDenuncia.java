package ProgramaDenuncia;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ancerrato
 */
class CodigoDenuncia {
    private int codigo;

    public CodigoDenuncia(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
 
    
    
}
