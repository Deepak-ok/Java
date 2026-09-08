
import java.util.*;

// collection is an interface but 
//Collections is a class
class Collection1{
    public static void main(String[] args) {
        ArrayList l1=new ArrayList(5);
        l1.add("A");
        l1.add("B");
        l1.add("c");
        l1.add("D");
       l1.add(2,"L");
        // System.out.println(l1);
        Iterator g1=l1.iterator();
        while (g1.hasNext())
         { 
            String s1=(String)g1.next();
            if (s1!="B") {
             System.out.println(s1);   
            }
            // System.out.println(g1.next());
        }
    }
}