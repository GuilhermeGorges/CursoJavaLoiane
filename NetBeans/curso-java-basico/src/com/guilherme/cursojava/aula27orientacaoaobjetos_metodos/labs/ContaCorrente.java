package com.guilherme.cursojava.aula27orientacaoaobjetos_metodos.labs;

import com.guilherme.cursojava.aula24orientacaoaobjetos_atributos.labs.*;


public class ContaCorrente {
    
    String nome;
    String numeroDaConta;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;
    
    
    double depositos (double valorDeposito){
        saldo += valorDeposito;
        System.out.println("Deposito realizado com sucesso");
        System.out.println("Saldo atual R$ "+saldo);
        return saldo;
    }
    
    void consultarSaldo(){
        System.out.println("Saldo atual R$ "+saldo);
    }
    
    
    double retirarDinheiro(double valorSaque){
        if (valorSaque > saldo){
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual R$ "+saldo);
            return saldo;
        } else {
            System.out.println("Saque efetuado com sucesso.");
            saldo -= valorSaque;
            System.out.println("Saldo atual R$ "+saldo);
            return saldo;
        }
    }
    
    void usandoChequeEspecial() {
        if (especial){
            System.out.println("Esta usando o cheque especial");
            System.out.println("O limite atual é de R$ "+limiteEspecial);
        } else {
            System.out.println("Não esta usando cheque especial");
            System.out.println("O limite atual é de R$ "+limiteEspecial);
        }
        
    }
    
   
}
