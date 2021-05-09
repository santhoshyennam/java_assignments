package santhosh.assignment.main;
import santhosh.assignment.data.Demo;
import santhosh.assignment.singleton.Demo1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to pass:");
        Demo1 obj = Demo1.getDetails(sc.next());
        obj.display();
        System.out.println();
        Demo d = new Demo();
        d.display();
    }
}
