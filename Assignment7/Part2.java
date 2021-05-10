package Assignment7;


 class Cycle
{
    Cycle()
    {
       // System.out.println("cycle constructor");

    }
   
}
class Unicycle extends Cycle
{
    void balance()
    {
        System.out.println("balance in unicycle");
    }
}
class Bicycle extends Cycle
{
    void balance()
    {
        System.out.println("balance in bicycle");
    }
}
class Tricycle extends Cycle
{

}
public class Part2 {
    
    public static void main(String[] args) {
        Cycle[] c = new Cycle[3];
        Unicycle u = new Unicycle();
        c[0]=u;
        c[1]=new Bicycle();
        c[2]=new Tricycle();

        for(Cycle x:c)
        {
            //gives error because cycle do not have balance method
            //x.balance();
        }
        Unicycle unicycle =(Unicycle)c[0];
        unicycle.balance();
        Bicycle b = (Bicycle)c[1];
        b.balance();
        Tricycle t = (Tricycle)new Cycle();
        //do not have balance method in tricylce class,gives error
        //t.balance();
    }
}
