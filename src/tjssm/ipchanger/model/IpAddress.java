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
		this.place = new SimpleStringProperty("");
		this.ipAddress = new SimpleStringProperty("");
		this.subnetMask = new SimpleStringProperty("");
		this.gateway = new SimpleStringProperty("");
		this.basicDNS = new SimpleStringProperty("");
		this.subDNS = new SimpleStringProperty("");
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
