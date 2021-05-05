package coursera.course_2;

public class CaesarCipher {
    
    static String encrypt(String input,int key)
    {
       String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String encrypted_alphabet = alphabet.substring(key)+alphabet.substring(0,key);
       return encrypted_alphabet;
    }
    public static void main(String[] args) {
        System.out.println(encrypt("df", 22));
    }
}
