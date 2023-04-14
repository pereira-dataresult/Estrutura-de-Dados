package com.dio.objemsg;

class rodarAplicativo {

    public static void main (String[] args) {

        carro carro1 = new carro("Azul", "BMW X6", 59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        carro carro2 = new carro("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));
    }
    
}
