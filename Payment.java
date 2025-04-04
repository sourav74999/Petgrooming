package petgromming;

public class Payment {
	 private Appointment appointment;
	    private double amount;
	    private String paymentMethod;

	    public Payment(Appointment appointment, double amount, String paymentMethod) {
	        this.appointment = appointment;
	        this.amount = amount;
	        this.paymentMethod = paymentMethod;
	    }

	    public Appointment getAppointment() {
	        return appointment;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public String getPaymentMethod() {
	        return paymentMethod;
	    }
	}


