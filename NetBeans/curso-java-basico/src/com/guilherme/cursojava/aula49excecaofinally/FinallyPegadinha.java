/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula49excecaofinally;

/**
 *
 * @author Gui e Di
 */
public class FinallyPegadinha {
    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};
        
        for (int i=0; i<numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i])); 
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException ei){ // multicach
                System.out.println("Erro ao dividir por zero");
                System.exit(0);
            }
            catch(Throwable ei){ // qualquer erro
                System.out.println("Posição do array invalida");
                System.exit(0);
            }
            finally { //
                System.out.println("Essa linha é impressa sempre apos o try ou o catch");
                System.out.println();
            }
        }
    }
}
