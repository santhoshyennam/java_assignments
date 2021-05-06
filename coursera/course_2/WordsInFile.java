import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//codon count
public class WordsInFile {
    
    HashMap<String,Integer> map;
    WordsInFile()
    {
        map = new HashMap<String,Integer>();
    }
    void addWordsFromFile(File f) throws Exception
    {
        BufferedReader bf = new BufferedReader(new FileReader(f));
        String newline = bf.readLine();
        while(newline!=null)
        {
            for(String s:newline.split(" "))
            {
                map.put(s, map.getOrDefault(s, 0)+1);   
            }
            newline = bf.readLine();
        }
    }
    void buildWordFileMap() throws Exception
    {
        File directory = new File("/home/sankmy/Desktop/java Assignments/");
        File[] files = directory.listFiles();

        for(File file:files)
        {
            Pattern p = Pattern.compile(".*[.]java");
            Matcher m = p.matcher(file.getName());
            if(m.matches())
            {
            //System.out.println(file.getName());
            addWordsFromFile(file);
            }
        }
    }
    void getMap()
    {
        for(String s:map.keySet())
        {
            System.out.println(s+"\t"+map.get(s));
        }
    }
    public static void main(String[] args) throws Exception {
        WordsInFile w = new WordsInFile();
        w.buildWordFileMap();
        w.getMap();
    }
}
