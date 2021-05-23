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
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        float num = scan.nextFloat();
        
        if (num < 0) {
            System.out.println("O valor digitado é negativo");
        } else {
            System.out.println("O valor é positivo");
        }
    }
}
