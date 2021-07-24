package com.company;

public class Main {

    public static void main(String[] args) {
//              CLASS
//        A class is basically a blueprint for a house, using the blueprint(plans) we can build
//        as many houses as we like based on those plans.
//        Each house you build (in other words instantiate using the new operator) is an object
//        also known as an instance.

//      Each house you build has an address(a physical location). In other words if you want to tell
//      someone where you live,

//      you give them your address(perhaps written on a piece of paper). This is known as reference.
        //You can copy that reference as many times as you like but there is still just one house.
        // In other words we are copying the paper that has
        //the address on it not the house itself.
        //We can pass references as parameters to constructors and methods to constructors and methods.

        House blueHouse = new House("blue"); //Creates a new instance of the House Class
        House anotherHouse = blueHouse;// creates another reference to the same object in memory

        System.out.println(blueHouse.getColor()); //blue
        System.out.println(anotherHouse.getColor()); //blue

        anotherHouse.setColor("red"); //red
        System.out.println(anotherHouse.getColor()); //red

        House greenHouse = new House("green"); //creates a new object in memory, a new house not changing color of same house
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(greenHouse.getColor());
        System.out.println(anotherHouse.getColor());




    }
}
