package Assignment7;


 class Rodent {
    public void hasTail(){
        System.out.println("All Rodents have tails");
    }
}
class Mouse extends Rodent{
    Mouse(){
        System.out.println("Constructor of a Mouse class");
    }
    @Override
    public void hasTail() {
        //super.hasTail();
        System.out.println("Mouse tail");
    }
}
class Gerbil extends Rodent{

    Gerbil(){
        System.out.println(" Constructor of Gerbill Class");
    }

    @Override
    public void hasTail() {
        System.out.println("Gerbill tail");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("constructor of Hamster Class");
    }
    @Override
    public void hasTail() {
        System.out.println("Hamster tail");
    }
}
public class Part1 {

    public static void main(String[] args) {
        Rodent[] r = new Rodent[3];
        r[0]= new Mouse();
        r[0].hasTail();
        r[1]= new Gerbil();
        r[1].hasTail();
        r[2]= new Hamster();
        r[2].hasTail();
    }
    
}
