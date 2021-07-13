/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.loopfor;

/**
 *
 * @author Gui e Di
 */
public class LoopFor {
    public static void main(String[] args) {
        
        // for incrementando
        for (int i=0; i < 5; i++){
            System.out.println("i tem o valor" + i);
        }
        
        // for decrementando 
        for (int i=5; i >= 0; i--){
            System.out.println("i tem o valor" + i);
        }
        
        // for com duas var
        for (int i=0, j=10; i<j ; i++, j--){
            System.out.println("i = " + i + ": j = " +j);
        }
        // for com partes ausentes 
        int count = 0;
        for (; count < 10 ;){
            System.out.println("valor de count: " + count);
        }
        // for com partes ausentes 
        for (int cont=0; cont < 10 ; cont += 2){
            System.out.println("valor de cont: " + cont);
        }
        // loop infinito 
        //for (;; );
    }
}
