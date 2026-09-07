class ExceptionH3{
    public static void main(String[] args) {
       int cb=10000;
       int wb=4000;
       try {
           if(cb<wb)
           {
            throw new ArithmeticException("Insufficient Balaance");
           }
           cb=cb-wb;
           System.out.println("Transaction Successfull");
           System.out.println("Current Balance is: "+cb);
       } catch (ArithmeticException e) 
       {
        System.out.println(e.getMessage());
            System.out.println("Current Balance is"+cb+":");
       }

    }
}