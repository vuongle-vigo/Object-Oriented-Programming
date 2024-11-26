package OtherProject.src.hust.soict.globalict.Lab01.src.Lab6x;

import java.util.Arrays;

public class Lab65 {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};

        Arrays.sort(numbers);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}