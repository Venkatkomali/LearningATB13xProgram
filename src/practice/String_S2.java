package practice;

public class String_S2 {
    public static void main(String[] args) {
        String stc1= "Hello";
        String stc2="Hello";
        String stc3=new String("Hello");
        System.out.println(stc1==stc2);
        System.out.println(stc1==stc3);
        System.out.println(stc1.equals(stc3));


    }
}
