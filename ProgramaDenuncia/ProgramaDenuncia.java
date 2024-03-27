package ProgramaDenuncia;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ProgramaDenuncia {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    //Datos de Crimenes previos
    Crimen crimen1 = new Crimen("Asesinato", "Descripción del asesinato");
    Crimen crimen2 = new Crimen("Robo", "Descripción del robo");
    Crimen crimen3 = new Crimen("Violencia doméstica", "Descripción de la violencia doméstica");
    String crimenesPrevios = crimen1.toString() + ", " + crimen2.toString() + ", " + crimen3.toString();


    //Codigo de la Denuncia
    CodigoDenuncia codigoDenuncia = new CodigoDenuncia(123456);

    //Datos solicitados el Denunciante
    System.out.println("Ingrese los datos del denunciante:");
    System.out.print("Nombre completo: ");
    String nombreDenunciante = scanner.nextLine();
    System.out.print("Número de ID: ");
    int idDenunciante = Integer.parseInt(scanner.nextLine());
    System.out.print("Dirección de domicilio: ");
    String direccionDenunciante = scanner.nextLine();
    System.out.print("Tipo de denuncia: ");
    String tipoDenunciaDenunciante = scanner.nextLine();
    System.out.print("Sexo: ");
    String sexoDenunciante = scanner.nextLine();









}

}
