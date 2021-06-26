public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int calc = number;
        int firstDigit;
        int lastDigit;
        int answer;

        if (calc < 0) {
            return -1;
            } else {

            firstDigit = calc;

            while (firstDigit >= 10) {
                firstDigit = firstDigit / 10;

            }
            lastDigit = calc % 10;
            answer = firstDigit + lastDigit;
        } return answer;
    }
}


