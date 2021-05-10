package Assignment7;



 interface Cycle1 {
     void displayBrand(String brand);
     void displayPrice(int price);
     void getNoOfWheels();
}


 class Unicycle implements Cycle1 {
    public Unicycle() {
        System.out.println("Unicycle class constructor");
    }

    @Override
    public void displayBrand(String brand) {
        System.out.println("This is a "+brand+" Unicycle");
    }

    @Override
    public void displayPrice(int price) {
        System.out.println("This Unicycle is priced at Rs. "+price);
    }

    @Override
    public void getNoOfWheels() {
        System.out.println("A Unicycle has only one wheel");
    }
}

class UnicycleFactory {
    public void show() {
        Unicycle unicycle1 = new Unicycle();
        unicycle1.displayBrand("AVON");
        unicycle1.displayPrice(700);
        unicycle1.getNoOfWheels();
    }

}
public class Part4 {
    public static void main(String[] args) {
        UnicycleFactory u = new UnicycleFactory();
        u.show();

        //same form bicycle and tricycle also
    }
}
