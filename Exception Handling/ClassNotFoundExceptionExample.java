public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
	try {
	    Book b = new Book();
	}
	catch(ClassNotFoundException e) {
	    System.out.print(e.getMessage());
	}
    }
}