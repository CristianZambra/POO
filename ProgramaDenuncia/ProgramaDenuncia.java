package ProgramaDenuncia;

import java.util.Scanner;


public class ProgramaDenuncia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos para los crimenes previos
        Crimen crimen1 = new Crimen("Asesinato", "Descripción del asesinato");
        Crimen crimen2 = new Crimen("Robo", "Descripción del robo");
        Crimen crimen3 = new Crimen("Violencia doméstica", "Descripción de la violencia doméstica");
        String crimenesPrevios = crimen1.toString() + ", " + crimen2.toString() + ", " + crimen3.toString();


       // Datos para oficial encargado
       String ooficialencargado = "Oficial Mario";


       // Datos para el codigo de denuncia
       CodigoDenuncia codigoDenuncia = new CodigoDenuncia(2569);



       // Solicitar datos del ofendido
        // Solicitar datos del denunciante
         // Solicitar datos del denunciante
         System.out.println("Ingrese los datos del denunciante:");
         System.out.print("Nombre completo: ");
         String nombreDenunciante = scanner.nextLine();
          System.out.print("Número de ID: ");

        
    }
}
