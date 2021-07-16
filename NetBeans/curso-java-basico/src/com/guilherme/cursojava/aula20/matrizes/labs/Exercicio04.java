/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula20.matrizes.labs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[][] compromissos = new String[31][24];
        
        int dia = 0;
        boolean diaValido;
        int hora = 0;
        boolean horaValida;
        boolean sair = false;
        byte opcao;
        
        while(!sair){
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");
            
            opcao = scan.nextByte();
            
            if (opcao == 1){// adicionar compromisso 
                diaValido = false;
                while(!diaValido){
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }
                horaValida = false;
                while(!horaValida){
                    System.out.println("Entre com o a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente.");
                    }
                }
                                
                System.out.println("Digite o compromisso");
                compromissos[--dia][--hora] = scan.next();
                
            } else if (opcao == 2){// verificar compromisso 
                diaValido = false;
                while(!diaValido){
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }
                horaValida = false;
                while(!horaValida){
                    System.out.println("Entre com o a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente.");
                    }
                }
                
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[--dia][--hora]);
            } else if (opcao == 0){// sair
                sair = true;
            } else {
                System.out.println("Opção inválida. digite novamente");
            }
        }
            
        
    }
}
