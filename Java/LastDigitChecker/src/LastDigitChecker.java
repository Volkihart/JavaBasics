public class LastDigitChecker {

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasSameLastDigit(int one, int two, int three) {

        int modOne = one % 10;
        int modTwo = two % 10;
        int modThree = three % 10;

        if ((one < 10 || one > 1000) || (two < 10 || two > 1000) || (three < 10 || three > 1000)) {
            return false;
        } else if (modOne == modTwo){
            return true;
        } else if (modTwo == modThree){
            return true;
        } else if (modThree == modOne){
            return true;
        }else {
            return false;
        }
    }
    }

