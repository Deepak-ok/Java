class ExceptionH2{
    public static void main(String[] args) {
        System.out.println("A");
        String s1=null;
        try {
            System.out.println(s1.length());
        } 
        // catch (ArrayIndexOutOfBoundsException n1) 
        // {
        //     System.err.println(n1.getMessage());
        // }
      
        // catch (ArithmeticException e) 
        // {
        //     System.err.println(e.getMessage());
           
        // }

         catch (Exception e) 
        {
            System.err.println(e.getMessage());
           
        }
        
      finally
      {
          System.err.println("B");
      }
    }
}