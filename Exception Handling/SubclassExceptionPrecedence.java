class Baseclass {
    void throwException() {
	try {
	    throw new Exception("Exception in Parent class");
	}
	catch(Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}

class Subclass extends Baseclass {
    void throwException() {
	try {
	    throw new Exception("Exception in Sub class");
	}
	catch(Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}

public class SubclassExceptionPrecedence {
    public static void main(String[] args) {
	Subclass subclass = new Subclass();
	subclass.throwException();
    }
}