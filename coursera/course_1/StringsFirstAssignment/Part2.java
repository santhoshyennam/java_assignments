
 class Part2 {
    static String findSimpleGene(String dna,int start_codon,int stop_codon)
    {
        if(start_codon!=-1 && stop_codon!=-1)
       {
             
                    if((stop_codon-start_codon)%3==0)
                        return dna.substring(start_codon, stop_codon+3);
                    else
                        return findSimpleGene(dna,start_codon,dna.indexOf("TAA",stop_codon+1));
                
            
        }
        return "";
    }
    static void testSimpleGene()
    {
        String dna1="ATGCTGTAC";
        String dna2 = "CGGACTAA";
        String dna3 = "CGGTGGTACG";
        String dna4 = "TAAATGGGTAAGTAATC";//multiple of 3
        String dna5 = "ATGGGTAATAATC";
        System.out.println("dna1 : "+findSimpleGene(dna1.toUpperCase(),dna1.indexOf("ATG"),dna1.indexOf("TAA",dna1.indexOf("ATG")+3)));
        System.out.println("dna2 : "+findSimpleGene(dna2.toUpperCase(),dna2.indexOf("ATG"),dna2.indexOf("TAA",dna2.indexOf("ATG")+3)));
        System.out.println("dna3 : "+findSimpleGene(dna3.toUpperCase(),dna3.indexOf("ATG"),dna3.indexOf("TAA",dna3.indexOf("ATG")+3)));
        System.out.println("dna4 : "+findSimpleGene(dna4.toUpperCase(),dna4.indexOf("ATG"),dna4.indexOf("TAA",dna4.indexOf("ATG")+3)));
        System.out.println("dna5 : "+findSimpleGene(dna5.toUpperCase(),dna5.indexOf("ATG"),dna5.indexOf("TAA",dna5.indexOf("ATG")+3)));
    }
    public static void main(String[] args) {
        testSimpleGene();
    }
}
