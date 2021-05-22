/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do arquivo que deseja baixar em MB: ");
        double tamanhoDoArquivo = scan.nextDouble();
        
        System.out.println("Digite a velocidade de download do arquivo em Mbp/s: ");
        double velocidadeDownload = scan.nextDouble();
              
        double velSegundos = tamanhoDoArquivo / (velocidadeDownload/8);
        
        double velMinutos = velSegundos / 60;
        
        System.out.println("O download levará " + velMinutos + " Minutos.");
        
    }
    
}
