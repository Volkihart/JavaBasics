package com.company;

public class Main {

    public static void main(String[] args) {

        /*              Method Overloading
        * Method overloading means providing two or more separate methods in a class
        *with the same name but different parameters.
        *Method return type may or may not be different and that allows us to reuse the same method name.
        *Overloading is very handy, it reduces duplicated code and we don't have to remember multiple method names.
        *
        *Overloading does not have anything to do with polymorphism but Java devs often refer to overloading as
        * Compile Time Polymorphism. In other words the compiler decided which method is going to be called
        * based on the method name, return type and argument list.
        * We can overload static and instance methods.
        *
        *Usually overloading happens inside a single class, but a method
        * can also be treated as overloaded in the subclass of that class.
        * That is because a subclass inherits one version of the method
        * from the parent class and then the subclass can have another overloaded version of the method.
        *
        * Methods will be considered overloaded if both follow the following rules:
        *Methods must have the same method name
        *Methods must have different parameters
        *
        *If methods follow the rules above then they may or may not
        * Have different return types
        * have different access modifiers
        * Throw different checked or unchecked exceptions
        *
        * */


        /*               Method Overriding
        *Method overriding means defining a method in a child class that already exists in the
        * parent class with the same signature(same name and arguments)
        *
        * By extending the parent class the child class gets all the methods defined in the parent class
        * (those methods are also known as derived methods)
        *
        * Method overriding is also known as Runtime Polymorphism and Dynamic Method Dispatch
        *because the method that is going to be called is decided at runtime by the JVM
        *
        *When we override a method it's recommended to put @Override immediately
        * above the method definition. This is an annotation that the compiler reads
        * and will then show us an error if we don't follow overriding rules correctly
        *
        *We can't override static methods only instance methods.
        *
        *Method will be considered overridden if we follow these rules:
        * It must have the same name and arguments
        * Return type can be a subclass of the return type in the parent class
        * It can't have a lower access modifier
        * For Example if the parent method is protected then using private in the child
        * is not allowed but using public in the child would be allowed
        *
        * Only inherited methods can be overridden, in other words methods can be
        * overridden only in child classes.
        *
        * Constructors and private methods cannot be overridden
        * Methods that are final cannot be overridden
        * A subclass can use super.methodName() to call the superclass version of an
        * overridden method.
        * */


        // Overriding example

        class Dog {
            public void bark(){ //>>>>>same name and same parameters
                System.out.println("woof");
            }
        }

        class GermanShepherd extends Dog {
            @Override
            public void bark(){ //>>>>>same name and same parameters
                System.out.println("woof woof woof");
            }
        }



        //Overloading example

        class Dog2 {
            public void bark(){   //>>>>>>>>same name different parameters
                System.out.println("woof");
            }

            public void bark(int number){ //>>>>>>>>same name different parameters
                for(int i = 0; i < number; i++){
                    System.out.println("woof");
                }
            }
        }

        //RECAP

        /*
        * Method Overloading
        * -------------------
        * Provides functionality to reuse a method name with diff parameters
        * Usually in a single class but also used in a child class
        * Must have different parameters
        * May have different return types
        * May have different access modifiers(private, protected, public)
        * May throw different exceptions
        * */

        /*
        * Method Overriding
        * ________________
        * Used to override a behavior which the class has inherited from the parent class
        * Always in two classes that have a child-parent or IS-A relationship
        * Must have the same parameters and same name
        * Must have the same return type or covariant return type (child class)
        * Must not have a lower modifier but may have a higher modifier
        * Must not throw a new or broader checked exception
        * */



    }
}
