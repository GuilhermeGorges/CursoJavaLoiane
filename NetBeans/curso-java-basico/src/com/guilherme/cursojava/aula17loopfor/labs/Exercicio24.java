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
public class Exercicio24 {
    public static void main(String[] args) {
     
        System.out.println("O preço do pão: R$ 0.18");
        System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
        for (int i=1; i<=50; i++){
            System.out.println(i + " - R$ " + (0.18*i));
        }
    }
    
}
