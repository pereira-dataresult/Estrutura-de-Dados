package com.ListasEncadeadas;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhEncadeada = new ListaEncadeada<>();

        minhEncadeada.add("teste1");
        minhEncadeada.add("teste2");
        minhEncadeada.add("teste3");
        minhEncadeada.add("teste4");

        System.out.println(minhEncadeada.get(0));
        System.out.println(minhEncadeada.get(1));
        System.out.println(minhEncadeada.get(2));
        System.out.println(minhEncadeada.get(3));

        System.out.println(minhEncadeada);
    }
    
}
