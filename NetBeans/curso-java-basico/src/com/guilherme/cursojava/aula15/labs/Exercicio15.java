/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.labs;

import com.guilherme.cursojava.aula13.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio15 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o comprimento da primeira reta:");
        float reta1 = scan.nextFloat();
        
        System.out.println("Digite o comprimento da seguna reta:");
        float reta2 = scan.nextFloat();
        
        System.out.println("Digite o comprimento da terceira reta:");
        float reta3 = scan.nextFloat();
        
        if (reta1 + reta2 > reta3 && reta2 + reta3 > reta1 && reta3 + reta1 > reta2) {
            System.out.println("É possível montar um triangulo com as retas acima.");
            if (reta1 == reta2 && reta2 == reta3){
                System.out.println("E este triangulo é um triangulo EQUILÁTERO.");
            } else if (reta1 != reta2 && reta2 != reta3 && reta1 != reta3){
                System.out.println("E este triangulo é um triangulo ESCALENO.");
            } else {
                System.out.println("E este triangulo é um triangulo ISÓCELES.");
            }
        } else{ 
            System.out.println("Não é possível montar um triangulo com as retas acima.");
        }
    }
}
