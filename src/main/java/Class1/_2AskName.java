package Class1;

import java.util.Scanner;

public class _2AskName
{
    public static void main(String[] args)
    {
        System.out.print("Please Enter your name: "); //single line print
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Welcome to Class !!" +name);
    }
}
