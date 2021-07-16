
package com.guilherme.cursojava.aula32.encapsulamento;


/**
 *
 * 
 */
public class Carro {
    // atributos  

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
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
