package abbreviation;

import java.util.*;

/**
 * Created by danil on 15.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        final int MAX_LENGTH = 10;
        List<char[]> wordsList = new ArrayList<char[]>();
        Scanner input = new Scanner(System.in);
        String word;
        char[] letterArray;
        int numberOfWords;
        System.out.println("Input number");
        numberOfWords = typeCheck();

        for (int i = 0; i < numberOfWords; i++){
            System.out.println("Input word");
            word = input.nextLine();
            letterArray = word.toCharArray();
            wordsList.add(letterArray);
        }


        for (int i = 0; i  <numberOfWords; i++ ) {

            if (wordsList.get(i).length > MAX_LENGTH) {
                System.out.print(wordsList.get(i)[0]);
                System.out.print(wordsList.get(i).length-2);
                System.out.println(wordsList.get(i)[wordsList.get(i).length-1]);
            } else {
                System.out.println(wordsList.get(i));
            }
        }
    }

    public static int typeCheck() {
        try {
            Scanner getNumber = new Scanner(System.in);
            int number = getNumber.nextInt();

            if (number < 0) {
                System.out.println("The number can not be negative");
                return 0;
            } else {
                return number;
            }
        } catch (InputMismatchException e) {
            System.out.println("Your number should be integer, try again");
            return 0;
        }
    }

}
