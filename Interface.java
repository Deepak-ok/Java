//interface fuction has already predefined that is already(public,static,abstract or final). So that's why it need to override its function for make it usable
//interface can't have a constructor
//can't make object of a interface, but we create a reference varible
//but if made afunction static then you make a body
// we also made an run function public in an process class because in an interface that function is predefined in public or abstract, so we also override them and public also.
interface i1 {

    int x = 5;  //in a interface that variable is predefined in public, static , final 

    void f1();  //or in a function that is already predefined in public, abstract.
    // but if a function is an static function we create a body on that time

    static void f2() {
        System.out.println(x);
    }
}

interface i2 extends i1 {

    int x = 9;
    int y = 2;

    static void f2() {
        System.out.println(x);
    }

    void f3();

}

class c1 implements i2 {

    static void f2() {
        System.out.println(x);
    }

    public void f1() {

    }

    public void f3() {

    }
}

class Interface {

    public static void main(String[] args) {
        i2.f2();  // static variable can be inherited
        //i2.f2(); static member function cannot be inherited
        // c1 C1=new c1();
        // C1.f2();
        //System.out.println(C1.y);
        // i1.f2();
    }
}
