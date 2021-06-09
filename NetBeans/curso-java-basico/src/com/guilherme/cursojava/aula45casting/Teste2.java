/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula45casting;

/**
 *
 * @author Gui e Di
 */
public class Teste2 {
    public static void main(String[] args) {
        Object obj1 = obterString();
        String s1 = (String) obj1;//down casting 
        
        Object obj2 = "Minha String";
        String s2 = (String) obj2; //down casting
        
        Object obj3 = new Object();
        //String s3 = (String) obj3; //down casting erro por nao haver string a ser convertida
        
        Object obj4 = obterInteiro();
        //String s4 = (String) obj4;  // não é possivel fazer o down casting desta forma por se tratar de um inteiro e não de uma string 
    }
    
    public static String obterString(){
        return "minha String";
    }
    public static int obterInteiro(){
        return 1;        
    }
    
}
