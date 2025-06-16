package examples;

public class EvenOdd {
    public static void main(String[] args) {
        String A_string = args[1];
        int A= Integer.parseInt(A_string);
        String result = (A%2 == 0) ? "Even" : "Odd" ;
        System.out.println(result);


    }
}
