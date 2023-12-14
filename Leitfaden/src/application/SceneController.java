package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class SceneController {

	@FXML
	Button sceneChange1;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToScene1(ActionEvent event) {
		try {
			 root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			 scene = new Scene(root);
			 stage.setScene(scene);
			 centerStage(stage);
			 stage.show();
			 System.out.println("TEST TEST TEST");
			 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void switchToScene2(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			centerStage(stage);
			stage.show();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void switchToSceneLeitfaden(ActionEvent event) {
		try {
			 root = FXMLLoader.load(getClass().getResource("Leitfaden.fxml"));
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			 scene = new Scene(root);
			 stage.setScene(scene);
			 stage.show();
			 centerStage(stage);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	private void centerStage(Stage stage) {
        // Rufe die Bildschirmgröße ab
        double screenWidth = Screen.getPrimary().getVisualBounds().getWidth();
        double screenHeight = Screen.getPrimary().getVisualBounds().getHeight();

        // Berechne die Position für die Zentrierung
        double stageWidth = stage.getWidth();
        double stageHeight = stage.getHeight();
        double x = (screenWidth - stageWidth) / 2;
        double y = (screenHeight - stageHeight) / 2;

        // Setze die berechnete Position
        stage.setX(x);
        stage.setY(y);
    }
}
