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
public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        String s = "Pessoa Juridica[";  
        s += super.toString();
        s += " ;cnpj" + cnpj;
        s += " :imposto s ser pago " + calcularImposto();
        s += "]";
        return s;
    }
}
