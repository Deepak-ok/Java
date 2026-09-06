package Package2;
import Package1.*;
public class Sumit {
   public static void main(String[]args)
   {
     Amit a1=new Amit();
     a1.setData(5,6);
     a1.display();
   } 
}
// PS F:\Java classes> javac -d . Amit.java, this commad is for make a folder in current directory                                                                                   
// PS F:\Java classes> javac -d . Sumit.java          
// PS F:\Java classes> java Package2.Sumit, this commad is used for run that file
//this command is used to run the class file in the same directory as the source file.
