package examples;

import java.util.Scanner;

public class Vowels_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");

        String input= sc.nextLine();
        int vowels=0;
        int consonants=0;

        input=input.toLowerCase();

        for(int i=0; i < input.length();i++){
            char ch=input.charAt(i);

            if (ch=='i' || ch=='a' || ch=='e' || ch=='o' || ch=='u'){
                vowels++;
            }
            else {
                consonants++;
            }


        }
        System.out.println("Vowels are "+vowels);
        System.out.println("consonants are "+consonants);

    }
}
