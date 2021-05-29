/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula13z.labs.exercicios;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite quanto você ganha por hora: ");
        double hourlyValue = scan.nextDouble();
        
        System.out.println("Digite quantas horas você trabalha no mês: ");
        double workedHour = scan.nextDouble();
        
        double salary = workedHour * hourlyValue;
        System.out.println("Seu salário no mês é = " + salary);
        
        
    }
}
