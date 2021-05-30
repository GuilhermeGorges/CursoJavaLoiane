/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.labs;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o número de CDs da sua coleção: ");
        int numeroCd = scan.nextInt();
        double precoCds = 0;
        double mediaPrecoCd;
        
        for (int i = 0; i < numeroCd; i++){
            System.out.println("Digite o valor do CD Nº " + (i+1));
            precoCds += scan.nextDouble();
            
        }
       
        mediaPrecoCd = precoCds / numeroCd;
        
        System.out.println("A sua coleção tem:  " + numeroCd + " CDs. ");
        System.out.println("Custou R$ "+ precoCds);
        System.out.println("Cada CD custou em media R$ "+mediaPrecoCd);
        
    }
}
