import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {
    static int count;
    static void findFolder(String path)
    {
        File directory = new File(path);

        File[] list = directory.listFiles();
        if(list==null || list.length==0)
        return;
        for(File s:list)
        {
           
            if(s.isDirectory())
            findFolder(s.getAbsolutePath());
            else
            checkRegular(s,s.getAbsolutePath());
        }
       // System.out.println("total: "+count);
    }
    static void checkRegular(File f,String path){
        Pattern pattern = Pattern.compile(".*[.]java");
        Matcher m = pattern.matcher(f.getName());
        if(m.matches())
        {
        System.out.println("match found "+path);
        count++;
        }
    }
    public static void main(String[] args) throws Exception {
        findFolder("/home/sankmy/");
        System.out.println(count);
    }
}
