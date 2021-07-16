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
public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite quantas horas você trabalha por mes: ");
        float horaTra = scan.nextFloat();
        
        System.out.println("Digite o valor da sua hora: ");
        float valorHora = scan.nextFloat();
        double salario = valorHora * horaTra;
        
        if (salario < 900){
            double ir = salario * 0;
            double inss = salario * 0.10;
            double fgts = salario * 0.11;
            double totalDesc = ir + inss;
            double salarioLiquido = salario - totalDesc;
            
            System.out.println("O seu salário bruto é ("+horaTra+" * "+valorHora+") R$ "+salario);
            System.out.println("(-) IR (Isento)" + ir);
            System.out.println("(-) INSS (10%) R$ "+ inss);
            System.out.println("FGTS (11%) R$ "+ fgts);
            System.out.println("Total de descontos R$ "+ totalDesc);
            System.out.println("Salário liquido R$ "+ salarioLiquido);
        } else if (salario < 1500){
            double ir = salario * 0.05;
            double inss = salario * 0.10;
            double fgts = salario * 0.11;
            double totalDesc = ir + inss;
            double salarioLiquido = salario - totalDesc;
            
            System.out.println("O seu salário bruto é ("+horaTra+" * "+valorHora+") R$ "+salario);
            System.out.println("(-) IR (5%)" + ir);
            System.out.println("(-) INSS (10%) R$ "+ inss);
            System.out.println("FGTS (11%) R$ "+ fgts);
            System.out.println("Total de descontos R$ "+ totalDesc);
            System.out.println("Salário liquido R$ "+ salarioLiquido);
        } else if (salario < 2500){
            double ir = salario * 0.10;
            double inss = salario * 0.10;
            double fgts = salario * 0.11;
            double totalDesc = ir + inss;
            double salarioLiquido = salario - totalDesc;
            
            System.out.println("O seu salário bruto é ("+horaTra+" * "+valorHora+") R$ "+salario);
            System.out.println("(-) IR (10%)" + ir);
            System.out.println("(-) INSS (10%) R$ "+ inss);
            System.out.println("FGTS (11%) R$ "+ fgts);
            System.out.println("Total de descontos R$ "+ totalDesc);
            System.out.println("Salário liquido R$ "+ salarioLiquido);
        } else {
            double ir = salario * 0.20;
            double inss = salario * 0.10;
            double fgts = salario * 0.11;
            double totalDesc = ir + inss;
            double salarioLiquido = salario - totalDesc;
            
            System.out.println("O seu salário bruto é ("+horaTra+" * "+valorHora+") R$ "+salario);
            System.out.println("(-) IR (20%)" + ir);
            System.out.println("(-) INSS (10%) R$ "+ inss);
            System.out.println("FGTS (11%) R$ "+ fgts);
            System.out.println("Total de descontos R$ "+ totalDesc);
            System.out.println("Salário liquido R$ "+ salarioLiquido);
        }
        
    }
}
