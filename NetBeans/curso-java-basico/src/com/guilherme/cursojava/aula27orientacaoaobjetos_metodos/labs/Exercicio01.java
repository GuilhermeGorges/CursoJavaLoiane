package com.guilherme.cursojava.aula27orientacaoaobjetos_metodos.labs;


public class Exercicio01 {
    public static void main(String[] args) {
        Lampada philips = new Lampada();
        
        philips.cor = "Amarelo";
        philips.tensao = "220";
        
        philips.ligarLampada();
        
        philips.mostrarEstado();
        
        philips.desligarLampada();
        
        philips.mostrarEstado();
        
        
        System.out.println("A lampada philips tem cor:  "+ philips.cor+ " e tem a tensão: "+ philips.tensao);
        System.out.println("E esta ligada "+ philips.lampadaLigada);      
    }   
    
}
