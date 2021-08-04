public class Main {

    public static void main(String[] args) {

        /**  Challenge.
         *  Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
         *  Finally, create another class, a specific type of Car that inherits from the Car class.
         *  You should be able to hand steering, changing gears, and moving (speed in other words).
         *  You will want to decide where to put the appropriate state and behaviors (fields and methods).
         *  As mentioned above, changing gears, increasing/decreasing speed should be included.
         *  For your specific type of vehicle you will want to add something specific for that type of car.
         */


        Challenger challenger = new Challenger(36);
        challenger.steer(45);
        challenger.accelerate(30);
        challenger.accelerate(20);
        challenger.accelerate(-42);
    }

}
