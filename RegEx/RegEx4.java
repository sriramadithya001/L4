import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx4{

   public static void main(String[] args){
    
    
       String s = "pAdithYaq";
       String regex = "p.*q";

       Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(s);

       if(m.matches()){
        System.out.println("yes..Matches");
       }else{
	System.out.println("Doesn't match");
       }


   }
}