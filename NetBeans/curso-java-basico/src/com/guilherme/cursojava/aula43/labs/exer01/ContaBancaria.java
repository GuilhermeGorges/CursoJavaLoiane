
package com.guilherme.cursojava.aula43.labs.exer01;

public class ContaBancaria {
    
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "ContaBancaria[";
        s += " nomeCliente: " + nomeCliente;
        s += "; numConta: " + numConta;
        s += "; saldo: " + saldo;
        s += "]";
        return s; 
    }       
    
    public void depositar(double valorDeposito){
        saldo += valorDeposito;        
    }
    
    public boolean sacar(double valorSaque){
        if (saldo > valorSaque){
            saldo -= valorSaque;
            return true;
        }
        return false;
    }
    
}
