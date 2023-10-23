import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOFile {
    public static void main(String[] args) {
	File ifile = new File("C:\\Users\\ADMIN\\Desktop\\Incubation\\L4\\FileHandling\\textfiles\\input.txt");
	File ofile = new File("C:\\Users\\ADMIN\\Desktop\\Incubation\\L4\\FileHandling\\textfiles\\output.txt");

	// read
	try {
	    FileWriter writer = new FileWriter(ofile);
	    Scanner reader = new Scanner(ifile);
	    while(reader.hasNext()) {
		writer.write(reader.nextLine());
	    }
	    writer.close();
	}
	catch(IOException e) {System.out.println("An error occured in file");}
    }
}