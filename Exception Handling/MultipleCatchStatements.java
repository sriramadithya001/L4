import java.util.Scanner;

public class MultipleCatchStatements {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
	    int a = sc.nextInt(), b = sc.nextInt();
	    int[] arr = {1,2,-2};
	    arr[2] %= a;
	    arr[b] %= 3;
	}
	catch(ArrayIndexOutOfBoundsException e) {
	    System.out.println(e.getMessage());
	}
	catch(ArithmeticException e) {
	    System.out.println("ArithmeticException : " + e.getMessage());
	}
    }
}
