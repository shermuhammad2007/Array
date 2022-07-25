package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int[] arr = {6, 25, 91, 23, 72, 9, 18, 6, 5, 7, 9};
        boolean found = false;

        for (int i = 0; i < 8; i++) {
            if (arr[i] == n) {
                found = true;
                break;
            }
        }

        System.out.println(found);

    }
}
