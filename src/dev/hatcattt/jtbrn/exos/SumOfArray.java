package dev.hatcattt.jtbrn.exos;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

    public static int getSumOfArray(int[] ints) {
        int sum = 0;
        for (var val : ints) {
            sum += val;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] ints = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            ints[i] =  scanner.nextInt();
        }
        int sumOfArray = getSumOfArray(ints);
        System.out.println(sumOfArray);
    }
}
