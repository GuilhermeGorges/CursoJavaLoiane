/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula34.staticmetodo.labs;

/**
 *
 * 
 */


public class Exer02 {
    public static void main(String[] args) {
        imprimirTela(Calculadora.somar(1, 1));
        imprimirTela(Calculadora.subtrair(11, 231));
        imprimirTela(Calculadora.dividir(10, 1));
        imprimirTela(Calculadora.multiplicar(123, 123));
        imprimirTela(Calculadora.pot(11123, 231));
        imprimirTela(Calculadora.potMetodo(5, 5));
        imprimirTela(Calculadora.fatorial(5)); // exer 03
    }
    
    static void imprimirTela(double num){
        System.out.println(num);
    }
}
