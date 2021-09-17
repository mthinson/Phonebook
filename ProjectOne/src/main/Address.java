package main;



public class Address extends Person  {

	public String city;
	public String state;

	
	public Address(String first, String middle, String last, String telephone, String city, String state) {
		super(first, middle, last, telephone);
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void getPerson()
	{	//print out the data from print data in functions
		System.out.println("First: " + first + "\nMiddle: " + middle + 
				"\nlast: " + last + "\nTelephone: " + telephone + "\nCity: " 
				+city + "\nState: " + state);
	
	}

	
}
