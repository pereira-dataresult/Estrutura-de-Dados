package com.projetono;

public class main {

    public static void main(String[] args) {

        no no1 = new no("Conteudo no1");

        no no2 = new no("Conteudo no2");

        no1.setProximoNo(no2);

        no no3 = new no("Conteudo no3");

        no2.setProximoNo(no3);

        no no4 = new no("Conteudo no4");

        no3.setProximoNo(no4);

        // no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println("------------------------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
    
}
