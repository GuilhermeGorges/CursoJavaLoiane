
package com.guilherme.cursojava.aula35recursividade.labs;

public class SomatorioN {
    public static int valorN (int num){
        if (num == 1){
            return 1;
        }
        return num + valorN(num-1);
    }
}
