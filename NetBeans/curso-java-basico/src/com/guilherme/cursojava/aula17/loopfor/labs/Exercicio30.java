/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.loopfor.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int result; 
        boolean validate = true;
        int tabu, tabuInit, tabuEnd;
        
        System.out.print("Montar tabuada de: ");
        tabu = scan.nextInt();
        
        do {
            System.out.print("Começar por: ");
            tabuInit = scan.nextInt();

            System.out.print("Terminar em: ");
            tabuEnd = scan.nextInt();
            if (tabuEnd > tabuInit){
                validate = false;
            }

        }while(validate);
            
        

        System.out.println("Vou montar a tabuada de " + tabu + " começando em " + tabuInit + " e terminado em " + tabuEnd + ":");
        for (int i = tabuInit; i <= tabuEnd; i++){
            result = i * tabu;
            System.out.println(tabu + " X " + i + " = " + result);
        }

    
    }
}
