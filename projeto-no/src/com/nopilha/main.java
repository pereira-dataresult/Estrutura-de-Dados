package com.nopilha;

public class main {
    
    public static void main(String[] args) {
        pilha minhaPilha = new pilha();

        minhaPilha.push(new no(1));
        minhaPilha.push(new no(2));
        minhaPilha.push(new no(3));
        minhaPilha.push(new no(4));
        minhaPilha.push(new no(5));
        minhaPilha.push(new no(6));

        System.out.println(minhaPilha);

    }

}
