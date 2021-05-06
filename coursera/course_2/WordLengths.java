
import java.io.BufferedReader;
import java.io.FileReader;

public class WordLengths {
    static int[] counts = new int[31];
    static void countWordLengths(String s)
    {
        for(String s1:s.split(" "))
        {
            if(!Character.isLetter(s1.charAt(0)) || !Character.isLetter(s1.charAt(s1.length()-1)))
                continue;
            else
                counts[s1.length()]++;
        }

    }
    public static void main(String[] args) throws Exception {
        
        BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
        String newline = bf.readLine();
        int sum = 0;

        while(newline!=null)
        {
            countWordLengths(newline);
            newline=bf.readLine();
        }

        for(int i=0;i<counts.length;i++)
        {
            if(counts[i]!=0)
            System.out.println(counts[i]+" words of length "+i);
            sum=sum+counts[i];
        }
        System.out.println("total words are " + sum );

    }
}
