public class Assignment6 {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static void main(String[] args) {
        

        ConstructorOverload obj =new ConstructorOverload();
        System.out.println();
        //Create an array of class Check Objects
        Demo arr[]=new Demo[10];
        System.out.println();
        //If the program is run now there is not message that constructor is called
        for(int i=0;i<10;i++){
            arr[i]=new Demo(randomAlphaNumeric((i+4)%10+1));
        }
    }

    private static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}


//Class with Overloaded Constructors
class ConstructorOverload{
    ConstructorOverload(){
        this(10);
        System.out.println("Overloaded constructor without parameters");
    }
    ConstructorOverload(int a){
        System.out.println("Overloaded constructor called with value:"+a);
    }
}

//task 3: class with string as parameter constructor

class Demo{
    Demo(String s){
        System.out.println("Constructor called with argument : "+s);
    }
}
