import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class WriteUpperCase {
    public static void main(String[] args) {
	File file = new File("C:\\Users\\ADMIN\\Desktop\\Incubation\\L4\\FileHandling\\textfiles\\file2.txt");
	try {
	    if(!file.exists()) file.createNewFile();
	    FileWriter writer = new FileWriter(file);
	    Scanner reader = new Scanner(file);
	    while(true) {
		String s = reader.nextLine();
		if(s.equalsIgnoreCase("exit") break;
		writer.write(s.toUpperCase());
	    }
	    writer.close();
	}
	catch(Exception e) {
	    System.out.println("An error occured");
	}
    }
}