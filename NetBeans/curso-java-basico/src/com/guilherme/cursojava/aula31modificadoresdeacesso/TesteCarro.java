package com.guilherme.cursojava.aula31modificadoresdeacesso;


public class TesteCarro {
    public static void main(String[] args) {
        
        Carro van = new Carro("Fiat", "Ducato");
        
        System.out.println(van.numPassageiros);
    }
}
