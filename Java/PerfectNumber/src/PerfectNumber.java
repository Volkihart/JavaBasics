public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int i = 1;
        int sum = 0;

        if (number >= 1) {
            while (i <= number / 2) {
                if (number % i == 0) {
                    sum += i;
                }
                i++;
            }
            if (sum == number) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
