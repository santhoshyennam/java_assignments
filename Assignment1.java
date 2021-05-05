import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {
    static int count;
    static void findFolder(String path)
    {
        File directory = new File(path);

        String[] list = directory.list();
        if(list==null || list.length==0)
        return;
        for(String s:list)
        {
            File file = new File(path+s);
            if(file.isDirectory())
            findFolder(file.getAbsolutePath());
            else
            checkRegular(file,file.getAbsolutePath());
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
        File directory = new File("/home/sankmy/Desktop/");
        findFolder("/home/sankmy/Desktop/");
        System.out.println(count);
    }
}
