package com.company;

public class Main {

    public static void main(String[] args) {


        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;   // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;  // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;  // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;  // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        // result = result / 3;
        result /= 3;
        System.out.println("30 / 3 = " + result);

        // result = result - 2 = 8;
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens!");
        }
        int topScore = 85;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Operator Challenge
        //1. Create a double variable with the value of 20.00
        //2. Create a second variable with the type double and the value 80.00
        //3. Add both numbers together and multiply by 100.00
        //4. Use the remainder operator to figure out what the remainder from the result of the operation in
        // step 3 and 40.00. We used the modulus or remainder operator on the ints in the course but can be used on a double
        //5. create a boolean variable that assigns the value true if the remainder in #4 is 0 or false if its not 0
        //6.output the boolean variable
        //7. Write an if-then statement that displays a message "Got some remainder" if the boolean in 5 is not true.

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double doubleAnswer = (firstDouble + secondDouble) * 100.00d;
        System.out.println("doubleAnswer = " + doubleAnswer);
        double doubleRemainder = doubleAnswer % 40.00d;
        System.out.println("doubleRemainder = " + doubleRemainder);
        boolean isNoRemainder = (doubleRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }




    }
}
