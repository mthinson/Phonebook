package main;

public class Person {

	public String first;
	public String middle;
	public String last;
	public String telephone;
	
	//note~~~~~~~~~~~~~~~~
	//on telephone have them enter each group seperate then assign it with - inside as telephone before sending it. 


	public String getFirst() {
		return first;
	}

	public Person(String first, String middle, String last, String telephone) {
		super();
		this.first = first;
		this.middle = middle;
		this.last = last;
		this.telephone = telephone;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {	
		this.telephone = telephone;
	}
	
	
	
}
