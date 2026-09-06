class Demo{
    int x,y;
    Demo(int p,int q)
    {
         System.out.println("constructor 1 is executed");
        x=p;
        y=q;
    }
    Demo(int f)
    {

    }
    Demo()
    {

    }
    void f1()
    {
        System.out.println("f1 is executed");
        x=22;
        y=33;
    }

}
class Construct {
    public static void main(String[]args)
    {
       Demo d1=new Demo(5,6);
    //    d1.f1();
       System.out.println(d1.x);
       System.out.println(d1.y);

    //   Demo d2=new Demo(8);
    //    Demo d3=new Demo();

    }
    
}
