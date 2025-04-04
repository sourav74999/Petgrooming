package petgromming;

public class GroomingService {
	 
	    private String serviceName;
	    private double price;

	    public GroomingService(String serviceName, double price) {
	        this.serviceName = serviceName;
	        this.price = price;
	    }

	    public String getServiceName() {
	        return serviceName;
	    }

	    public double getPrice() {
	        return price;
	    }
	}


