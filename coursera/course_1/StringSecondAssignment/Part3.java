
 class Part3 {
    
    //consider start codon as ATG and stop codon as TAA
    /*static int findSimpleGene(String dna)
    {
        int count =0;
        int start_codon = dna.indexOf("ATG");
        int stop_codon = dna.indexOf("TAA",start_codon+3);
        if(start_codon!=-1)
       {
            while(stop_codon!=-1)
            {
               
                    if((stop_codon-start_codon)%3==0)
                    {
                        System.out.println(dna.substring(start_codon, stop_codon+3));
                        count++;
                        start_codon = dna.indexOf("ATG", stop_codon+3);
                        stop_codon = dna.indexOf("TAA", start_codon+3);
                    }
                    else
                        stop_codon = dna.indexOf("TAA", stop_codon+1);
                
            }
           
        }
        return count;
    }*/

    static int findStopCodon(String dna,int start,int stop)
    {
       
        if(start!=-1)
       {
            while(stop!=-1)
            {
               
                    if((stop-start)%3==0)
                        return stop;
                    else
                        stop = dna.indexOf("TAA", stop+1);
                
            }
        }
        return dna.length();
    }
    //start codon as ATG and stop codon as TAA,TAG,TGA
    static int findSimpleGene(String dna)
    {
        int count =0;
        int length = dna.length();
        int start = dna.indexOf("ATG");
      
        while(true)
        {
            int stop_TAG = findStopCodon(dna, start, dna.indexOf("TAG",start+3));
            int stop_TAA = findStopCodon(dna, start, dna.indexOf("TAA",start+3));
            int stop_TGA = findStopCodon(dna, start, dna.indexOf("TGA",start+3));
    
            if(start==-1)
            break;        
            if(stop_TAA==length && stop_TAG==length && stop_TGA==length)
            {
                //System.out.println("no such dna");
                start =dna.indexOf("ATG",start+3);
            }
            else if((stop_TAG<=stop_TAA)&&(stop_TAG<=stop_TGA))
            {
                System.out.println(dna.substring(start,stop_TAG+3));
                start =  dna.indexOf("ATG",stop_TAG+3);
                count++;
               
            }
            else if(stop_TAA<=stop_TGA)
            {
                System.out.println(dna.substring(start,stop_TAA+3));
                start =  dna.indexOf("ATG",stop_TAA+3);
                count++;
            }
            else
            {
                System.out.println(dna.substring(start,stop_TGA+3));
                start =  dna.indexOf("ATG",stop_TGA+3);
                count++;
            }
          
           


        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findSimpleGene("ATGTAA G ATGCCCTGA TAATAATGA ATGTGGTAG"));
    }
}
