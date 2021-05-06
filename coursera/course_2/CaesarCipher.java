import java.io.*;
public class CaesarCipher {
    static String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String encrypt(String input,int key)
    {
       String encrypted_alphabet = alphabet.substring(key)+alphabet.substring(0,key);
        char[] input_array = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch:input_array)
        {
            int index= alphabet.indexOf(ch);
            if(index!=-1)
            sb.append(encrypted_alphabet.charAt(index));
        }
       return sb.toString();
    }
    static void testCeasar() throws Exception
    {
        BufferedReader br =new BufferedReader(new FileReader("example.txt"));
        String newline=br.readLine();
        while(newline!=null){
            System.out.println(encryptTwoKeys(newline, 23,22));
            newline=br.readLine();
        }
    }
    static String encryptTwoKeys(String input,int key1,int key2)
    {
        String encrypt_key1 =alphabet.substring(key1)+alphabet.substring(0,key1);
        String encrypt_key2 = alphabet.substring(key2)+alphabet.substring(0,key2);
        char[] input_array = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(char ch:input_array)
        {
            int index= alphabet.indexOf(ch);
            if(index!=-1)
            {
                if(i%2==0)
                    sb.append(encrypt_key1.charAt(index));
                else
                sb.append(encrypt_key2.charAt(index));

            }
            i++;
        }
       return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        System.out.println(encrypt("FIRST LEGION ATTACK EAST FLANK", 23));
        testCeasar();
    }
}
