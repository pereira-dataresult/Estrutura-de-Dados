package com.ListasCirculares;

public class Main {

    public static void main(String[] args) {
        listaCircula<String> minhaListaCircula = new listaCircula<>();

        minhaListaCircula.add("c0");
        System.out.println(minhaListaCircula);

        minhaListaCircula.remove(0);
        System.out.println(minhaListaCircula);
    }
    
}
