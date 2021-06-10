/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula52excecaocriando;

/**
 *
 * @author Gui e Di
 */
public class UsandoMinhaExeption {
    public static void main(String[] args) {
        try {
            teste();
        } catch (DivisaoNaoExata e) {
            e.printStackTrace();
        }
        
    }
    public static void teste() throws DivisaoNaoExata{
        
        int[] numeros = {4, 8, 5, 16, 21, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0, 2, 3};
        
        for (int i=0; i<numeros.length; i++){
            try{
                if (numeros[i]%2 != 0){
                    //lançar exeption aqui 
                    throw new DivisaoNaoExata(numeros[i], demon[i]);
                }
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));        
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException ei){ // multicach
                System.out.println("Aconteceu um erro");
                ei.printStackTrace();
            }
        }
        
    }
    
}
