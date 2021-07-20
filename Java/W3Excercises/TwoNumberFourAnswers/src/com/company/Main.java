package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int minus = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println("The Answers are:  \n" );
        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" - "+num2+" = "+minus);
        System.out.println(num1+" x "+num2+" = "+product);
        System.out.println(num1+" / "+num2+" = "+div);
        System.out.println(num1+" % "+num2+" = "+mod);
        System.out.println();
    }
}
