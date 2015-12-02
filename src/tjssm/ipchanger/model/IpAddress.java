package tjssm.ipchanger.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a IP Address
 * 
 * @author tjssm
 *
 */
public class IpAddress {
	private final StringProperty place;
	private final StringProperty ipAddress;
	private final StringProperty subnetMask;
	private final StringProperty gateway;
	private final StringProperty basicDNS;
	private final StringProperty subDNS;
	
	
	/**
	 * Default constructor
	 */
	public IpAddress(){
		this(null);
	}
	
	/**
	 * Constructor with some initial data.
	 * 
	 * @param place
	 */
	public IpAddress(String place){
		this.place = new SimpleStringProperty(place);
		
		this.ipAddress = new SimpleStringProperty("0.0.0.0");
		this.subnetMask = new SimpleStringProperty("0.0.0.0");
		this.gateway = new SimpleStringProperty("0.0.0.0");
		this.basicDNS = new SimpleStringProperty("8.8.8.8");
		this.subDNS = new SimpleStringProperty("0.0.0.0");
	}
	
	public String getPlace(){
		return place.get();
	}
	
	public void setPlace(String place)
	{
		this.place.set(place);
	}
	
	public StringProperty placeProperty(){
		return place;
	}
		
	public String getIpAddress(){
		return ipAddress.get();
	}
	
	public void setIpAddress(String ipAddress){
		this.ipAddress.set(ipAddress);
	}
	
	public StringProperty ipAddressProperty(){
		return ipAddress;
	}
	
	public String getSubnetMask(){
		return subnetMask.get();
	}
	
	public void setSubnetMask(String subnetMask){
		this.subnetMask.set(subnetMask);
	}
	
	public StringProperty subnetMaskProperty(){
		return subnetMask;
	}
	
	public String getGateway(){
		return gateway.get();
	}
	
	public void setGateway(String gateway){
		this.gateway.set(gateway);
	}
	
	public StringProperty gatewayProperty(){
		return gateway;
	}
	
	public String getBasicDNS(){
		return basicDNS.get();
	}
	
	public void setBasicDNS(String basicDNS){
		this.basicDNS.set(basicDNS);
	}
	
	public StringProperty basicDNSProperty(){
		return basicDNS;
	}
	
	public String getSubDNS(){
		return subDNS.get();
	}
	
	public void setSubDNS(String subDNS){
		this.subDNS.set(subDNS);
	}
	
	public StringProperty subDNSProperty(){
		return subDNS;
	}	
}
