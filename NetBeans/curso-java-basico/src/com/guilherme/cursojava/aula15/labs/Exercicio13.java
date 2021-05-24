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
public class Exercicio13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
        System.out.println("Digite o numero do dia da semana: ");
        int diaSem = scan.nextInt();
        switch (diaSem){
            case 1: System.out.println("O dia da semana é Domingo");break;
            case 2: System.out.println("O dia da semana é Segudna-Feira");break;
            case 3: System.out.println("O dia da semana é Terça-Feira");break;
            case 4: System.out.println("O dia da semana é Quarta-Feira");break;
            case 5: System.out.println("O dia da semana é Quinta-Feira");break;
            case 6: System.out.println("O dia da semana é Sexta-Feira");break;
            case 7: System.out.println("O dia da semana é Sábado");break;
            default :System.out.println("Dia da semana inexistente");
        }
        }
    }
}
