
import java.util.ListIterator;
import java.util.Vector;

public class Cursors {

    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.add("E");
        //   Enumeration k1=v1.elements();
        //   while (k1.hasMoreElements()) {
        //    System.out.println(k1.nextElement());
        //     }

        // Iterator e1=v1.iterator();
        // while (e1.hasNext()) 
        // {
        // //    System.out.println(e1.next()); 
        //  String s1=(String)e1.next();
        //  if (s1=="D" || s1=="A") {
        //     e1.remove(); 
        //  } else {
        //     System.out.println(s1);
        //  }
        // }

        ListIterator l1 = v1.listIterator();
        while (l1.hasNext()) {
            //  System.out.println(l1.next());
            String s1 = (String)l1.next();
            if (s1.equals("A")) {
                l1.set("C Programming");
            } else if (s1.equals("B")) {
                l1.set("C++ Programming");
            } else if (s1.equals("C")) {
                l1.add("python");
            }
            else if (s1.equals("D")) {
                l1.remove();
            }
         System.out.println(s1);
        }
   
        while (l1.hasPrevious()) {
            System.out.println(l1.previous());
        }
    }
}
