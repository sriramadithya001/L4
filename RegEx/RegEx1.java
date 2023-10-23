import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx1{

   public static void main(String[] args){
    
     String s = "c0O";
     String regex = "[A-Za-z0-9]*";

     Pattern p = Pattern.compile(regex);
    
     Matcher m = p.matcher(s);

     if(m.matches()){
       System.out.println("Yes matches");
     }else{
       System.out.println("Doesn't matches");
     }

   }
}