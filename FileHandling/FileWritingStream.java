import java.io.FileOutputStream;

public class FileWritingStream {
    public static void main(String[] args) {
	try {
	    FileOutputStream fs = new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Incubation\\L4\\FileHandling\\textfiles\\file2.txt");
	    String s = "java is cool";
	    byte[] b = s.getBytes();
	    fs.write(b);
	}
	catch(Exception e) {
	    System.out.println(e);
	}
    }
}