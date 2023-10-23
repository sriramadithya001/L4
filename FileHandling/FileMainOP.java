import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMainOP {
    public static void main(String[] args) {
	// q1
	// create
	File file = new File("C:\\Users\\ADMIN\\Desktop\\Incubation\\L4\\FileHandling\\textfiles\\file1.txt");
	try {file.createNewFile();} catch(IOException e) {System.out.println("An error occured while creating file");}

	// write
	try {
	    FileWriter writer = new FileWriter(file);
	    writer.write("java is cool");
	    writer.close();
	}
	catch(IOException e) {System.out.println("An error occured while writing file");}

	// read
	try {
	    Scanner reader = new Scanner(file);
	    while(reader.hasNext()) {
		System.out.print(reader.next());
	    }
	}
	catch(IOException e) {System.out.println("An error occured while reading file");}

	//q2
	System.out.println(file.isFile() ? "This is a file" : "This is a directory");
	if(file.exists()) System.out.println("File exists");
        System.out.println("File name : " + file.getName());
        System.out.println("Absolute path : " + file.getAbsolutePath());
	
    }
}