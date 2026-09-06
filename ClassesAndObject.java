class Nokia{
    private int mic;
    private int cam;
    void setValue()
    {
      mic=2;
      cam=3;
    }
    void display()
    {
      System.out.println(mic);
        System.out.println(cam);
    }
}

class ClassesAndObject {
    public static void main(String[]args)
    {
      Nokia n1=new Nokia();
      n1.display();  //in this line they display 0 0 alue mic cam because they not set value in it
      n1.setValue(); //after the setvalue 
      n1.display();  //they display the value  2 3  because in previous line they set value in mic cam varable
    }
}
