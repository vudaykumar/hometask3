package cal;

import java.util.Scanner;		//YAGNI

public class Calculator {		// infrastructure layer
	
	private static Scanner sc = new Scanner(System.in);	
	private static int num1, num2, choice, result;
	
	public static void main(String[] args) {	//Open close principle100
		
		takeInput();			//presentation layer	
		
		askOperation();			//application layer	
		
		performOperation();		//domain layer
		
		printResult();			//presentation layer
		
		sc.close();				//KISS

	}
	
	private static void printResult() {
		
		System.out.println("Result = " + result);
		
	}

	private static void performOperation() {
		
		switch(choice) {
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:					//Zero Division Error
				if( num2==0 ) {
					result = 0;
				} else {
					result = num1 / num2;
				}
				break;
			default:
				System.out.println("Invalid choice!");
		}
		
	}
	
	private static void askOperation() {
		
		System.out.println("Select choice - ");
		
		System.out.println("1 - Addition");
		System.out.println("2 - Subraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		
		choice = sc.nextInt();
	}
	
	private static void takeInput() {	//Single responsibility Principle
		
		System.out.println("Enter number 1: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter number 2: ");
		num2 = sc.nextInt();
		
	}

}
