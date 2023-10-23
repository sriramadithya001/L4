import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx3{

   public static void main(String[] args){
    
    
        String input = "hey_i_m_sriram_adithya";
        String regex = "[a-z]+_[a-z]+"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }


   }
}