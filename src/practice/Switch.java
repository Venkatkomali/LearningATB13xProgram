package practice;


import java.util.Scanner;

public class Switch {
    public static void main(String_S1[] args) {
        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter the Values");
        int Day= sc1.nextInt();

        switch (Day) {
            case 1 :
                System.out.println("MON");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3 :
                System.out.println("Web");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Not allowed");
                break;

        }
    }
}
