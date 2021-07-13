
package com.guilherme.cursojava.aula41.abstractt;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

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
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Aluno: ";
        s += super.getEndereco();
        
        return s;
    }
    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do aluno");
    }
    
}
