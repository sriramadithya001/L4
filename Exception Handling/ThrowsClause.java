import java.util.Scanner;

public class ThrowsClause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(), m = sc.nextInt();
	try {
	    System.out.println(mod(n,m));
	}
	catch(ArithmeticException e) {
	    System.out.print("Arithmetic error" + e.getMessage());
	}
    }

    public static int mod(int n,int m) throws ArithmeticException {
	return n % m;
    }
}