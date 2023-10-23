import java.util.Scanner;

public class ArrayIndexBoundException {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
	    int size = sc.nextInt();
	    int[] arr = new int[size];
	    System.out.print(arr[size]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
	    System.out.print(e);
	}
    }
}