package com.guilherme.cursojava.aula26orientacaoaobjetos_metodos_comretorno;

import com.guilherme.cursojava.aula25orientacaoaobjetos_metodos_semretorno.*;


public class Carro {
   
   String marca;
   String modelo;
   int numPassageiros;
   double capCombustivel;
   double consumoCombustivel;
   
   void exibirAutonomia(){
       System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + " km");
   }   
   
    double obterAutonomia(){
        
        System.out.println("Método obterAutonomia foi chamado.");
        
        return capCombustivel * consumoCombustivel;
    }
}
