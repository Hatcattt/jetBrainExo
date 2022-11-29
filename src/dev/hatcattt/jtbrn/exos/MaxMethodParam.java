package dev.hatcattt.jtbrn.exos;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMethodParam {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        var array = List.of(a, b ,c);
        return array.indexOf(Collections.max(array)) + 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}

