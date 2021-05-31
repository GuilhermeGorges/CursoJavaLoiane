package com.guilherme.cursojava.aula25orientacaoaobjetos_metodos_semretorno;


public class Carro {
   
   String marca;
   String modelo;
   int numPassageiros;
   double capCombustivel;
   double consumoCombustivel;
   
   void exibirAutonomia(){
       System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + " km");
   }   
}
