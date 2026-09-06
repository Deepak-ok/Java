class Area
{
 static void fun1()
{
  System.out.println("Area a");
}
 static void fun2()
{
  System.out.println("Area b");
}
}

class Example
{
 static void fun1()
{
  System.out.println("a");
}
 static void fun2()
{
  System.out.println("b");
}
public static void main(String[]args)
{   Area.fun1();
     Area.fun2();
    System.out.println("c");
  fun1();
fun2();
}
}
