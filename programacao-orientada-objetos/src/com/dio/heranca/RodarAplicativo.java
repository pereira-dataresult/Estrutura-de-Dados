package com.dio.heranca;

public class RodarAplicativo {
    
    public static void main (String[] args) {

        funcionario funcionario = new funcionario();
        funcionario gerente = new gerente();
        funcionario vendedor = new vendedor();
        funcionario faxineiro = new faxineiro();

        
        vendedor vendedor_ = (vendedor) new funcionario();
    }
}
