/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula43.objects;

/**
 *
 * @author Gui e Di
 */
public class Teste {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        aluno.setCurso("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);
        
        
        System.out.println(aluno);
        
        String s1 = "agaethsg"; 
        String s2 = "agaethsG";
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        
        
        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciência da Computação");
        double[] notas2 = {10, 9, 8, 7};
        aluno.setNotas(notas2);
        
        System.out.println(aluno.equals(aluno2));
    }
}
