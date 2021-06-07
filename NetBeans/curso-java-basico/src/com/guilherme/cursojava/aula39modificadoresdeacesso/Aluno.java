/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula39modificadoresdeacesso;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;
    
    public void verificarAcesso(){
        
    }

    public Aluno() {
        super();
    }

    public Aluno(String curso, double[] notas, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }
    
    
}
