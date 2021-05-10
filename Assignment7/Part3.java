package Assignment7;

interface A {
    void A1();
    void A2();
}
interface B {
    void B1();
    void B2();
}
interface C {
    void C1();
    void C2();
}
interface InterfaceCombine extends A, B, C {
    void setMessage();
}

 class Part3 implements InterfaceCombine {
    @Override
    public void A1() {
        System.out.println("A1 method");
    }
    @Override
    public void A2() {
        System.out.println("A2 method");
    }
    @Override
    public void B1() {
        System.out.println("B1 method");
    }
    @Override
    public void B2() {
        System.out.println("B2 method");
    }
    @Override
    public void C1() {
        System.out.println("C1 type method");
    }
    @Override
    public void C2() {
        System.out.println("C2 method");
    }
    
    public void setMessage()
    {
        System.out.println("set message method");

    }

    void display1(A a){
        a.A1();
    }
    void display2(B b){
        b.B1();
    }

    void display3(C c){
        c.C2();
    }

    void interfaceCombineMethod(InterfaceCombine interfaceCombine){
        interfaceCombine.setMessage();
        System.out.println(interfaceCombine.toString());
    }

    public static void main(String[] args) {
        Part3 d=new Part3();

        d.display1(d);
        d.display2(d);
        d.display3(d);
        

    }
}



