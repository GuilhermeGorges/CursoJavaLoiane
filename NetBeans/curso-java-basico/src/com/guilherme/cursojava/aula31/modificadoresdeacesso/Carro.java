
package com.guilherme.cursojava.aula31.modificadoresdeacesso;


/**
 *
 * 
 */
public class Carro {
    // atributos  

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
    
    public Carro() {}

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parametros.");
    }
    
    
    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com 2 parametros.");
        
    }
    
    
    
    
    // metodos 

    
    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    public double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return this.capCombustivel * this.consumoCombustivel;
    }
    
    private double divideKmPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }

    public double calcularCombustivel(double km) {

        return this.divideKmPorConsumoCombustivel(km);
    }

}
