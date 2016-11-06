import java.util.InputMismatchException;
import java.util.Scanner;


public class TelephoneNumber {
    public static void main(String[] args) {
        int summ;
        System.out.println("Please enter the phone number: ");

        while (true) {
            int number = typeCheck();
            if (number == 0) {
                continue;
            } else {
                summ = NumberOfIterations(number);
                break;
            }
        }

        System.out.println("Final result is: ");

        if (summ <= 4) {
            switch (summ) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("One Two");
                break;
            case 3:
                System.out.println("One Two Three");
                break;
            case 4:
                System.out.println("One Two Three Four");
                break;
            }
        } else {
            for (int i = 1; i <= summ; i++) {
                System.out.println(i);
            }
        }
    }

    public static int typeCheck() {
        try {
            Scanner getNumber = new Scanner(System.in);
            int number = getNumber.nextInt();

            if (number > 999999999 || number < 100000000) {
                System.out.println("Your phone number should have 9 numbers, try again");
                return 0;
            } else {
                return number;
            }
        } catch (InputMismatchException e) {
            System.out.println("Your number should be integer, try again");
            return 0;
        }
    }

    public static int getSumOfDigits(int number) {
        int summ = 0;
        while (number > 0) {
            summ = summ + (number % 10);
            number /= 10;
        }
        return summ;
    }

    public static int NumberOfIterations(int num) {
        int count = 1;
        while (num >= 10) {
            num = getSumOfDigits(num);
            System.out.println(count++ + "round" + " sum of digits = " + num);
        }
        return num;
    }
}