package com.dio.prova3;

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         double h = 0;
//         for (int i = 1; i <= n; i++) {
//             h += 1.0/i;
//         }
//         int hInt = (int) Math.round(h); // arredonda h para o inteiro mais próximo
//         System.out.println(hInt);
//         sc.close();
//     }
// }


import java.util.Scanner;

public class main {

    public static void main(String[] Args) {

     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double h = 0;

     //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
        for (int i = 1; i <= n; i++) {
            h += 1.0/i;
        }           

     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        int hInt = (int) Math.round(h);
        System.out.println(hInt);
        sc.close();
    }
}