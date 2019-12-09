package pt.iade.carStand;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.Main;
import pt.iade.carStand.controllers.UserMainController;
import pt.iade.carStand.controllers.UserPaymentCompleteController;
import pt.iade.carStand.controllers.ColabAddCarCompleteController;
import pt.iade.carStand.controllers.ColabAddCarController;
import pt.iade.carStand.controllers.ColabInfoUserController;
import pt.iade.carStand.controllers.ColabInventoryController;
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

	//Abrir janela Principal de login
	static public void openMainWindow() {
		Parent root = createNodeTree("./views/LoginUserView.fxml", new LoginUserController());			
		Scene scene = new Scene(root);
		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

// FAZENDO LOGIN PELO USER
	//abre janela que mostra os carros
	static public void openItemsWindow(User loggedUser) {
		Parent root = createNodeTree("./views/UserMainView.fxml", new UserMainController(loggedUser));
		primaryStage.getScene().setRoot(root);
	}	
	//Apos selecionar o carro passa para pagamento
	static public void comprarWindow(User loggedUser, Car carToBuy) {
		Parent root = createNodeTree("./views/UserPaymentView.fxml", new UserPaymentController(loggedUser,carToBuy));		
		primaryStage.getScene().setRoot(root);
	}	
	//voltar atras no pagamento
	static public void backToUserMainView(User loggedUser) {
		Parent root = createNodeTree("./views/UserMainView.fxml", new UserMainController(loggedUser));			
		if (root != null)
			primaryStage.getScene().setRoot(root);	
	}	
	//faz logout e volta ao login
	static public void backLogin() {
		Parent root = createNodeTree("./views/LoginUserView.fxml", new LoginUserController());
		if (root != null)
			primaryStage.getScene().setRoot(root);	
	}
	//Abre confirmacao apos pagamento
	static public void openPaymentComplete(User loggedUser) {
		Parent root = createNodeTree("./views/UserPaymentCompleteView.fxml", new UserPaymentCompleteController(loggedUser));
		primaryStage.getScene().setRoot(root);
	}
	

//FAZENDO LOGIN PELO COLAB
	//passa do loginUser para o loginColab
	static public void openColabWindow() {
		Parent root = createNodeTree("./views/LoginColabView.fxml", new LoginColabController());			
		if (root != null)
			primaryStage.getScene().setRoot(root);	
	}

	//do login para o menu
	static public void openColabWindow(User loggedUser) {
		Parent root = createNodeTree("./views/ColabMainView.fxml", new ColabMainController(loggedUser));
		primaryStage.getScene().setRoot(root);
	}
	//do menu para o inventario
	static public void inventarioWindow(User loggedUser) {
		Parent root = createNodeTree("./views/ColabInventoryView.fxml", new ColabInventoryController(loggedUser));		
		primaryStage.getScene().setRoot(root);
	}
	//do menu para a infoUser
	static public void infoUserWindow(User loggedUser) {
		Parent root = createNodeTree("./views/ColabInfoUserView.fxml", new ColabInfoUserController(loggedUser));		
		primaryStage.getScene().setRoot(root);
	}
	//do menu para o addCar
	static public void addCarWindow(User loggedUser) {
		Parent root = createNodeTree("./views/ColabAddCarView.fxml", new ColabAddCarController(loggedUser));		
		primaryStage.getScene().setRoot(root);
	}
	//voltar atras em qualquer opção
	static public void backToColabMainView(User loggedUser) {
		Parent root = createNodeTree("./views/ColabMainView.fxml", new ColabMainController(loggedUser));			
		if (root != null)
			primaryStage.getScene().setRoot(root);	
	}	
	//faz logout e volta ao login
	static public void backLoginColab() {
		Parent root = createNodeTree("./views/LoginColabView.fxml", new LoginColabController());
		if (root != null)
			primaryStage.getScene().setRoot(root);	
	}
	//Adicionar completo
	static public void openAddCarComplete(User loggedUser) {
		Parent root = createNodeTree("./views/ColabAddCarCompleteView.fxml", new ColabAddCarCompleteController(loggedUser));
		primaryStage.getScene().setRoot(root);
	}
	//volta para adicionar outro carro
	static public void backToColabAddCarView(User loggedUser) {
		Parent root = createNodeTree("./views/ColabAddCarView.fxml", new ColabAddCarController(loggedUser));			
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
