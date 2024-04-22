import java.util.Scanner;
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
		super(message);
	    }
	}

	public class exp15 {
	    static void checkEligibility(int age) throws InvalidAgeException {
		if (age < 18) {
		    throw new InvalidAgeException("Sorry, you are not eligible to vote.");
		} else {
		    System.out.println("You are eligible to vote.");
		}
	    }

	    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = s.nextInt();

		try {
		    checkEligibility(age);
		} catch (InvalidAgeException e) {
		    System.out.println(e.getMessage());
		}
	    }
	}
