
public class Part3 {
    static int count=0;
    static boolean twoOccurrences(String one,String two)
    {
        int index= two.indexOf(one);
        while(index!=-1)
        {
            count++;
            if(count==2)
            return true;
            index = two.indexOf(one,index+one.length());
            
        }
        return false;
    }
    static String lastPart(String a,String b)
    {
        int index = b.indexOf(a);
        if(index!=-1)
        return b.substring(index+a.length(), b.length());
        else
        return b;
    }
    public static void main(String[] args) {
        System.out.println(twoOccurrences("byby", "A story bybyby Abbyby Long"));
        System.out.println(lastPart("an", "banana"));
    }
    
}
