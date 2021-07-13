/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula54.enumeradores;

/**
 *
 * @author Gui e Di
 */
public class Formulario {
    
    enum Genero {
        FEMININO('F') , MASCULINO('M');
        
        private char valor;
        
        Genero(char valor){
            this.valor = valor;
        }
    }
    
    private String nome;
    private Genero genero;
}
