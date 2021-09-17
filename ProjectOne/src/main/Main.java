package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		menu();
	}

	public static void menu() {
		Address p1 = new Address("John", "E", "Smith", "654-321-0909", "Bourbon", "Missouri");
		Address p2 = new Address("Mark", "E", "Loo", "654-321-0952", "Bourbon", "Missouri");

		Functions f1 = new Functions();
		f1.addData(p1);
		f1.addData(p2);
		
		

		Scanner input = new Scanner(System.in);
		

		while(true) {
			System.out.println("~~~~~~~~~~ My Phonebook ~~~~~~~~~~");
			System.out.println();
			System.out.println(" 1: to add new record ");
			System.out.println(" 2: to Delete a record");
			System.out.println(" 3: to search by first name");
			System.out.println(" 4: to search by last name");
			System.out.println(" 5: to update an existing record");
			System.out.println(" 6: to search by  full name");
			System.out.println(" 7: to show all");
			System.out.println(" 8: to search by phone number");
			System.out.println(" 9: to search by city");
			System.out.println(" 10: to search by State");
			System.out.println(" 11: to exit program");

			int choice = input.nextInt();

			switch (choice) {

			case 1 : 
				//add a person
				System.out.print("Enter first Name: ");
				String first = input.next();
				System.out.print("Enter middle name ");
				String middle =input.next();
				System.out.print("Enter last name: ");
				String last = input.next();
				System.out.print("Enter phone number with dashes");
				String phone = input.next();
				System.out.print("Enter the City ");
				String city = input.next();
				System.out.print("Enter the State");
				String state = input.next();
				

				
				Address a1 = new Address(first, middle, last, phone, city, state);
				
				f1.addData(a1);
				f1.printData(f1.getFunctions());
				
				break;

			case 2 : 
				System.out.println("Please enter a phone number with dashes to delete a record.");
				String pNumber = input.next();
			
				f1.printDataArray(f1.deleteRecord(pNumber));
				break;
			case 3 : 
				System.out.println("What is the first name you would like to search? ");
				String firstName = input.next();
				f1.printDataArray(f1.firstName(firstName));
				break;

			case 4 : 
				System.out.println( "What is the last name you would like to search ?");
				String lastName = input.next();
				f1.printDataArray(f1.lastName(lastName));
				break;
				
			case 5:	
				System.out.println("~~~~~~~~~~ Enter new information to update ~~~~~~~~~~");
				System.out.println();
				System.out.print("Enter first Name: ");
				String first2 = input.next();
				System.out.print("Enter middle name ");
				String middle2 =input.next();
				System.out.print("Enter last name: ");
				String last2 = input.next();
				System.out.print("Enter phone number with dashes");
				String phone2 = input.next();
				System.out.print("Enter the City ");
				String city2 = input.next();
				System.out.print("Enter the State");
				String state2 = input.next();

				Address u1 = new Address(first2, middle2, last2, phone2, city2, state2);
				f1.addData(u1);
				
				System.out.println("Please enter the phone number with dashes of the record you wish to update.");
				String phoneNumber = input.next();
				f1.printDataArray(f1.deleteRecord(phoneNumber));
				
				break;
			case 6 :
				 System.out.println("Enter the first name to search? ");
				 String firstName2 = input.next().toUpperCase();
				 System.out.println("Enter the last name to search?  ");
				 String lastName2 = input.next().toUpperCase();
				 f1.printDataArray(f1.fullName(firstName2, lastName2));
				break;
				

			case 7: 
				//show all			
				f1.printData(f1.getFunctions());
				break;

			case 8 : 
				System.out.println("Enter the the phone number your would like to search ");
				String telephone = input.next();
				f1.printDataArray(f1.phoneNumber(telephone));
				break;

			case 9 : 
				System.out.println("Please enter the name of city ");
				String citySearch = input.next();
				f1.printDataArray(f1.citySearch(citySearch));
				break;

			case 10 : 
				System.out.println("Please enter the state you would like to search ");
				String stateSearch = input.next();
				f1.printDataArray(f1.stateSearch(stateSearch));
				break;

			default : 
				System.out.println("Thank you.");
				System.exit(0);
				
				
			}
			
		}
	
	}
	
}