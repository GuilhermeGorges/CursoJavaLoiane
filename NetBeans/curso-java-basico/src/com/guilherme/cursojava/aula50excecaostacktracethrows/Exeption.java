/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula50excecaostacktracethrows;

/**
 *
 * @author Gui e Di
 */
public class Exeption {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};
        
        for (int i=0; i<numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));        
            }
            catch(Exception e){ // Exeption 
                System.out.println(e.getMessage());  // getMessege() pega o nome da exceção
                e.printStackTrace(); // mosta a linha do erro
            }
        }
    }
    
}
