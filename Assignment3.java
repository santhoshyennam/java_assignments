import java.net.InetAddress;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the ip address");

        String host =new String(sc.next());
        long t1 = System.currentTimeMillis();
        InetAddress ip = InetAddress.getByName(host);
        System.out.println("Sending Ping Request to " + ip);
        if(ip.isReachable(5000))
            System.out.println("Host is reachable");
        else
        System.out.println("Sorry ! We can't reach to this host");
        long t2=System.currentTimeMillis();

        System.out.println("Time take is "+(t2-t1));
    }
}
