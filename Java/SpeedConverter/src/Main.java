public class Main {
    public static void main(String[] args) {
       double miles = SpeedConverter.toMilesPerHour(50);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(50);
    }
}
