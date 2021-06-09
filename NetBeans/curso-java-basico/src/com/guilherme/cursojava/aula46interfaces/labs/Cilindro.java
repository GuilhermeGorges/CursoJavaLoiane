/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula46interfaces.labs;

/**
 *
 * @author Gui e Di
 */
public class Cilindro extends Figura3D {
    private int altura;
    private double raio;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        
        double areaBase = Math.PI * (raio * raio);        
        double areaLateral = 2 * Math.PI * raio * altura;        
        double areaTotal = (2 * areaBase) + areaLateral;        
        
        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        return (Math.PI * (raio * raio ) * altura);
    }
    
}
