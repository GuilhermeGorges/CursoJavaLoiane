package com.guilherme.cursojava.aula26.orientacaoaobjetosmetodoscomretorno;


public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro van = new Carro();
        van. marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        van.exibirAutonomia();
        
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é " + van.obterAutonomia());
        System.out.println("A autonomia do carro é " + autonomia);
        
        Carro fusca = new Carro();
        van. marca = "Volkswagen";
        van.modelo = "Fusca";
        van.numPassageiros = 4;
        van.capCombustivel = 30;
        van.consumoCombustivel = 0.15;
        
    }
    
}
