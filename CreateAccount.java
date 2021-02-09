package My;

import java.util.Scanner;

public class CreateAccount {

	public static void main(String[] args) {
		String username1 = "sarah";
		String username2 = "chris";
//      Write a code that asks a user to create a username on console. 
//		Check if entered username already exists in the database. (There are 2 usernames in DB now)
//		If entered username already exists print "Username already exists!" else "Username created!"
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in a username you want to create: "); 
		String enteredUsername = input.nextLine();
		if(enteredUsername.equals(username1) || enteredUsername.equals(username2)) {
			System.out.println("Username already exists!");
		}
		else {
			System.out.println("Username created!");
			System.out.println("Please create a password: ");
			String password = input.nextLine();
			if(password.length() >= 5 && password.length() <= 12) {
				System.out.println("Password created successfully!");
				System.out.println("Congratulations! Account was successfully created!");
				System.out.println("username: " + enteredUsername);
				System.out.println("password: " + password);
			}
			else {
				   System.out.println("Password is invalid! Password should be no shorter than 5 and no longer than 12 characters!");
				}
			} 
		
		System.out.println("\nEnd of Program");
		} 
		
		
		
	}

