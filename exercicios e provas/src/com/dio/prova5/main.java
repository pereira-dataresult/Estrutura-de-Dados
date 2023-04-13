package com.dio.prova5;

import java.util.Scanner;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1 || n > 46) {
            // System.out.println("O valor de N deve ser um inteiro entre 1 e 45.");
            return;
        }
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        if (n > 1) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
