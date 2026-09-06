class Mahesh
{
  int x;  //instance (object) member variable
  int y;   //instance (object) member variable
 void fun1()  //instance (object) member function
{
 System.out.println("fun1");
}
 void fun2()   //instance (object) member function
{
System.out.println("fun2");
}

}

class Object1
{
 public static void main(String[]args)
 {
System.out.println("hello");
 Mahesh m1=new Mahesh();
  m1.x=5;
  System.out.println(m1.x);
  System.out.println(m1.y);
  m1.fun1();
  m1.fun2();
   
  }
}