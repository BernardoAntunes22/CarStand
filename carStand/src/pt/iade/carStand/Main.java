package pt.iade.carStand;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		WindowManager.setPrimaryStage(primaryStage);
		WindowManager.openMainWindow();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
