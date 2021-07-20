import java.util.Scanner;

public class InputCalculator {
        public static void inputThenPrintSumAndAverage(){
            int sum = 0;
            int count = 0;
            long avg;


            Scanner input = new Scanner(System.in);

            while(true){
                boolean isInt = input.hasNextInt();

                if(isInt){
                    int value = input.nextInt();
                    sum += value;
                    count++;
                } else if (count == 0 ){
                    System.out.println("SUM = 0 AVG = 0");
                    break;
                }else {
                    avg = Math.round((double) sum / count);
                    System.out.println("SUM = "+sum+" AVG = "+avg);
                    break;
                }
                input.nextLine();
            }


            input.close();

        }
}
