package com.company;

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub-classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
        }
}

class Dodge extends Car {
    public Dodge(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Dodge -> startEngine";
    }
    @Override
    public String accelerate(){
        return "Dodge -> accelerate()";
    }
    @Override
    public String brake(){
        return "Dodge -> brake()";
    }
}

class Chevrolet extends Car{
    public Chevrolet(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake(){
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

        @Override
        public String startEngine(){
            return "Ford -> startEngine";
        }
        @Override
        public String accelerate(){
            return "Ford -> accelerate()";
        }
        @Override
        public String brake(){
            return "Ford -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Dodge dodge = new Dodge(6, "Dodge Challenger");
        System.out.println(dodge.startEngine());
        System.out.println(dodge.accelerate());
        System.out.println(dodge.brake());

        Ford ford = new Ford(6, "Ford Mustang");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Chevrolet chevrolet = new Chevrolet(6, "Chevrolet Chevelle");
        System.out.println(chevrolet.startEngine());
        System.out.println(chevrolet.accelerate());
        System.out.println(chevrolet.brake());
    }
}
