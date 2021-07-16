/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula60.escopovariaveis;

/**
 *
 * 
 */
public class Teste {

    public static void main(String[] args) {

        EscopoVariaveis escopo = new  EscopoVariaveis();
        escopo.setValor(10);
        
        System.out.println(escopo.getValor());
        
        System.out.println(escopo.calculaValor(20));
        
        System.out.println(escopo.getValor());
        
        System.out.println(escopo.teste());
        
        System.out.println(escopo.getValor());
    }
}
