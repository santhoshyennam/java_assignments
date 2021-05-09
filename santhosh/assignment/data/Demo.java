package santhosh.assignment.data;
public class Demo {
    
    int a;
    char b;
    public void display()
    {
        //takes default values
        System.out.println(a+"\n"+b);
    }
    void show()
    {
        int x,y;
        //this gives error. because local variables are not initialized
       // System.out.println(x+"\n"+y);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
        d.show();
    }
}
