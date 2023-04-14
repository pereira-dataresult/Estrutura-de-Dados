package com.dio.prova9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        int espacos = 0, vogais = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') {
                espacos++;
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vogais++;
            }
        }

        System.out.print("Espacos em branco: " + espacos + " ");
        System.out.print("Vogais: " + vogais);

        sc.close();
    }
}
