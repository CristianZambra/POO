package ProgramaDenuncia;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ProgramaDenuncia {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Datos del Agente
    String agenteEncargado = "Agente Zambrano";

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

    //Instancia de Denunciante
    Denunciante denunciante = new Denunciante(nombreDenunciante, idDenunciante, direccionDenunciante, tipoDenunciaDenunciante, sexoDenunciante);


    //Datos del Denunciado
    System.out.println("\nIngrese los datos del denunciado:");
    System.out.print("Nombre completo: ");
    String nombreDenunciado = scanner.nextLine();
    System.out.print("Número de ID: ");
    int idDenunciado = Integer.parseInt(scanner.nextLine());
    System.out.print("Dirección de domicilio: ");
    String direccionDenunciado = scanner.nextLine();
    System.out.print("Sexo: ");
    String sexoDenunciado = scanner.nextLine();

    //Instancia del Denunciado   
    Denunciado denunciado = new Denunciado(nombreDenunciado, idDenunciado, direccionDenunciado, sexoDenunciado);

    //Datos de la Denuncia
    System.out.println("\nIngrese los datos de la denuncia:");
    System.out.print("Tipo de denuncia: ");
    String tipoDenunciaDenuncia = scanner.nextLine();
    System.out.print("Descripción de la denuncia: ");
    String descripcionDenuncia = scanner.nextLine();

    //Instancia Denuncia
    Denuncia denuncia = new Denuncia(tipoDenunciaDenuncia, descripcionDenuncia, fechaHora, agenteEncargado, nombreDenunciado, "En proceso", crimenesPrevios, codigoDenuncia);

     //Fecha y Hora
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String fechaHora = now.format(formatter);


    System.out.println("\nInformación de la denuncia:");
    System.out.println(denuncia.toString());


    scanner.close();


}

}
