
package com.guilherme.cursojava.aula47.excecao;

public class Excecao {
    public static void main(String[] args) {
        int[] vetor = new int[4];        
      
        try {
            System.out.println("Será impresso");
        
            vetor[4] = 1;
            System.out.println("Não será");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Acessar indice do vetor inexistente");
        }
        
        System.out.println("Impresso apos a exeption ");
        
        
        
    }
}
 