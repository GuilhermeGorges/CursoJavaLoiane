package com.guilherme.cursojava.aula27.orientacaoaobjetosmetodoscomparametro;
public class Carro {
   
   // atributos  
   
   String marca;
   String modelo;
   int numPassageiros;
   double capCombustivel;
   double consumoCombustivel;
   
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
