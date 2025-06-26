package practice;
import java.util.Scanner;
public class Functions {
    public static void main(String_S1[] args) {
        add();
        sub();
    }
    static void add() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);

    }
    static void sub() {
        int a=20;
        int b=30;
        int c=a-b;
        System.out.println("SUB=" + c);
    }
}

