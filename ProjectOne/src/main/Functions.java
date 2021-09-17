package main;

public class Functions {

	// create a empty array for data to be entered
	Address[] add = new Address[0];

	public Address[] addData(Address newData) {

		Address[] temp = new Address[add.length + 1];

		// add the data from original array to temp
		for (int i = 0; i < add.length; i++) {
			temp[i] = add[i];

		}

		// add new data to end of temp
		temp[temp.length - 1] = newData;
		// reassign the original to new one;
		add = temp;
		
		//sort the list
		 for (int i = 0; i < add.length; i++) {
			 for(int j = 0; j < add.length; j++) {
	            if(add[i].getLast().toLowerCase().compareTo(add[j].getLast().toLowerCase()) > 0) {
	                Address temp2 = add[j];
	                add[j] = add[i];
	                add[j] = temp2;
	            }
			 }
	            
	        }
		
	
	      return add;
	}

	public Address[] getFunctions() {
		return add;
	}

	public void printData(Address[] findPerson) {

		for (int i = 0; i < findPerson.length; i++) {
			System.out.println("~~~~~~~~~~Person details~~~~~~~~~");
			add[i].getPerson();

		}

	}

	public Address[] deleteRecord(String pNumber) {
		int count = 0;
		
		for (int i = 0; i < add.length; i++) {
				if(add[i].getTelephone().equals(pNumber)) {
					
				}else {
					count++;
				}
		}
		Address[] phone = new Address[count];
		
		int x = 0;
		for(int j = 0; j < add.length; j++) {
			if(add[j].getTelephone().equals(pNumber)) {
				
			}else {
				phone[x] = add[j];
				x++;
			}
		}
		sort(phone);
		return phone;
	}

	// search new person 
	public Address[] firstName(String first) {
			//COUNTS HOW MANY FIRST IS IN THE ARRAY
		int count = 0;
		for (int i = 0; i < add.length; i++) {
			if (add[i].getFirst().toUpperCase().equals(first.toUpperCase())) {
				count++;

			}
		}

		Address[] newPerson = new Address[count];
			// IS LOCATION AND THEN ADDS NEW COUNT TO A NEW ARRAY
		int x = 0;

		for (int j = 0; j < add.length; j++) {
			if (add[j].getFirst().toUpperCase().equals(first.toUpperCase())) {
				newPerson[x] = add[j];
				x++;
			}
		}
		sort(newPerson);
		return newPerson;
	}
	
	public Address[] lastName(String last) {
		//COUNTS HOW MANY FIRST IS IN THE ARRAY
	int count = 0;
	for (int i = 0; i < add.length; i++) {
		if (add[i].getLast().toUpperCase().equals(last.toUpperCase())) {
			count++;

		}
	}

	Address[] newPerson = new Address[count];
		// IS LOCATION AND THEN ADDS NEW COUNT TO A NEW ARRAY
	int x = 0;

	for (int j = 0; j < add.length; j++) {
		if (add[j].getLast().toUpperCase().equals(last.toUpperCase())) {
			newPerson[x] = add[j];
			x++;
		}
	}
	sort(newPerson);
	return newPerson;
}
	public Address[] fullName(String first, String last) {
		//COUNTS HOW MANY FIRST IS IN THE ARRAY
	int count = 0;
	for (int i = 0; i < add.length; i++) {
		if (add[i].getLast().toUpperCase().equals(last) && add[i].getFirst().toUpperCase().equals(first)) {
			count++;

		}
	}

	Address[] newPerson = new Address[count];
		// IS LOCATION AND THEN ADDS NEW COUNT TO A NEW ARRAY
	int x = 0;

	for (int j = 0; j < add.length; j++) {
		if (add[j].getLast().toUpperCase().equals(last) && add[j].getFirst().toUpperCase().equals(first)) {
			newPerson[x] = add[j];
			x++;
		}
	}
	sort(newPerson);
	return newPerson;
}

//SEARCH BY PHONE NUMBER
	public Address[] phoneNumber(String phone) {
		//COUNTS HOW MANY FIRST IS IN THE ARRAY
	int count = 0;
	for (int i = 0; i < add.length; i++) {
		if (add[i].getTelephone().equals(phone)) {
			count++;

		}
	}

	Address[] newPerson = new Address[count];
		// IS LOCATION AND THEN ADDS NEW COUNT TO A NEW ARRAY
	int x = 0;

	for (int j = 0; j < add.length; j++) {
		if (add[j].getTelephone().equals(phone)) {
			newPerson[x] = add[j];
			x++;
		}
	}
	sort(newPerson);
	return newPerson;
}
		//SEARCH BY CITY LOCATION
	public Address[] citySearch(String city) {
		//count how many cities are in the array. adjust size
		int count = 0;
		for(int i =0; i < add.length; i++) {
			if(add[i].getCity().toLowerCase().equals(city.toLowerCase())) {
				count++;
			}
		}
		Address[] newCity = new Address[count];
		
		int x = 0;
		for (int j = 0; j < add.length; j++) {
			if(add[j].getCity().toLowerCase().equals(city.toLowerCase())) {
				newCity[x] = add[j];
				x++;
			}
		}
		sort(newCity);
		return newCity;
	}
	//SEARCH FOR THE STATE
	public Address[] stateSearch(String state) {
		//count how many cities are in the array. adjust size
				int count = 0;
				for(int i =0; i < add.length; i++) {
					if(add[i].getState().toLowerCase().equals(state.toLowerCase())) {
						count++;
					}
				}
				Address[] newState = new Address[count];
				
				int x = 0;
				for (int j = 0; j < add.length; j++) {
					if(add[j].getState().toLowerCase().equals(state.toLowerCase())) {
						newState[x] = add[j];
						x++;
					}
				}
				sort(newState);
				return newState;
	}
	public Address[] sort(Address[] add) {
	    for (int i = 1; i < add.length; i++) {
            if(add[i - 1].getLast().toLowerCase().compareTo(add[i].getLast().toLowerCase()) > 0) {
                Address temp2 = add[i - 1];
                add[i - 1] = add[i];
                add[i] = temp2;
            }
            
        }
	    return add;
	}
	//print new person
	public void printDataArray(Address[] search) {
		
		for (int i = 0; i < search.length; i++) {
			System.out.println("~~~~~~~~~~Person details~~~~~~~~~");
			search[i].getPerson();
			
		}
		
	}

}