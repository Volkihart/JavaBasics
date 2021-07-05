public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int newFirst = first;
        int newSecond = second;

        if (first >= 10 && second >= 10) {
            int r,a,b;
            a = (newFirst > newSecond) ? newFirst : newSecond;
            b = (newFirst < newSecond) ? newFirst : newSecond;
            r = b;
            while (a % b != 0){
                r = a % b;
                a = b;
                b = r;
            }
            return r;
        }
        else {
            return -1;
        }
    }
}
