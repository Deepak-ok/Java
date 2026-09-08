import java.util.HashSet;

class HSet {
    public static void main(String[] args) {
        HashSet h1=new HashSet<>();
        h1.add("c");
        h1.add("c++");
         System.out.println(h1.add("c"));
        h1.add("java");
        h1.add("ruby");
        System.out.println(h1);
    }
    
}
