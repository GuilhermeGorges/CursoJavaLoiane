/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula43.labs.exer03;

/**
 *
 * @author Gui e Di
 */
public class Mamifero extends Animal {
    
    private String alimento;
    
    public Mamifero() {
        this.setCor("Castanho");
        this.setAmbiente("Terra");
        this.alimento = "Mel";        
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    
    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: "+ alimento;
        return s;
    }
}
