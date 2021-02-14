package ForLoopExercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double numsLessThan200 = 0;
        double numsLessThan400 = 0;
        double numsLessThan600 = 0;
        double numsLessThan800 = 0;
        double numsGreaterEqual800 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 200){
                numsLessThan200++;
            }
            if (num < 400 && num >= 200){
                numsLessThan400++;
            }
            if (num < 600 && num >= 400){
                numsLessThan600++;
            }
            if (num < 800 && num >= 600){
                numsLessThan800++;
            }
            if (num >= 800){
                numsGreaterEqual800++;
            }
        }

        double p1 = numsLessThan200 / n * 100;
        double p2 = numsLessThan400 / n * 100;
        double p3 = numsLessThan600 / n * 100;
        double p4 = numsLessThan800 / n * 100;
        double p5 = numsGreaterEqual800 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}