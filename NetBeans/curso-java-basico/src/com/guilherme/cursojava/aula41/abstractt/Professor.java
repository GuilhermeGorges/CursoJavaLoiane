 
package com.guilherme.cursojava.aula41.abstractt;
 
public class Professor extends Pessoa {
    private Double salario;
    private String nomeCurso;

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }    
    public double calcularSalarioLiquido(){
        return 0;
    }
    public String obterEtiquetaEndereco(){
    String s = "Endereço do Professor: ";
    s += super.getEndereco();

    return s;
    }
    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do professor");
        }
    
}
