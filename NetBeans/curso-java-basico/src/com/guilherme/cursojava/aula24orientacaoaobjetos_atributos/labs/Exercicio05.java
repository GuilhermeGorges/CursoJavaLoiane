package com.guilherme.cursojava.aula24orientacaoaobjetos_atributos.labs;


public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Exercicio05ContaCorrente conta = new Exercicio05ContaCorrente();
        conta.numeroDaConta = "11234556";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        
        System.out.println("Saldo "+ conta.saldo);
    }
    
}
