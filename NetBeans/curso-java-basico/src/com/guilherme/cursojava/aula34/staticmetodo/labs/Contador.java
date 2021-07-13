
package com.guilherme.cursojava.aula34.staticmetodo.labs;

public class Contador {
    
    private static int cont;
    
    
    public static void incrementar() {
        cont++;
    }
    
    public static void decrementar(){
        cont--;
    }
    
    public static void zerar(){
        cont = 0;
    }
    
    public static int retornarValor(){
        return cont;
    }
}
