/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula43.objects.labs.exer02;

/**
 *
 * @author Gui e Di
 */
public class PessoaFisica extends Contribuinte {
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        
        double renda = this.getRendaBruta(); 
        
        if (renda <= 1400){
            return 0;
        }
        if (renda > 1400 && renda <= 2100){
            return (renda * 0.1) - 100;
        }
        if (renda > 2100 && renda <= 2800){
            return (renda * 0.15) - 270;
        }
        
        if (renda > 2800 && renda <= 3600){
            return (renda * 0.25) - 500;
        }
        // > 3600
        return (renda * 0.3) - 700;

    }

    
    @Override
    public String toString() {
        String s = "Pessoa Fisica["; 
        s += super.toString();
        s += " ;cpf" + cpf;
        s += " :imposto s ser pago " + calcularImposto();
        s += "]";
        return s;
    }
    
    
}
