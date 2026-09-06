public class Wrap {
    public static void main(String[]args)
    {
        // Wrapper classes are used to convert primitive data types into objects.
        // For example, int is a primitive data type, and Integer is a wrapper class for int.
        
        int x=Integer.parseInt("123");
        System.out.println(x);
        
       Integer x1= Integer.valueOf("10110",2); //that 2 is represented for converted it into binary and valueOf return object type data
       int y=x1.intValue();  //
       System.out.println(y);

       Double d=Double.valueOf("56");
       double d1=d.doubleValue();
       System.out.println(d1);
        

    }
    
}
