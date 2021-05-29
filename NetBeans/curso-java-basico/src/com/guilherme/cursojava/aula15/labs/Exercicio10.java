/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio10 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Em qual turno você estuda? ");
            System.out.println("M - Matutino, V - Vespertino, N - Noturno.");
            
            String turno = scan.nextLine().toUpperCase();
            
            if (turno.equalsIgnoreCase("M")){
                System.out.println("Bom dia!");
            } else if (turno.equalsIgnoreCase("V")){
                System.out.println("Boa tarde! ");
            } else if (turno.equalsIgnoreCase("N")){
                System.out.println("Boa noite!");
            } else {
                System.out.println("Valor inválido! ");
            }
            
    }
}
