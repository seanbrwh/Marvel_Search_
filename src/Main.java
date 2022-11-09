public class Main {
    // I have created an outline of the project
    // as well as a git repo So we can share back and
    // forth with the project.
    
 /*
 * All variable names are subject to change and probably will in order to compatible 
 * with the API we will be using.
 * 
 * Problems to resolve:
 * 1. When selecting options from menus, any String will make it error.
 * 2. Find a way to make the program temporarily stop so the user can see what they searched.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		//Initializing variables being used
		int choice1;
		int choice2;
		String keyword;
		
		String searchType;
		String searchTerm;
		String searchTermValue;
		
	
		//Introduction to the program
		System.out.println("Welcome to the Marvel Search program!\n");
	
		do {
			//The first menu which allows the user to select what they are searching.
			System.out.println("Please select a Category you would like to search.");
	
			System.out.println("1) Characters");
			System.out.println("2) Comics");
			System.out.println("3) Series");
			System.out.println("0) Quit");
			System.out.println("");
	    
			System.out.print("Please select a category: ");
	     
			//Receive user input.
			choice1 = userInput.nextInt();
				
			switch (choice1){
			case 1:
			//If Characters is selected run this.
	//The Character Search Menu
				searchType = "Characters";
				System.out.println("You selected Characters.");
				System.out.println("");
				
				System.out.println("1) Character Name");
				System.out.println("2) Character Name start with");
				System.out.println("0) Go back");
				System.out.println("");
		    
				System.out.print("Please select how you'd like to search: ");
				choice2 = userInput.nextInt();
				
			//Selects option that was picked by the user.
				switch (choice2) {
				case 1:
					searchTerm = "name";
					break;
				case 2:
					searchTerm = "nameStartsWith";
					break;
				case 0:
					System.out.println("Okay, going back.\n");
					break;
				default:
					System.out.println("Not an option, restarting.\n");
					break;
				}
				
			//If the user selects either option that needs a String input, run this.
				if (choice2 == 1|| choice2 == 2) {
					System.out.println("Please type a keyword: ");
					keyword = userInput.next();
					
					searchTermValue = keyword;
					System.out.println();
					break;
				}
				
				else {break;}
				
			case 2:
		//If Comics is selected run this.
				searchType = "Comics";
				System.out.println("You selected Comics.\n");
				
				System.out.println("1) Comic Name");
				System.out.println("2) Comic Name start with");
				System.out.println("0) Go back");
				System.out.println("");
		    
				System.out.print("Please select how you'd like to search: ");
				choice2 = userInput.nextInt();
				
			//Selects the option the user chose.
				switch (choice2) {
				case 1:
					searchTerm = "title";
					break;
				case 2:
					searchTerm = "titleStartsWith";
					break;
				case 0:
					System.out.println("Back to main menu.\n");
					break;
				default:
					System.out.println("Not an option, restarting.\n");
					break;
				}
				
			//If the user selects either option that needs a String input, run this.
				if (choice2 == 1|| choice2 == 2) {
					System.out.println("Please type a keyword: ");
					keyword = userInput.next();
					
					searchTermValue = keyword;
					System.out.println();
					break;
				}
				else {break;}
				
				
			case 3:
		//If Series is selected run this.
				searchType = "Series";
				System.out.println("You selected Series.\n");
				
				System.out.println("1) Series Name");
				System.out.println("2) Series Name start with");
				System.out.println("0) Go back");
				System.out.println("");
		    
				System.out.print("Please select how you'd like to search: ");
				choice2 = userInput.nextInt();
				
			//Selects the option the user chose.
				switch (choice2) {
				case 1:
					searchTerm = "title";
					break;
				case 2:
					searchTerm = "titleStartsWith";
					break;
				case 0:
					System.out.println("Returned to main menu.\n");
					break;
				default:
					System.out.println("Not an option, restarting.\n");
					break;
				}
				
			//If the user selects either option that needs a String input, run this.
				if (choice2 == 1|| choice2 == 2) {
					System.out.println("Please type a keyword: ");
					keyword = userInput.next();
					
					searchTermValue = keyword;
					System.out.println();
					break;
				}
				else {break;}
				
			case 0:
			//If quit is selected run this.
				System.out.println("Thanks for using Marvel Search! Bye!\n");
				break;
				default:
			//If a choice not in range is selected run this.
				System.out.println("Invalid option.\n");
				break;
				}
		} while (choice1 != 0);
	}
}

}
