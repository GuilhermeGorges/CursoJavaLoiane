/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula15.labs.*;
import com.guilherme.cursojava.aula13.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio16 {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        
        int menores15Sum = 0;
        int iguais15Count = 0;
        int superiores15Sum = 0;
        int superiores15Count = 0;
        
        int[] a = new int[10];
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite o valor Nº "+ (i+1)+" ");
            a[i] = scan.nextInt();
            if (a[i]>15){
                superiores15Count++;
                superiores15Sum += a[i];
            } else if (a[i] == 15){
                iguais15Count++;
            } else{
                menores15Sum += a[i];
            }
        }
        
        System.out.println("A soma dos valores menores que 15 é "+ menores15Sum);
        System.out.println("Foram armazenados " + iguais15Count + " elementos iguais a 15.");
        System.out.println("A media dos elementos armazenados com valor superior a 15 é "+(superiores15Sum / superiores15Count));
    }
}
