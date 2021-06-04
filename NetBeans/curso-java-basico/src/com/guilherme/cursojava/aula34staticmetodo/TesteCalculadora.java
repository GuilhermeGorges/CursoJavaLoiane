package com.guilherme.cursojava.aula34staticmetodo;


public class TesteCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();
        
        calc.soma(1, 2);
        System.out.println(calc.soma(1, 2));
    }
}
