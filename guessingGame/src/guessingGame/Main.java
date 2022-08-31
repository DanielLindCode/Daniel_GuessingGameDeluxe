package guessingGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Boolean win = false;
		Scanner input = new Scanner(System.in);

		String qNum = randomNrGen();
		
		System.out.println("DEBUG" + " " + qNum);

		String[] qNumStringArray = qNum.split("");

		String qN1 = qNumStringArray[0];
		String qN2 = qNumStringArray[1];
		String qN3 = qNumStringArray[2];

		String r1 = "";
		String r2 = "";
		String r3 = "";

		while (win == false) {

			System.out.println("Guess the right numbers!");

			String userInput = input.nextLine();

			if (userInput.length() < 3) {

				System.out.println("Please type three numbers.");

			} else {

				String[] userInputStringArray = userInput.split("");
				// System.out.println(userInputStringArray.length);

				String iN1 = userInputStringArray[0];
				String iN2 = userInputStringArray[1];
				String iN3 = userInputStringArray[2];
				
				
				
				
				if (qN1.equals(iN1)) {
					
					r1 = "O";
					
				} else if (qN2.contains(iN1) || qN3.contains(iN1)) {
					
					r1 = "?";
					
				} else
					r1 = "X";
				
				
				if (qN2.equals(iN2)) {
					
					r2 = "O";
					
				} else if (qN1.contains(iN2) || qN3.contains(iN2)) {
					
					r2 = "?";
					
				} else
					r2 = "X";
				
				
				if (qN3.equals(iN3)) {
					
					r3 = "O";
					
				} else if (qN1.contains(iN3) || qN2.contains(iN3)) {
					
					r3 = "?";
					
				} else
					r3 = "X";
				

				System.out.println("-=: " + r1 + "" + r2 + "" + r3 + " :=-");
				System.out.println("--------------------");

				if (r1.equals("O") && r2.equals("O") && r3.equals("O"))
					win = true;
					
			}

		}
		
		System.out.println("You won!");
		System.out.println("--------------------");
		
		String userInput = input.nextLine();
		
		switch(userInput) {
		
		case "Y" : win=false;
		
		case "N" : Runtime.getRuntime().exit(0);
		
		default : Runtime.getRuntime().exit(0);
		}

	}

	public static String randomNrGen() {

		int num = (int) (Math.floor(Math.random() * 1000));
		String numString;

		if (num < 10) {
			numString = String.valueOf(num);
			numString = "00" + numString;

		} else if (num >= 100) {
			numString = String.valueOf(num);

		} else {
			numString = String.valueOf(num);
			numString = "0" + numString;

		}

		return numString;
	}
}
