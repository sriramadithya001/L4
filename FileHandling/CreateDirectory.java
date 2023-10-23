import java.io.File;

public class CreateDirectory {
   public static void main(String[] args) {
	File folder = new File("C:\\Users\\ADMIN\\Desktop\\Incubation\\L4\\FileHandling\\com");
	try {
	    folder.mkdir();
	    if(folder.exists()) System.out.println("Folder successfully created");
        }
	catch(Exception e) {
	    System.out.pintln(e);
	}
   }
}