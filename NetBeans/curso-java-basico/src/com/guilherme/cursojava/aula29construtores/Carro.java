/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula29construtores;

/**
 *
 * @author Gui e Di
 */
public class Carro {  
   // atributos  
   
   String marca;
   String modelo;
   int numPassageiros;
   double capCombustivel;
   double consumoCombustivel;
   
   Carro(){
       System.out.println("");
   }
   
   Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
       marca = marca_;
       modelo = modelo_;
       numPassageiros = numPassageiros_;
       capCombustivel = capCombustivel_;
       consumoCombustivel = consumoCombustivel_;
   }
   
   // metodos 
   
   void exibirAutonomia(){
       System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + " km");
   }  
      
    double obterAutonomia(){
        
        System.out.println("Método obterAutonomia foi chamado.");
        
        return capCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel(double km){
        
        double qtdCombustivel = km / consumoCombustivel;
        
        return qtdCombustivel;
    }

}
