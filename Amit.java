package Package1;  // This is the package declaration
// PS F:\Java classes> javac Amit.java
// PS F:\Java classes> java Amit
// Error: Could not find or load main class Amit
// Caused by: java.lang.NoClassDefFoundError: Amit (wrong name: Package1/Amit)
// PS F:\Java classes> javac -d . Amit.java
//those  command are used to compile and create the class file in the same directory as the source file.
// PS F:\Java classes> javac -d . Amit.java                                                                                            
// PS F:\Java classes> javac -d . Sumit.java          
// PS F:\Java classes> java Package2.Sumit    
//this command is used to run the class file in the same directory as the source file.
public class Amit   //public is used for class and function to accesss this folder from another folder
 {
   private  int x;
    private int y;
    public void setData(int p,int q)
    {
        x=p;
        y=q;
    }
     public void display()
     {
        System.out.println(x);
        System.out.println(y);
     }
    
}
