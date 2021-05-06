
public class Part2 {
    
    static int howMany(String one,String two)
    {
        int count=0;
        int index= two.indexOf(one);
        while(index!=-1)
        {
            count++;
            index = two.indexOf(one,index+one.length());
            
        }
        return count;
    }
    public static void main(String[] args) {
        int n = howMany("GAA","ATGAACGAATTGAATC");
        System.out.println(n);
        n = howMany("AA","ATAAAA");
        System.out.println(n);

    }
}
