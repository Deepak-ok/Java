//multi threading is define by two typpes thats-
// first one is used runnable interface
//in this interface we can't create a object, but we create an object of a child. so thats why that runnable is child class for passing the process variable to a thread
// we also made an run function public in an process class because in an interface that function is predefined in public or abstract, so we also override them and public also.
class Process1 implements Runnable {
  public void run(){

   {
        int i;
       for (i = 1; i<=10; i++) {
           System.out.println("Process 1:"+i);
       }
   }
  }
}
class Process2 implements Runnable
{
   public  void run(){

   {
        int i;
       for (i = 1; i <=10; i++) {
           System.out.println("Process 2:"+i);
       }
   }
  }
}
class MultiT1 {
  public static void main(String[] args) {
      Process1 p1=new Process1();
      Process2 p2=new Process2();
      Thread t1=new Thread(p1);
       Thread t2=new Thread(p2);
       t1.start();
       t2.start();
  }
}