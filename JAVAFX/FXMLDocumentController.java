/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

package javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;


/**
 *
 * @author crist ancerrato
 */
public class FXMLDocumentController implements Initializable {
    
  
    @FXML
    //Boton Guardar Pantalla1
    private Button guardar1;
    
    @FXML
    //Boton Guardar Pantalla2
    private Button guardar2;
    
   
    @FXML
    //Action de Boton Guardar Pantalla1
    private void eventGuardar1(ActionEvent event){
     JOptionPane.showMessageDialog(null, "Hola");
    }
    
    @FXML
    //Action de Boton Guardar Pantalla2
    private void eventGuardar2(ActionEvent event){
    JOptionPane.showMessageDialog(null, "Prueba 2");
    }
    
    
     @FXML
    //Action de Boton Guardar Pantalla3
    private void eventGuardar3(ActionEvent event){
    JOptionPane.showMessageDialog(null, "Prueba 3");
    }
    
     @FXML
    //Action de Boton Guardar Pantalla4
    private void eventGuardar4(ActionEvent event){
    JOptionPane.showMessageDialog(null, "Prueba 4");
    }
    
     @FXML
    //Action de Boton Aceptar Pantalla5
    private void eventAceptar(ActionEvent event){
    JOptionPane.showMessageDialog(null, "Prueba 5");
    }
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
