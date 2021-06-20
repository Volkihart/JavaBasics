import org.w3c.dom.ls.LSOutput;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else return number % 2 != 0;

    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if (end <= 0 || start <= 0 || end < start) {
            return -1;
        } else if (start > 0 || end > 0){
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}



