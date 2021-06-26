public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        //COPY NUMBER INTO VARIABLE SO EACH CALC DOESN'T THROW OFF THE NEXT CALC
        int palindrome = number;
       int reverse = 0;

        while(palindrome != 0){
           int lastDigit = palindrome % 10;
           reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }
        if(reverse == number){
            return true;
        }
            return false;
    }
}
