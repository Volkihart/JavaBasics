package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        boolean hasNextInt = input.hasNextInt();


        while(true){
            int order = counter + 1;
            System.out.println("Enter number #"+order+" : ");

            boolean isAnInt = input.hasNextInt();
            if(isAnInt) {
                int number = input.nextInt();
                counter++;
                sum += number;
                if(counter == 10){
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            input.nextLine(); // handle end of line (Enter key)
        }
        System.out.println("sum = " + sum);
        input.close();
    }
}
