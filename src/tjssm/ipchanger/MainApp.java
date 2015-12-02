package tjssm.ipchanger;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * 
 * @author tjssm
 *
 */
public class MainApp extends Application {
	private Stage primaryStage;
	private AnchorPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TJSSM IPCHANGER");

		initRootLayout();
	}

	/**
	 * Initializes the root layout
	 * 
	 * @author Son
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ipOverview.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
     * Returns the main stage.
     * @return Stage
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
	public static void main(String[] args) {
		launch(args);
	}
}
