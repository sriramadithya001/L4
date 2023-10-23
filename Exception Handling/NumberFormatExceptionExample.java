import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String numString = sc.next();
	try {
	    int num = Integer.parseInt(numString);
	}
	catch(NumberFormatException e) {
	    System.out.print(e.getMessage());
	}
    }
}