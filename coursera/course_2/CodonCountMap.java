
import java.util.HashMap;

public class CodonCountMap {
    HashMap<String,Integer> map;
    CodonCountMap()
    {
        map = new HashMap<String,Integer>();
    }
     void buildCodonMap(String dna,int start)
    {
        
        int i=start;
        int count = 0;
        while(i<=dna.length()-3)
        {
         count = map.getOrDefault(dna.substring(i, i+3),0);
         //System.out.println(dna.substring(i,i+3));
         map.put(dna.substring(i, i+3),count+1);
         i+=3;
        }
    }
    String getMostCommonCodon()
    {
        int max=0;
        String max_codon="";
        for(String s:map.keySet())
        {
            if(map.get(s)>max)
            {
            max=map.get(s);
            max_codon = s;
            }
        }
        return max_codon;
    }
    void printCodonCounts(int start,int end)
    {
        for(String s:map.keySet())
        {
            if(map.get(s)>=start && map.get(s)<=end)
            {
                System.out.println(s+"\t"+ map.get(s));
            }
        }
    }
    public static void main(String[] args) {
        CodonCountMap c = new CodonCountMap();
        c.buildCodonMap("CGTTCAAGTTCAA", 0);
        c.buildCodonMap("CGTTCAAGTTCAA", 1);
        c.buildCodonMap("CGTTCAAGTTCAA", 2);
        c.printCodonCounts(1, 2);

        System.out.println(c.getMostCommonCodon());
    }
}
