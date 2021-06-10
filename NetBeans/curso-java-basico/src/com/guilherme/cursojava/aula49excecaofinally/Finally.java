
package com.guilherme.cursojava.aula49excecaofinally;

public class Finally {
    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};
        
        for (int i=0; i<numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException ei){ // multicach
                System.out.println("Erro ao dividir por zero");
            }
            catch(Throwable ei){ // qualquer erro
                System.out.println("Erro qualquer");
            }
            finally {
                System.out.println("Essa linha é impressa sempre apos o try ou o catch");
            }
            
        }
        
        
        
        
    }
}
