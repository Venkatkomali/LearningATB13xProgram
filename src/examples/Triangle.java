package examples;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Enter sides of triangle");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        System.out.println("The sides of triangle are:");
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
        if(s1==s2&&s2==s3){
            System.out.println("It is equilateral triangle");

        }
        else if(s1!=s2&&s2!=s3){
            System.out.println("It is scalene triangle");
        }
        else{
            System.out.println("It is isoceles triangle");
        }
    }
}
