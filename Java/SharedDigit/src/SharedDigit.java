public class SharedDigit {

    public static boolean hasSharedDigit (int one, int two) {

        int modulusOne = one % 10;
        int modulusTwo = two % 10;
        int divisionOne = one / 10;
        int divisionTwo = two / 10;

        if ((one < 10 || one > 99) || (two < 10 || two > 99)) {
            return false;
        } else if (one == two){
            return true;
        } else if (modulusOne == modulusTwo){
            return true;
        } else if (divisionOne == divisionTwo){
            return true;
        } else if (divisionOne == modulusTwo){
            return true;
        } else if (divisionTwo == modulusOne){
            return true;
        } else {
            return false;
        }
    }
}