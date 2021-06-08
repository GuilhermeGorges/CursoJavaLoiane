/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula43.labs.exer01;

/**
 *
 * @author Gui e Di
 */
public class ContaEspecial extends ContaBancaria{
    private double limiteEspecial;

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public String toString() {
        String s = "COntaEspecial[";
        s += " limite: " + limiteEspecial;
        s += "; " + super.toString();
        s += "]";
        return s; 
        
    }
    
    public boolean sacar(double valorSaque){
        double saldoComLimite = this.getSaldo() + limiteEspecial;
        
        if (saldoComLimite >= valorSaque){
            this.setSaldo(this.getSaldo()-valorSaque);
            return true;
        }
        return false;
    }
    
}
