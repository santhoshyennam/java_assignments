import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Assignment9 {
  
    static boolean checkString(String s)
    {
        Pattern pattern = Pattern.compile("[A-Z].*[.]");
        Matcher matcher= pattern.matcher(s);
        if(matcher.matches())
        return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String s = new String(sc.nextLine());
        System.out.println(checkString(s));

    }
}


