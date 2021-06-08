package com.guilherme.cursojava.aula43.labs.exer01;

public class Teste01 {
    public static void main(String[] args) {
       
        System.out.println("*** Teste ContaBancaria ***");
        
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Joaquim Bancaria");
        contaSimples.setNumConta("123456");
        contaSimples.setSaldo(0);
        
        contaSimples.depositar(1000);
        System.out.println(contaSimples);
        
        realizarSaque(contaSimples, 900);
        realizarSaque(contaSimples, 900);
        
        System.out.println("*** Teste ContaPoupança ***");
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Joaquim Poupanca");
        contaPoupanca.setNumConta("123456");
        contaPoupanca.setDiaRendimento(9);
        
        contaPoupanca.depositar(1000);
        System.out.println(contaPoupanca);
        
        realizarSaque(contaPoupanca, 900);
        
        if (contaPoupanca.calcularNovoSaldo(0.005)){
            System.out.println("Rendimento aplicado, novo saldo é de = "+ contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
        
        System.out.println("*** Teste ContaEspecial ***");
        
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Joaquim Especial");
        contaEspecial.setNumConta("123456");
        contaEspecial.setLimiteEspecial(1000);
        
        contaEspecial.depositar(1000);
        System.out.println(contaSimples);
        
        realizarSaque(contaEspecial, 900);
        realizarSaque(contaEspecial, 900);
        realizarSaque(contaEspecial, 900);
        
        
    
    }
    
    private static void realizarSaque(ContaBancaria conta, double valorSaque){
        if (conta.sacar(valorSaque)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de "+ valorSaque + "; saldo de = " + conta.getSaldo());
        }
    }
}
