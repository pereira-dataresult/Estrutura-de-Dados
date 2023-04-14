package com.dio.prova7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double morango = sc.nextDouble();
        double maca = sc.nextDouble();

        double precoMorango = morango <= 5 ? 2.5 : 2.2;
        double precoMaca = maca <= 5 ? 1.8 : 1.5;

        double precoTotal = (morango * precoMorango) + (maca * precoMaca);

        if ((morango + maca) > 8 || precoTotal > 25.0) {
            precoTotal *= 0.9;
        }

        System.out.println(precoTotal);

   
        sc.close();
    }
}
