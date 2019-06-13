package _05_strings._01_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameCheck {
    public static void main(String[] args){
        System.out.println("RegExp check:");

        System.out.println(checkWithRegExp("_@BEST"));
        System.out.println(checkWithRegExp("vovan"));
        System.out.println(checkWithRegExp("vo"));
        System.out.println(checkWithRegExp("Z@OZA"));
        System.out.println(checkWithRegExp("vo-van"));

        System.out.println("\nDumb check:");

        System.out.println(dumbCheck("_@BEST"));
        System.out.println(dumbCheck("vovan"));
        System.out.println(dumbCheck("vo"));
        System.out.println(dumbCheck("Z@OZA"));
        System.out.println(dumbCheck("vo-van"));

        String userNameString = "akjsdhflkajsdfh Ё lkgjhf";
        System.out.print("\n\"" + userNameString + "\"" + " contains cyrillic symbol(s)? ");
        Pattern p = Pattern.compile("[А-яЁё]");
        System.out.println(p.matcher(userNameString).find());
    }

    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[a-z0-9_]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public static boolean dumbCheck(String userNameString){

        char[] symbols = userNameString.toCharArray();
        if(symbols.length < 3 || symbols.length > 15 ) return false;

        String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

        for(char c : symbols){
            if(validationString.indexOf(c)==-1) return false;
        }

        return true;
    }
}
