import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx6{

   public static void main(String[] args){
    
    
       String s = "ADithya_0";
       String regex = "[a-zA-Z0-9_]*";

       Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(s);

       if(m.matches()){
        System.out.println("yes..Matches");
       }else{
	System.out.println("Doesn't match");
       }


   }
}