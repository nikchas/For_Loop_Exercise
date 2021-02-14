package ForLoopExercise;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddMin = Double.MAX_VALUE;
        double oddMax = Double.MIN_VALUE;

        double evenMin = Double.MAX_VALUE;
        double evenMax = Double.MIN_VALUE;

        double oddSum = 0;
        double evenSum = 0;

        for (int i = 1; i <= n; i++) {

            double number = Double.parseDouble(scanner.nextLine());

            if(n % 2 == 0){
                if(number < evenMin){
                    evenMin = number;
                }

                if(number > evenMax){
                    evenMax = number;
                }
                evenSum += number;
            }
            else{
                if(number < oddMin){
                    oddMin = number;
                }

                if(number > oddMax){
                    oddMax = number;
                }
                oddSum += number;
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (evenSum == 0){
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No");
        }
        else{
            System.out.printf("OddMin=%.2f%n,",oddMax);
            System.out.printf("OddMax=%.2f%n",oddMin);
        }
    }
}