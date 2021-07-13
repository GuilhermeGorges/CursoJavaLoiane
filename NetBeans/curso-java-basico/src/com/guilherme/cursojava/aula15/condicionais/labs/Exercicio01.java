
package com.guilherme.cursojava.aula15.condicionais.labs;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        if (num1 > num2) {
            System.out.println("O numero maior é o numero "+ num1);
        } else if (num1 < num2) {
            System.out.println("O numero maior é o numero"+ num2);
        } else {
            System.out.println("Os valores são iguais");
        }
        
        
        
    }
}
