import java.util.Scanner;

public class Assignment2 {

    static boolean checkString(String s)
    {
        int i=0;
        while(i<s.length())
        {
            if(!(s.charAt(i)>=97 && s.charAt(i)<=122))
            return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String s = new String(sc.nextLine());
        System.out.println(checkString(s));

    }
}
