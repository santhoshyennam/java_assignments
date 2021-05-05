 
import java.io.*;
import java.util.*;
 class Assignment11 {
    private static HashMap<Character,Integer> map=new HashMap<>();
    static void countCharacters(String input){

        for(char c : input.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
    }
    static void writeToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        for(Character c : map.keySet()){
            writer.append(c+" "+map.get(c));
            writer.append("\n");
        }
        writer.close();
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new FileReader(args[0]));
        String newline=br.readLine();
        while(newline!=null){
            countCharacters(newline);
            newline=br.readLine();
        }
        writeToFile();
    }
}