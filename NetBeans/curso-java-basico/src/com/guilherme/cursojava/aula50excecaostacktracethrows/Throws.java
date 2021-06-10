/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula50excecaostacktracethrows;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Throws {
    public static void main(String[] args) {
        System.out.println("Digite um numero decimal");
        try{
            double num = lerNumero();
            System.out.println("Voce digitou "+num);
        } catch (Exception e){
            System.out.println("Entrada inválida aconteceu um erro");
            e.printStackTrace();
        }
        
    }
    
    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;        
        
    }
}
