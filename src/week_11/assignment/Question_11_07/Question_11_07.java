package week_11.assignment.Question_11_07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 56 78 0
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter a list of integers ending with 0: ");
        int number;
        do {
            number = input.nextInt();
            if (number != 0) {
                numbers.add(number);
            }
        } while (number != 0);
        System.out.println("Before shuffling..");
        printArrayList(numbers );
        System.out.println();
        System.out.println("\nAfter shuffling..");
        shuffle(numbers);
        printArrayList(numbers);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    public static void printArrayList(ArrayList<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
