package com.guilherme.cursojava.aula19;
public class Arrays {
    public static void main(String[] args) {
        
        double tempDay001 = 31.3;
        double tempDay002 = 32;
        double tempDay003 = 32.3;
        double tempDay004 = 33;
        double tempDay005 = 34.3;
        double tempDay006 = 33.5;
        
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 32.3;
        temperaturas[3] = 33;
        temperaturas[4] = 34.3;
        
        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
        
        System.out.println("O tamanho do array: " + temperaturas.length);
        
        System.out.println("Valores do array" );
        
        for (int i=0; i<temperaturas.length; i++){
            if (temperaturas[i] == 0) {
                break;
            }
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }
        
        
        // for c in ... 
        for (double temp: temperaturas){
            if (temp == 0) {
                break;
            }
            System.out.println(temp);
        }
        
        
    }
}
