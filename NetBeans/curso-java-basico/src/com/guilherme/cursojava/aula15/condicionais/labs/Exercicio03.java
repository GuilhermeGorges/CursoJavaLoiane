/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.condicionais.labs;
import java.util.Scanner;


public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        
        while (true) {
        System.out.println("Digite o sexo: (M ou F) ");   
        String sexo = scan.next().toUpperCase();
       
        if ("M".equals(sexo)) {
            System.out.println("O sexo digitado foi Masculino. ");
            break;
        } else if ("F".equals(sexo)) {
            System.out.println("O sexo digitado foi o Feminino. ");
            break;
        } else {
            System.out.println("Sexo invalido");
        }
        }
    }
}
