/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.labs;

import com.guilherme.cursojava.aula15.labs.*;
import com.guilherme.cursojava.aula13.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio23 {
    public static void main(String[] args) {
     
        System.out.println("Lojas Quase Dois - Tabela de Preços");
        for (int i=1; i<=50; i++){
            System.out.println(i + " - R$ " + (1.99*i));
        }
    }
}
