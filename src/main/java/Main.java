import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.adder;
import views.AdderController;

public class Main extends Application
{

	@Override
	public void start(Stage stage) throws Exception
	{
		adder model = new adder();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("views/AdderView.fxml"));
		BorderPane view = loader.load();
		AdderController controller = loader.getController();
		controller.setModel(model);
		
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();

	}

	public static void main(String[] args)
	{
		launch(args);
		
	}

}
