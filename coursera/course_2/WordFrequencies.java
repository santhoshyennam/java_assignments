import java.util.ArrayList;


import java.io.*;
public class WordFrequencies {
      ArrayList<String> myWords;
     ArrayList<Integer> myFreqs;
     int index,value;

    WordFrequencies()
    {
        myWords = new ArrayList<String>();   
        myFreqs = new ArrayList<Integer>();

    }
     void findUnique() throws Exception
    {
       myFreqs.clear();
       myWords.clear();
      
        BufferedReader br =new BufferedReader(new FileReader("input.txt"));
        String newline=br.readLine();
        while(newline!=null){
            String[] words =newline.split(" ");
            for(int i=0;i<words.length;i++)
            {
               
                if(!myWords.contains(words[i]))
                {
                    myWords.add(words[i]);
                    myFreqs.add(1);
                }
                else{
                    index = myWords.indexOf(words[i]);
                    value = myFreqs.get(index);
                    myFreqs.set(index,value+1);
                }
            }
            newline=br.readLine();
        }

    }
    void writeoutput() throws Exception
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        for(int i=0;i<myFreqs.size();i++){
            System.out.println(myWords.get(i)+"\t"+myFreqs.get(i));
           // writer.write(myWords.get(i)+"\t"+myFreqs.get(i));
        }
        
        writer.close();
    }
    void  maxcountWord()
    {
        int max=0,max_index=0;
        for(int i=0;i<myFreqs.size();i++){
            if(myFreqs.get(i)>max)
            {
            max=myFreqs.get(i);
            max_index=i;
            }
        }

        System.out.println("max word is "+myWords.get(max_index)+"\t "+myFreqs.get(max_index));


    }
    public static void main(String[] args) throws Exception
     {
         WordFrequencies w = new WordFrequencies();
        w.findUnique();
        w.writeoutput();
        w.maxcountWord();
        
    }   
}
