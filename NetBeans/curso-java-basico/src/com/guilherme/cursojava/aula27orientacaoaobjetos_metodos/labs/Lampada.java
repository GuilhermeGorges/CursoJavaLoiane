package com.guilherme.cursojava.aula27orientacaoaobjetos_metodos.labs;

import com.guilherme.cursojava.aula24orientacaoaobjetos_atributos.labs.*;

public class Lampada {
    
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    String garantiaMeses; 
    String[] tipos; 
    boolean lampadaLigada;
    
    
    boolean ligarLampada(){
        System.out.println("A lampada está ligada");
        return lampadaLigada = true;
        
    }
    
    boolean ligarDeslidaga(){
        System.out.println("A lampada está desligada");
        return lampadaLigada = false;
        
    }
}
