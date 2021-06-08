/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula43.labs.exer02;

/**
 *
 * @author Gui e Di
 */
public abstract class Contribuinte {
    
    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    
    public abstract double calcularImposto();

    @Override
    public String toString() {
        String s = "Nome: " + nome;
        s += ";RendaBrura: " + rendaBruta;
        return s;
    }
    
    
    
}
