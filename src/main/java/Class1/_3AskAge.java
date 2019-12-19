package Class1;

import java.util.Scanner;

public class _3AskAge {
    public static void main(String[] args){
        System.out.println("Please enter your Age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("Your age is " +age);
    }
}
