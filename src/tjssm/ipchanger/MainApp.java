package tjssm.ipchanger;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import tjssm.ipchanger.model.IpAddress;
import tjssm.ipchanger.view.IpAddressOverviewController;


/**
 * 
 * @author tjssm
 *
 */
public class MainApp extends Application {
	private Stage primaryStage;
	private AnchorPane rootLayout;

	private ObservableList<IpAddress> ipAddressData = 
			FXCollections.observableArrayList(); 
		
	public MainApp(){
    	// Add some sample data
    	ipAddressData.add(new IpAddress("학교"));
    	ipAddressData.add(new IpAddress("멤버십"));
    	ipAddressData.add(new IpAddress("독서실"));
    }
	
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
			
			IpAddressOverviewController controller = loader.getController();
			controller.setMainApp(this);
			
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
        
    /**
     * Returns the data as an observable list of IpAddress
     *  
     * @return ObservableList
     */
    public ObservableList<IpAddress> getIpAddressData(){
    	return ipAddressData;
    }
         
	public static void main(String[] args) {
		launch(args);
	}
}
