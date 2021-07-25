package com.company;

public class Main {

    public static void main(String[] args) {


        /*
        * Static Variables
        *
        * Declared by using the keyword static
        * Static variables are also known as static member variables
        * Every instance of that class shares the same static variable
        * If changes are made to that variable, all other instances will see the effect of the change.
        *
        * Static variables are not used that often but can be very useful
        * For example when reading user input using Scanner we will declare scanner as a static variable
        * That way static methods can access it directly
        *
        * */


        // Static Variable Example
//        class Dog{
//            private static String name;
//
//            public Dog(String name){
//                Dog.name = name;
//            }
//            public void printName(){
//                System.out.println("name = "+name);
//            }
//        }
//        public class Main{
//            public static void main(String[] args){
//                Dog rex = new Dog("rex"); //create instance rex
//                Dog fluffy = new Dog("fluffy");// creates instance fluffy
//                rex.printName(); //prints fluffy
//                fluffy.printName(); //prints fluffy
//            }
//        }

        /*
        * Instance Variables
        * They don't use the static keyword
        * Instance variables are also known as fields or member variables
        * Instance variables belong to an instance of a class
        *
        * Every instance has it's own copy of an instance variable
        * Every instance can have a diff value(state)
        *Instance variables represent the state of an instance
        *
        *
        * */

        //Instance Variable example

//        class Dog {
//            private String name;
//
//            public Dog(String name){
//                this.name = name;
//            }
//
//            public void printName(){
//                System.out.println("name = "+name);
//            }
//        }
//        public class Main {
//            public static void main(String[] args){
//                Dog rex = new Dog("rex"); //create instance rex
//                Dog fluffy = new Dog("fluffy");// creates instance fluffy
//               rex.printName(); //prints fluffy
//                fluffy.printName(); //prints fluffy
//            }
//        }


    }
}
