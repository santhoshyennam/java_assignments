import java.util.Scanner;

class WorldPlay
{
    static boolean isVowel(char ch)
    {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return true;
        return false;
    }
    static String replaceVowels(String phrase,char ch)
    {
        char[] x = phrase.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : x)
        {
            if(isVowel(c))
            sb.append(ch);
            else
            sb.append(c);

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch ='x';
        System.out.println(isVowel(ch));
        String s = new String("Hai, iam from mvsr college!");
        System.out.println(replaceVowels(s, '*'));
    }
}