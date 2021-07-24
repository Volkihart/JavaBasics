package com.company;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {
	// The keyword SUPER is used to access/call the parent class members (variables and methods).
        //The keyword THIS is used to call the current class members (variables and methods). This is required when
        //we have parameters with the same name as an instance variable (field).

        // NOTE:We can use both of them anywhere in a class except static areas(the static block or a static method).
        // Any attempt to do so will lead to compile-time errors(more on a static later in the course).

        //The keyword this is commonly used with constructors and setters, and optionally used in getters
        //(easier for beginners). In the example below we are using the this keyword in the constructor and setter since
        //there is a parameter with the same name. In the getter we don't have any parameters so the this keyword
        //is optional.

        class House {
            private String color;
            public House(String color){
                //this keyword is required, same parameter name as field
                this.color = color;
            }

            public String getColor(){
                //this is optional
                return color; //same as return this.color;
            }

            public void setColor(String color){
                //this keyword is required, same parameter name as field
                this.color = color;
            }
        }

        //The keyword super is commonly used with method overriding, when we call a method
        //with the same name from a parent class. In the example below we have a method
        //printMethod that calls super.printMethod.

        //In other words it's calling the method with the same name from the parent class. Without the keyword super
        // in this case it would be a recursive call. Meaning that the method would call its self forever
        // (or until the memory is fully used). That is why the super keyword is needed.

        class SuperClass { //parent class aka super class
            public void printMethod(){
                System.out.println("Printed in SuperClass.");
            }
        }
        class SubClass extends SuperClass { //subclass aka child class
            //overrides method from parent
            @Override
            public void printMethod(){
                super.printMethod(); //calls method in SuperClass (parent)
                System.out.println("Printed in SubClass");
            }

        }
//        public class Main {
//
//            public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
        //  }
        //  }

        //In Java we have the this() call and the super() call. Notice the braces it is known
        // as a call since it looks like a regular method call.
        //Use this() to call a constructor from another overloaded constructor in the same class.
        //The call to this() can be used only in a constructor, and it must be the first statement in a
        //constructor. It's used with constructor chaining, in other words when one constructor
        //calls another constructor, and helps to reduce duplicated code.

        //The only way to call a parent constructor is by calling super(). This calls the parent constructor.

        //The Java compiler puts a default call to super() if we don't add it, and its always the
        //no-args super which is inserted by the compiler(constructor without arguments).
        //The call to super() must be the first statement in each constructor.
        //Even Abstract classes have constructors, although you can never instantiate an abstract
        //class using the new keyword.
        //An abstract class is still a super class, so its constructors run when someone makes an
        //instance of a concrete subclass.
        //NOTE: A constructor can have a call to super() or this() but not both.

        class Rectangle {
            private int x;
            private int y;
            private int width;
            private int height;

            //1st Constructor
            public Rectangle(){
                this(0,0); //calls 2nd Constructor
            }

            //2nd Constructor
            public Rectangle(int width, int height){
                this(0,0,width,height); //Calls 3rd constructor
            }

            //3rd Constructor
            public Rectangle(int x, int y, int width, int height){
                //initialize variables
                this.x = x;
                this.y = y;
                this.width = width;
                this.height = height;
            }

        }

        //In the example we have three constructors.
        //The 1st calls the 2nd and the 2nd calls the 3rd.
        //The 3rd initializes the variables
        //The 3rd does all the work
        //No matter which one is called it will always pass to the 3rd to initialize
        //This is known as constructor chaining, the last constructor has the
        //"Responsibility" to initialize the variables

        class Shape {
            private int x;
            private int y;

            public Shape(int x, int y){
                this.x = x;
                this.y = y;
            }
        }

        class Rectangle2 extends Shape{
            private int width;
            private int height;
            //1st Constructor
            public Rectangle2(int x, int y){
                this(x,y,0,0); //calls 2nd
            }

            //2nd Constructor
            public Rectangle2(int x, int y, int width, int height){
                super(x,y); //calls constructor from parent(Shape)
                this.width = width;
                this.height = height;
            }

        }
            //In this example we have a class Shape
            //with x,y variables and class Rectangle that extends Shape
        //with variables width and height.

        //In Rectangle, in the 1st const we are call the 2nd const
        //The 2nd const calls the parent const with parameters x and y
        //The parent const will initialize x,y variables while the 2nd Rectangle
        //const will initialize the width and height variables
        //Here we have both the super() and this()

    }
}
