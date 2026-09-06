// if a class is abstract then it can be accessible by only child class.
// if any function is abstract in any class then this cclass is must be abstract.
// if any abstract function is inherit in child class then this child class is also make a abstract class. but for tackle them they override that  function for accessible them .
abstract class Demo1{
    int x,y;
    void f1(){
        x=5;
        y=2;
    }
    abstract void f2();
    Demo1(){
        System.out.println("parent's constructor");
    }
    
}
class Demo2 extends Demo1{
    int z;
    void f3()
    {
        z=8;
    
    }
    void f2()  //override function for using
    {

    }
    Demo2(){
        System.out.println("child's constructor");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Demo2 d1=new Demo2();
    //    d1.f3();
          // System.out.println("z="+d1.z);

    }
}
