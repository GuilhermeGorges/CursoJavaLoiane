/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula11.variaveis;

/**
 *
 *  
 */
public class CuriosidadesInteiros {
    public static void main(String[] args) {
        
         
        int var1 = 2147483647;
        int var2 = +100;
        
        System.out.println(var1 + var2); 
        // resultado -2147483549
        // os números do Java funcionam como uma roleta 
        //quando chega no limite volta para os numeros negativos 
    }
}
