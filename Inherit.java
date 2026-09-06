class Nokia1{
    int x,y;
    Nokia1(int p,int q){
        x=p;
        y=q;
        System.out.println("parent constructor executed");
    }
    void f1(){
        System.out.println("parent finction 1 executed");
    }
    void f2(){
        System.out.println("parent finction 2 executed");
    }
}
class Nokia2 extends Nokia1{
    int z;
    Nokia2()
    {
        // //they call here but compiler first call parent constructor then child constructorby using super keyword.
         super(6,7); // this is optional because compiler automatically call parent constructor first
        System.out.println("child constructor executed");
        System.out.println("x="+x+" y="+y);
    }
    void f3(){
        System.out.println("child finction 1 executed");
    }
}

 class Inherit {
    public static void main(String[]args)
    {
    Nokia2 n1=new Nokia2();
   //  n1.x=10; // this is not possible because x is private in parent class
    
    // n1.f1();
    // n1.f2();
    // n1.f3();
    }
}
