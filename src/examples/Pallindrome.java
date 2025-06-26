package examples;


import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner sc= new Scanner(System.in);
        String userInput= sc.next();
        String reverse="";
        for(int i= userInput.length()-1;i>=0;i--){
            reverse=reverse+userInput.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equals(userInput)){
            System.out.println("It is a pallindrome");
        }
        else{
            System.out.println("It is not a pallindrome");
        }


    }
}
