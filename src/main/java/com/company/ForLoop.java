package com.company;

public class ForLoop {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[] { 2, 8, 9, 1, 3 };
        int max = arr[0]; //8
        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            //8>2, 9>8
            if (arr[i] > max)
            {
                max = arr[i];
            }
            else
            {
                min = arr[i];

            }
        }

        System.out.println("Your maximum number is " + max);
        System.out.println("Your minimum number is " + min);


    }
}
