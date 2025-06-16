package examples;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println(name);
        System.out.println(age);
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter phone number");
        long ph=sc1.nextLong();
        System.out.println("Phone number:"+ph);


    }
}
