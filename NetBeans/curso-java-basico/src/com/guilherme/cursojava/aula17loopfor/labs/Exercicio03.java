/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17loopfor.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String genero;
        String estadoCivil;
        
        
        do {
            
            System.out.println("Entre com o nome: ");
            
            nome = scan.next();
            
            if (nome.length() >= 3){
                infoValida = true;
            } else {
                System.out.println("Nome precisa de no minimo 3 caracteres.");
            }
        } while (!infoValida);  
        
        infoValida = false;
        do {
            
            System.out.println("Entre com a idade: ");
            
            idade = scan.nextInt();
            
            if (idade >= 0 && idade <= 150){
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150. ");
            }
        } while (!infoValida); 
        
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o salário: ");
            
            salario = scan.nextDouble();
            
            if (salario >= 0){
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser maior que 0.  ");
            }
        } while (!infoValida); 
        
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o genero: ");
            
            genero = scan.nextLine().toLowerCase();
            
            if (genero.equalsIgnoreCase("f")|| genero.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'. ");
            }
        } while (!infoValida); 
        
        infoValida = false;
        do {
            
            System.out.println("Entre com o estado cívil: ");
            
            estadoCivil = scan.nextLine().toLowerCase();
            
            if (estadoCivil.equalsIgnoreCase("s")|| 
                    estadoCivil.equalsIgnoreCase("c")||
                    estadoCivil.equalsIgnoreCase("v")||
                    estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 's' ou 'c' ou 'v' ou 'd'. ");
            }
        } while (!infoValida); 
        
        
        System.out.println("As seguintes informações foram coletadas");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salário: "+salario);
        System.out.println("Sexo: "+genero);
        System.out.println("Estado Civil: "+estadoCivil);
        
    }
}
