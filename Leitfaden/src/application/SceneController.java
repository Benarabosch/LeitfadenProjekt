package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class SceneController {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToScene1(ActionEvent event) {
		try {
			 FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
			 root =  loader.load();
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			 scene = new Scene(root); 
			 stage.setScene(scene);
			 //Muss hier initialisiert werden, sont Null Pointer
			 SceneController controller = loader.getController();
	         controller.setStage(stage);
			 centerStage(stage);
			 stage.show();
			 
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
	
	public void switchToSceneVersionierung(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("Versionierung.fxml"));
            scene = new Scene(root);
            stage.setScene(scene);
            centerStage(stage);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void switchToHelpScene(ActionEvent event) {
	    try {
	    	 root = FXMLLoader.load(getClass().getResource("TroubleShooting.fxml"));
	         // Assuming 'stage' is already initialized
	         scene = new Scene(root);
	         stage.setScene(scene);
	         centerStage(stage);
	         stage.show();
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

	public void setStage(Stage stage) {
		this.stage = stage;
	}
}
