import java.util.Scanner;

public class FinallyClause {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	try {
	    if(n == 1) throw new NullPointerException("Exception 1");
	    if(n == 2) throw new ArithmeticException("Exception 2");
        }
	catch(NullPointerException e) {
	    System.out.println(e.getMessage());
	}
	catch(ArithmeticException e) {
	    System.out.println(e.getMessage());
	}
	finally {
	    System.out.println("This code block will always get executed");
	}
    }
}