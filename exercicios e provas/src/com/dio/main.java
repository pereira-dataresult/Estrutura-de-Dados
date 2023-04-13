package com.dio;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(); // lê o número de casos de teste
        for (int i = 1; i <= c; i++) {
            int n = sc.nextInt(); // lê o nível de energia do ser vivo
            if (n <= 8000) {
                System.out.println("Inseto"); // nível menor ou igual a 8000
            } else {
                System.out.println("Mais de 8000"); // nível maior que 8000
            }
        }
        sc.close();
    }
    
}
