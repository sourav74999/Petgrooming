package petgromming;

public class Appointment {
	 
	    private Pet pet;
	    private GroomingService service;
	    private String date;

	    public Appointment(Pet pet, GroomingService service, String date) {
	        this.pet = pet;
	        this.service = service;
	        this.date = date;
	    }

	    public Pet getPet() {
	        return pet;
	    }

	    public GroomingService getService() {
	        return service;
	    }

	    public String getDate() {
	        return date;
	    }
	}


