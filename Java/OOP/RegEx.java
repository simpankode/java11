package OOP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello World");
        boolean matcherFound = matcher.find();

        if(matcherFound) {
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}