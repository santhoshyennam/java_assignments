package santhosh.assignment.singleton;
public class Demo1 {
        String x;
       static Demo1 m = new Demo1();
        public static Demo1 getDetails(String x)
        {
            m.x =x;
            return m;
        }
        public void display()
        {
            System.out.println(x);
        }
    
        public static void main(String[] args) {
            Demo1 d = new Demo1();
            d=getDetails("hello");
            d.display();
        }
    
    
}
