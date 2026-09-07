class ExceptionH1{
    public static void main(String[] args) {
        String s1=null;
        try {
            System.out.println(s1.length());
        } catch (NullPointerException n1) {
            System.err.println(n1.getMessage());
        }
        System.out.println("A");
        try {
            System.err.println(5/0);
        } catch (ArithmeticException e) 
        {
            // System.err.println(e.getMessage());
           
        }
        System.err.println("B");
    }
}