/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula56.enumeradores.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Calculadora {

    enum Operacao {
        SOMAR("+") {
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo) {
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);

        public String toString() {
            return this.simbolo;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        double x, y;
        String resposta;

        while (continuar) {
            System.out.println("Digite o valor de x: ");
            x = scan.nextDouble();
            System.out.println("Digite o valor de y: ");
            y = scan.nextDouble();
                        
            System.out.println();
            for (Operacao op : Operacao.values()) {
                System.out.print(x + " ");
                System.out.print(op.toString() + " ");
                System.out.print(y + " = ");
                System.out.println(op.executarOperacao(x, y));
            }
            
            System.out.println("Quer continuar? S/N");
            resposta = scan.next();
            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            } else {
                continuar = true;
            }
        }

    }
}
