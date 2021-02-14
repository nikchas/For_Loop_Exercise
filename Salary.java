package ForLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        boolean isLost = false;

        // for loop по броя на табовете
        for (int i = 0; i < tabs; i++) {
            String website = scanner.nextLine();

            //Проверка за забранените сайтове
            switch (website) {
                case "Facebook":
                    salary = salary - 150;
                case "Instagram":
                    salary = salary - 100;
                case "Reddit":
                    salary = salary - 50;
            }

            //Ако заплатата стане на 0
            if(salary <= 0){
                isLost = true;
                break;
            }
        }

        if(isLost){
            System.out.printf("You have lost your salary.");
        }else{
            System.out.println(salary);
        }

    }
}
