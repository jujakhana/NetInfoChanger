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
		this(null,null,null);
	}
	
	public IpAddress(String ipAddress, String subnetMask, String gateway)
	{
		this.place = new SimpleStringProperty();
		
		this.ipAddress = new SimpleStringProperty(ipAddress);
		this.subnetMask = new SimpleStringProperty(subnetMask);
		this.gateway = new SimpleStringProperty(gateway);
		
		this.basicDNS = new SimpleStringProperty("8.8.8.8");
		this.subDNS = new SimpleStringProperty(" ");
	}
	
	public String getPlace(){
		return place.get();
	}
	
	public StringProperty placeProperty(){
		return place;
	}
	
	
	public String getIpAddress(){
		return ipAddress.get();
	}
	
	public StringProperty ipAddressProperty(){
		return ipAddress;
	}
	
	public String getSubnetMask(){
		return subnetMask.get();
	}
	
	public StringProperty subnetMaskProperty(){
		return subnetMask;
	}
	
	public String getGateway(){
		return gateway.get();
	}
	
	public StringProperty gatewayProperty(){
		return gateway;
	}
	
	public String getBasicDNS(){
		return basicDNS.get();
	}
	
	public StringProperty basicDNSProperty(){
		return basicDNS;
	}
	
	public String getSubDNS(){
		return subDNS.get();
	}
	
	public StringProperty subDNSProperty(){
		return subDNS;
	}	
}
