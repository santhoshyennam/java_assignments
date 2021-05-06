class Part1
{
    static String findSimpleGene(String dna)
    {
        int start_codon = dna.indexOf("ATG");
        int stop_codon = dna.indexOf("TAA",start_codon+3);
        if(start_codon!=-1)
       {
            while(stop_codon!=-1)
            {
               
                    if((stop_codon-start_codon)%3==0)
                        return dna.substring(start_codon, stop_codon+3);
                    else
                        stop_codon = dna.indexOf("TAA", stop_codon+1);
                
            }
        }
        return "";
    }
    static void testSimpleGene()
    {
        String dna1="ATGCTGTAC";
        String dna2 = "CGGACTAA";
        String dna3 = "CGGTGGTACG";
        String dna4 = "ATGGGTAAGTAATC";//multiple of 3
        String dna5 = "ATGGGTAATAATC";
        System.out.println("dna1 : "+findSimpleGene(dna1));
        System.out.println("dna2 : "+findSimpleGene(dna2));
        System.out.println("dna3 : "+findSimpleGene(dna3));
        System.out.println("dna4 : "+findSimpleGene(dna4));
        System.out.println("dna5 : "+findSimpleGene(dna5));


    }
    public static void main(String[] args) {
        
        testSimpleGene();
    }
}