import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
	super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int age;
	try {
	    age = sc.nextInt();
	    if(age < 0) throw new NegativeAgeException("Invalid age");
	}
	catch(NegativeAgeException e) {
	    System.out.println(e.getMessage());
	}
    }
}