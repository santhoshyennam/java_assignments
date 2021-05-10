import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;
public class BabyBirths {
    
    static void printNames(FileResource fr)
    {
        //FileResource fr=new FileResource();
        for(CSVRecord rec:fr.getCSVParser(false))
        {
            int numBorn=Integer.parseInt(rec.get(2));
            System.out.println("Name :"+rec.get(0)+" Gender : "+rec.get(1)+" Num Born:"+ rec.get(2));
        }
    
    }

    static String getName(FileResource fr,int rank,String gender)
    {
        int total=0;
        for(CSVRecord rec:fr.getCSVParser(false))
        {
            if(rec.get(1).equals(gender))
            {
                total+=1;
                if(rec.get(1).equals(gender) && total==rank)
                {
                    return rec.get(0);
                }
            
            
            }
        }
        return "";
    }

    static void printCount(FileResource fr)
    {
        
        int total=0;
        int numBoys=0,numGirls=0;
        for(CSVRecord rec:fr.getCSVParser(false))
        {
            int numBorn=Integer.parseInt(rec.get(2));
            total+=numBorn;
            if(rec.get(1).equals("M"))
            {
            numBoys+=numBorn;
            }
            if(rec.get(1).equals("F"))
            {
            numGirls+=numBorn;
            }
            
        }
            System.out.println("Total count"+total);
            System.out.println("Boys count"+numBoys);
            System.out.println("Girls count"+numGirls);
    }

    static int getRank(FileResource fr,String name,String gender)
    {
        
        int total=0;
        //int numBoys=0,numGirls=0;
        for(CSVRecord rec:fr.getCSVParser(false))
        {
            //int numBorn=(rec.get(1));
            if(rec.get(1).equals(gender))
            {
                total+=1;
                if(rec.get(0).equals(name))
                {
                    System.out.println("Rank is "+total);
                    return 1;
                }
            
            
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FileResource fr=new FileResource();
        printNames(fr);
        printCount(fr);
        int rank = getRank(fr,"Mason","M");
        if(rank==-1)
        {
            System.out.println("No such person exist");

        }

        String name = getName(fr,23,"M");
        System.out.println("Name is "+name);

    }
}
