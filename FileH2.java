import java.io.FileOutputStream;
import java.io.IOException;

public class FileH2 {
    public static void main(String[] args) throws IOException
    {
        String s1="coding Seekho";
    //   File h1=new File("a.txt");    
    FileOutputStream f1=new FileOutputStream("a.txt",true);
    // f1.write('c');
    char c1[]=s1.toCharArray();
     for (int i = 0;i<c1.length; i++) 
     {
        f1.write(c1[i]); 
     }
    f1.close();
    System.out.println("File Written Successfully");
    }
}
