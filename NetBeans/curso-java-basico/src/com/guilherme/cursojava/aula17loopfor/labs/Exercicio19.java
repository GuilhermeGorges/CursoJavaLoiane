/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17loopfor.labs;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite quantas notas pretende calcular ");
        int n = scan.nextInt();
        float soma = 0;
        double media;
        
        for (int i = 0; i < n; i++){
            System.out.println("Digite a " + (i+1) + "ª nota:");
            soma += scan.nextFloat();
        }
        
        media = soma / n;
        System.out.println("A média do aluno é " + media);
    }
}
