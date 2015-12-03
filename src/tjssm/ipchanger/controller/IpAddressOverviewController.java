package tjssm.ipchanger.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import tjssm.ipchanger.MainApp;
import tjssm.ipchanger.model.IpAddress;
import tjssm.ipchanger.view.*;

public class IpAddressOverviewController {

	@FXML
	private TableView<IpAddress> ipAddressTable;
	
	@FXML
	private TableColumn<IpAddress, String> placeColumn;

	@FXML
	private Label ipAddressLabel;
	
	@FXML
	private Label subnetMaskLabel;
	
	@FXML
	private Label gatewayLabel;
	
	@FXML
	private Label basicDNSLabel;
	
	@FXML
	private Label subDNSLabel;
	
	//Reference to the main application
	private MainApp mainApp;
		
	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public IpAddressOverviewController(){
	}
	
	/**
	 * Initialize the IpAddress table with the column. 
	 */
	@FXML
	private void initialize(){
		placeColumn.setCellValueFactory(cellData -> cellData.getValue().placeProperty());
	}
	
	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp)
	{
		this.mainApp = mainApp;
		
		ipAddressTable.setItems(mainApp.getIpAddressData());
	}
	
	
}

