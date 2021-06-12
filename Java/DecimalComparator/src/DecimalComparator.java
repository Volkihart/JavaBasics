public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

        long x = (long)(numberOne * 1000);
        long y = (long)(numberTwo * 1000);


        if (x == y)
        {
            return true;
        } else{
            return false;
        }
    }
}
