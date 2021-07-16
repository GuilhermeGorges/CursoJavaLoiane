/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.condicionais.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionário: ");
        double salario = scan.nextDouble();
        
        if (salario <= 280) {
            double aumento = salario * 0.20;
            double novoSalario = aumento + salario;            
            System.out.println("O seu salário atual é de R$ " + salario);
            System.out.println("O seu aumento salárial será de 20% " );
            System.out.println("O valor do seu aumento será R$ " + aumento);
            System.out.println("O seu novo salário sera R$ "+ novoSalario);
        } else if (salario > 280 && salario < 700) {
            double aumento = salario * 0.15;
            double novoSalario = aumento + salario;            
            System.out.println("O seu salário atual é de R$ " + salario);
            System.out.println("O seu aumento salárial será de 15% " );
            System.out.println("O valor do seu aumento será R$ " + aumento);
            System.out.println("O seu novo salário sera R$ "+ novoSalario);
        } else if (salario >= 700 && salario < 1500) {
            double aumento = salario * 0.10;
            double novoSalario = aumento + salario;            
            System.out.println("O seu salário atual é de R$ " + salario);
            System.out.println("O seu aumento salárial será de 10% " );
            System.out.println("O valor do seu aumento será R$ " + aumento);
            System.out.println("O seu novo salário sera R$ "+ novoSalario);
        } else if (salario >= 1500) {
            double aumento = salario * 0.05;
            double novoSalario = aumento + salario;
            System.out.println("O seu salário atual é de R$ " + salario);
            System.out.println("O seu aumento salárial será de 5% " );
            System.out.println("O valor do seu aumento será R$ " + aumento);
            System.out.println("O seu novo salário sera R$ "+ novoSalario);
        }
    }
}
