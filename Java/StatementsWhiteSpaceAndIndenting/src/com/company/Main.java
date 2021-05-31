package com.company;

public class Main {

    public static void main(String[] args) {
	    int myVariable = 50;
	    //noticing white space and indentation to help make it easier to read
	    if (myVariable == 50) {
            System.out.println("Printed");
        }

	    myVariable++;
	    myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");
        //testing typing multiple commands on 1 line
        int anotherVariable = 50;myVariable--;System.out.println("Another test.");
    }
}
