/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.labs;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero de pessoas a serem cadastradas");
        int pessoas = scan.nextInt();
        int somaIdade = 0;
        double mediaIdade;
        
        for (int i = 0; i < pessoas; i++){
            System.out.println("Qual a idade da pessoa Nº "+ (i+1) );
            somaIdade += scan.nextInt();
        }
        mediaIdade = somaIdade/pessoas;
        
        if (mediaIdade < 26){
            System.out.println("A media de idade da turma é de "+ mediaIdade +" anos e a turma é jovem.");
        } else if (mediaIdade < 60){
            System.out.println("A media de idade da turma é de "+ mediaIdade +" anos e a turma é adulta.");
        } else {
            System.out.println("A media de idade da turma é de "+ mediaIdade +" anos e a turma é idosa.");
        }
    }
}
