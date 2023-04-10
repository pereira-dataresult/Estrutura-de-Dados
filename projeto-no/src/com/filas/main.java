package com.filas;

public class main {

    public static void main(String[] args) {

        fila minhFila = new fila();

        minhFila.enqueue(new no("primeiro"));
        minhFila.enqueue(new no ("segundo"));
        minhFila.enqueue(new no ("terceiro"));
        minhFila.enqueue(new no ("quarto"));

        System.out.println(minhFila);
    }
    
}
