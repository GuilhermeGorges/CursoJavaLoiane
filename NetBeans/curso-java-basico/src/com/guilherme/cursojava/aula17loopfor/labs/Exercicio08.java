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
public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num;
        int count = 0;
        int soma = 0;
        float media = 0;
        
        for (int i = 0; i < 5; i++){
            System.out.println("Digite o "+ i + "º número: ");
            soma += scan.nextInt();
            count++;
        }
        media = soma / count;
        
        System.out.println("A soma dos valores resulta em: " + soma);
        System.out.println("A média dos valores é: " + media);
        
    }
}
