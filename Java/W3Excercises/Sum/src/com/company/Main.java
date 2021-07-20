package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        public static int sum(int numOne, int numTwo){
//            int answer = numOne + numTwo;
//            if (numOne < 0 || numTwo < 0){
//                System.out.println("Incorrect input, please enter a positive number.");
//            }
//            else {
//                System.out.println(answer);
//            }
//        }
//

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum: "+sum);

    }
}
