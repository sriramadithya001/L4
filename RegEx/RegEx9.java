import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx9{

   public static void main(String[] args){
    
       String s = "SriramAdithya";
       String regex = "[aeiou]";
       Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(s);
       String s1 = m.replaceAll("");
       System.out.println(s1);

    }
}