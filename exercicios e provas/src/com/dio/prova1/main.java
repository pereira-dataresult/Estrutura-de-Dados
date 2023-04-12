package com.dio.prova1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class main {

    public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);

        System.out.println("Custo de Fabrica");
        double custoFabrica = scan.nextInt();
        System.out.println("Valor % do distribuidor");
	    double porcentagemDistribuidor = scan.nextInt();
        System.out.println("Valor % de Impostos");
	    double PercentualImpostos = scan.nextInt();

            double custoConsumidor;     
            double Distribuidor;
            double ValorImpostos;
 
        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
 
        Distribuidor = custoFabrica * (porcentagemDistribuidor / 100);
        ValorImpostos = custoFabrica * (PercentualImpostos / 100);

        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;
        
        int custoConsumidorFinal = (int) Math.round(custoConsumidor);
        
 
        System.out.println("Preço final do Carro: " + custoConsumidorFinal);
        

        scan.close();
	}
    
}
