package dev.hatcattt.jtbrn.exos;

import java.util.Scanner;

public class ComparingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().replaceAll("\\s+", "");
        String word2 = scanner.nextLine().replaceAll("\\s+", "");

        System.out.println(word.equals(word2));
    }
}
