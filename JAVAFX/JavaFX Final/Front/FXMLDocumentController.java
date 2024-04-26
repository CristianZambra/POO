/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 *
 * @author crist
 */
public class FXMLDocumentController implements Initializable {
    
    
  //PANTALLA #1
    
    @FXML
    private TextField textField1;
    
    @FXML
    private TextArea textAread1;
    
    @FXML
    private TextField textField3;
    
    @FXML
    private TextField textField4;
    
    @FXML
    private TextField textField5;
    
    @FXML
    private TextField textField6;
    
    @FXML
    private TextField textField7;
    
    @FXML
    //Boton Guardar Pantalla 1
    private Button guardar1;
    
   @FXML
    //Boton Cancelar Pantalla 1
    private Button cancelar1;
    
    
   
    @FXML
    //Action de Boton Guardar Pantalla1
    private void eventGuardar1(ActionEvent event) throws IOException{
     //JOptionPane.showMessageDialog(null, "Hola");
     String valor1 = textField1.getText();
     String valor2 = textAread1.getText();
     String valor3 = textField3.getText();
     String valor4 = textField4.getText();
     String valor5 = textField5.getText();
     String valor6 = textField6.getText();
     String valor7 = textField7.getText();
     
     
     System.out.println("Tipo Denuncia: " + valor1);
     System.out.println("Descripcion: " + valor2);
     System.out.println("Nombre del Denunciante/Ofendido: " + valor3);
     System.out.println("Identificacion: " + valor4);
     System.out.println("Domicilio: " + valor5);
     System.out.println("Telefono: " + valor6);
     System.out.println("Sexo: " + valor7);
     JOptionPane.showMessageDialog(null, "Guardados");
     
     
     FXMLLoader loader = new FXMLLoader(getClass().getResource("Pantalla2.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
     
    }
    
    @FXML
    // Action de Boton de Cancelar Pantalla 1
    private void eventCancelar1(ActionEvent event){
    Stage stage = (Stage) cancelar1.getScene().getWindow();
       stage.close();
     
    }
    
    
    
    
    
    //PANTALLA #2
    
    @FXML
    private TextField textField11;
    
    @FXML
    private TextField textField22;
    
    @FXML
    private TextField textField33;
    
   @FXML
    //Boton Guardar Pantalla 2
    private Button guardar2;
   
   @FXML
    //Boton Cancelar Pantalla 2
    private Button cancelar2;
    
     
  
    @FXML
    //Action de Boton Guardar Pantalla 2
    private void eventGuardar2(ActionEvent event) throws IOException{
     String valor11 = textField11.getText();
     String valor22 = textField22.getText();
     String valor33 = textField33.getText();
   
     
     
     System.out.println("Nombre Ofensor: " + valor11);
     System.out.println("Domicilio: " + valor22);
     System.out.println("Sexo: " + valor33);   
     JOptionPane.showMessageDialog(null, "Guardados");
     
     
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Pantalla3.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
     
    }
    
    
     @FXML
    // Action de Boton de Cancelar Pantalla 2
    private void eventCancelar2(ActionEvent event){
    Stage stage = (Stage) cancelar2.getScene().getWindow();
    stage.close();
    
    }
    
    
    
    
    //PANTALLA 3
    
    @FXML
    private TextArea textArea111;
    
    @FXML
    private TextArea textArea222;
    
     @FXML
    //Boton Guardar Pantalla 3
    private Button guardar3;
   
   @FXML
    //Boton Cancelar Pantalla 3
    private Button cancelar3;
    
    
    
     @FXML
    //Action de Boton Guardar Pantalla 3
    private void eventGuardar3(ActionEvent event) throws IOException{
        String valor111 = textArea111.getText();
        String valor222 = textArea222.getText();
        
         System.out.println("Evidencia 1: " + valor111);
         System.out.println("Evidencia 2: " + valor222);
          
    JOptionPane.showMessageDialog(null, "Pruebas Guardadas");
    
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Pantalla4.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    
     @FXML
    // Action de Boton de Cancelar Pantalla 3
    private void eventCancelar3(ActionEvent event){
    Stage stage = (Stage) cancelar3.getScene().getWindow();
    stage.close();
    
    }
    
    
    
    
    //PANTALLA #4
    
     @FXML
    private TextField textField1111;
    
    @FXML
    private TextField textField2222;
    
    @FXML
    private TextField textField3333;
    
    @FXML
    private TextArea textArea44444;
    
    @FXML
    private TextField textField5555;
    
    @FXML
    //Boton Guardar Pantalla 4
    private Button guardar4;
    
   @FXML
    //Boton Cancelar Pantalla 4
    private Button cancelar4;
    
    
    
    @FXML 
    //Action de Boton Guardar Pantalla 4
    private void eventGuardar4(ActionEvent event) throws IOException{
     String valor1111 = textField1111.getText();
     String valor2222 = textField2222.getText();
     String valor3333 = textField3333.getText();
     String valor4444 = textArea44444.getText();
     String valor5555 = textField5555.getText();
     
     
     System.out.println("Nombre: " + valor1111);
     System.out.println("Identificacion: " + valor2222);
     System.out.println("Domicilio: " + valor3333);
     System.out.println("Relacion con Ofendido: " + valor4444);
     System.out.println("Telefono: " + valor5555);
      
    JOptionPane.showMessageDialog(null, "Guardado");
    
    
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Pantalla5.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    // Action de Boton de Cancelar Pantalla 4
    private void eventCancelar4(ActionEvent event){
    Stage stage = (Stage) cancelar4.getScene().getWindow();
    stage.close();
    
    }
    
    
    
    
    
    
    
    //PANTALLA #5
    
    
    @FXML
    private TextField textField11111;
    
    @FXML
    //Boton Guardar Pantalla 5
    private Button guardar5;
    
   @FXML
    //Boton Cancelar Pantalla 5
    private Button cancelar5;
    
      
    
     @FXML
    //Action de Boton Aceptar Pantalla5
    private void eventGuardar5(ActionEvent event){
        String valor11111 = textField11111.getText();
        
         System.out.println("Codigo: " + valor11111);
        
        
        
        
    JOptionPane.showMessageDialog(null, "Codigo Guardado");
    
    Stage stage = (Stage) guardar5.getScene().getWindow();
    stage.close();

    }
    
    @FXML
    // Action de Boton de Cancelar Pantalla 4
    private void eventCancelar5(ActionEvent event){
    Stage stage = (Stage) cancelar5.getScene().getWindow();
    stage.close();
    
    }
    
    
  
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
