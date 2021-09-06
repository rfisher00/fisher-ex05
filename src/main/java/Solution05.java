/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Fisher
 */

/*
pseudocode:
implement input necessities
prompt user for a number
store number
prompt user for another
store number
print out the sum of the two
print out the difference of the two
print out the product of the two
print out the quotient of the two
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String first = sc.nextLine();
        int num1 =Integer.parseInt(first);
        System.out.print("What is the second number? ");
        String second = sc.nextLine();
        int num2 =Integer.parseInt(second);
        System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d%n", num1, num2, num1 - num2);
        System.out.printf("%d * %d = %d%n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);
    }
}