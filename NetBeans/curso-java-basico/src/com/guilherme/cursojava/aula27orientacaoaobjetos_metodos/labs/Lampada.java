package com.guilherme.cursojava.aula27orientacaoaobjetos_metodos.labs;

public class Lampada {
    
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    String garantiaMeses; 
    String[] tipos; 
    boolean lampadaLigada;
    
    
    void ligarLampada(){
        lampadaLigada = true;
        System.out.println("A lampada está ligada");
               
    }
    
    void desligarLampada(){
        lampadaLigada = false;
        System.out.println("A lampada está desligada");
        
    }
    
    void mostrarEstado(){
        if(lampadaLigada){
            System.out.println("Lâmpada está ligada!");
        } else {
            System.out.println("Lâmpada está desligada!");
        }
    }
    
    void mudarEstado(){
        if (lampadaLigada){
            desligarLampada();
        } else {
            ligarLampada();            
        }
    }
    
    
}
