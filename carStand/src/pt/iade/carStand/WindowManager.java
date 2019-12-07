package pt.iade.carStand;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.Main;
import pt.iade.carStand.controllers.UserMainController;
import pt.iade.carStand.controllers.ColabMainController;
import pt.iade.carStand.controllers.LoginColabController;
import pt.iade.carStand.controllers.LoginUserController;
import pt.iade.carStand.controllers.UserPaymentController;
import pt.iade.carStand.models.Car;
import pt.iade.carStand.models.Carlist;
import pt.iade.carStand.models.User;
import pt.iade.carStand.controllers.UserMainController;
import pt.iade.carStand.models.Carlist;

final public class WindowManager {

	static private Stage primaryStage;

	public static void setPrimaryStage(Stage primaryStage) {
		WindowManager.primaryStage = primaryStage;	
	}

	private WindowManager() {}

	//Apos selecionar o carro passa para pagamento
	static public void comprarWindow(User loggedUser, Car carToBuy) {
		Parent root = createNodeTree("./views/UserPaymentView.fxml", new UserPaymentController(loggedUser,carToBuy));		
		primaryStage.getScene().setRoot(root);
	}
	
	//abre janela que mostra os carros
	static public void openItemsWindow(User loggedUser) {
		Parent root = createNodeTree("./views/UserMainView.fxml", new UserMainController(loggedUser));
		primaryStage.getScene().setRoot(root);
	}
	
	static public void openColabWindow(User loggedUser) {
		Parent root = createNodeTree("./views/ColabMainView.fxml", new ColabMainController(loggedUser));
		primaryStage.getScene().setRoot(root);
	}

	//Abrir janela Principal de login
	static public void openMainWindow() {
		Parent root = createNodeTree("./views/LoginUserView.fxml", new LoginUserController());			
		Scene scene = new Scene(root);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	//voltar para inicial user
	static public void backLogin() {
		Parent root = createNodeTree("./views/LoginUserView.fxml", new LoginUserController());
		if (root != null)
			primaryStage.getScene().setRoot(root);	
	}

	//passa do loginUser para o loginColab
	static public void openColabWindow() {
		Parent root = createNodeTree("./views/LoginColabView.fxml", new LoginColabController());			
		if (root != null)
			primaryStage.getScene().setRoot(root);	
	}

	//voltar ao inicio
	static public void backToUserMainView(User loggedUser) {
		Parent root = createNodeTree("./views/UserMainView.fxml", new UserMainController(loggedUser));			
		if (root != null)
			primaryStage.getScene().setRoot(root);	
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
