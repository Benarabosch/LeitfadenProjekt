package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	 public void start(Stage stage) {
        try {
        	
            //Icon and Title
            stage.setTitle("Wirtschaftsinformatik Leitfaden");
            Image icon = new Image(getClass().getResourceAsStream("/images/Icon.png"));
            stage.getIcons().add(icon);
            
            //Scene1 is the Main Interface
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mainmenu.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            
            // Get the controller and set the stage
            SceneController controller = loader.getController();
            controller.setStage(stage);
            
            // Remove the default Windows decoration
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show(); 
            
            // Center the window on the screen
            centerStage(stage);

            
            
        } catch(Exception e) {
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
	
	public static void main(String[] args) {
		launch(args);
	}
}
