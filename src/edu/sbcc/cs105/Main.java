package edu.sbcc.cs105;

import java.util.Scanner;

public class Main {
	public static final String PIN = "1234";
	public static final String INCORRECT_PIN = "Your PIN is incorrect.";
	public static final String CORRECT_PIN = "Your PIN is correct.";
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your PIN: ");
		String pin = in.next();
		
		if(!PIN.equals(pin)) {
			System.out.print(INCORRECT_PIN + " Re-enter your PIN: ");
			pin = in.next();
			
			if(!PIN.equals(pin)) {
				System.out.print(INCORRECT_PIN + " Re-enter your PIN: ");
				pin = in.next();
				
				if(!PIN.equals(pin)) {
					System.out.println(INCORRECT_PIN + " Your account is locked.");
				} else {
					System.out.println(CORRECT_PIN);
				}
			} else {
				System.out.println(CORRECT_PIN);
			}
		} else {
			System.out.println(CORRECT_PIN);
		}
		
		in.close();
	}
}
