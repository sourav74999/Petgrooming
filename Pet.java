package petgromming;

public class Pet {
	 
	    private String name;
	    private String breed;
	    private int age;
	    private Customer owner;

	    public Pet(String name, String breed, int age, Customer owner) {
	        this.name = name;
	        this.breed = breed;
	        this.age = age;
	        this.owner = owner;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getBreed() {
	        return breed;
	    }

	    public int getAge() {
	        return age;
	    }

	    public Customer getOwner() {
	        return owner;
	    }
	}


