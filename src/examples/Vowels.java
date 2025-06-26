package examples;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char c1 = sc.next().charAt(0);
        c1 = Character.toLowerCase(c1);
        if((c1 == 'a')||(c1 == 'e')||(c1 == 'i')||(c1 =='o')||(c1=='u')){
            System.out.println(c1+" is vowel");
        }
        else{
            System.out.println(c1+" is a consonant");
        }


    }
}
