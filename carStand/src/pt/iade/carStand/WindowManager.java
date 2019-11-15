package pt.iade.carStand;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.Main;
import pt.iade.carStand.controllers.MainController;

final public class WindowManager {

	static private Stage primaryStage;

	public static void setPrimaryStage(Stage primaryStage) {
		WindowManager.primaryStage = primaryStage;	
	}
	
	private WindowManager() {}
	
	static public void openMainWindow() {
		Parent root = createNodeTree("./views/CarStandView.fxml", new MainController());			
		Scene scene = new Scene(root);
		scene.getStylesheets().add(
				Main.class.getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	static public Parent createNodeTree(String viewPath, Object controller) {
		try {
			FXMLLoader loader = new FXMLLoader(
					Main.class.getResource(viewPath));
			loader.setController(controller);
			Parent root = loader.load();
			return root;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
