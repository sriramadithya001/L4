import java.util.Scanner;

public class ArraySizeCheck {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
	    int[] arr = new int[sc.nextInt()];
	}
	catch(NegativeArraySizeException e) {
	    System.out.println("Array is of negative size " + e.getMessage());
	}
    }
}