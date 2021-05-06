
public class Part1 {


    static int findStopCodon(String dna,String start_codon,String stop_codon)
    {
        int index_start = dna.indexOf(start_codon);
        int index_stop = dna.indexOf(stop_codon,index_start+3);
        if(index_start!=-1)
       {
            while(index_stop!=-1)
            {
               
                    if((index_stop-index_start)%3==0)
                        return index_stop;
                    else
                        index_stop = dna.indexOf("TAA", index_stop+1);
                
            }
        }
        return dna.length();
    }
    static void testFindStopCodon()
    {
        String dna = "TAAATGGGTTGATAGTAA";
        int start = dna.indexOf("ATG");
        int length = dna.length();
        int stop_TAG = findStopCodon(dna, "ATG", "TAG");
        int stop_TAA = findStopCodon(dna, "ATG", "TAA");
        int stop_TGA = findStopCodon(dna, "ATG", "TGA");
        if(stop_TAA==length && stop_TAG==length && stop_TGA==length)
        {
            System.out.println("no such dna");
        }
        else if((stop_TAG<=stop_TAA)&&(stop_TAG<=stop_TGA))
        {
            System.out.println(dna.substring(start,stop_TAG+3));
        }
        else if(stop_TAA<=stop_TGA)
        {
            System.out.println(dna.substring(start,stop_TAA+3));
        }
        else
        {
            System.out.println(dna.substring(start,stop_TGA+3));
        }
    }
    public static void main(String[] args) {
     testFindStopCodon();   
    }
    
}
