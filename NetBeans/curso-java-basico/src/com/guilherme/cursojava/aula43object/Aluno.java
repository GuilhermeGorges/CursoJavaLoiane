
package com.guilherme.cursojava.aula43object;

import java.util.Arrays;
import java.util.Objects;

public class Aluno{
    private String curso;
    private double[] notas;

    public Aluno() {
        super();
    }
    public Aluno(String curso, double[] notas, String nome, String endereco, String telefone) {
        //super(nome, endereco, telefone);
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
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Aluno: ";
        //s += super.getEndereco();
        
        return s;
    }
    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do aluno");
    }
    
    public String toString(){
        String s = curso + "\n";
        for (double nota : notas){
            s += nota + " ";
        }
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        final Aluno other = (Aluno) obj;
        
        if (curso.equalsIgnoreCase(other.getCurso())){
            return true;
        }
        
        return false;
    }

    
}
