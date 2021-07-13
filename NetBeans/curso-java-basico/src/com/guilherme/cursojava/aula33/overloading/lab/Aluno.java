/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula33.overloading.lab;

/**
 *
 * @author Gui e Di
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomesDisciplinas;
    private double[][] notasDisciplina;
    private double mediaDisciplina;

    public Aluno() {
        nomesDisciplinas = new String[3];
        notasDisciplina = new double[3][3];
    }

    public Aluno(String nome, String matricula, String nomeCurso, double mediaDisciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.mediaDisciplina = mediaDisciplina;
        this.nomesDisciplinas = new String[3];
        this.notasDisciplina = new double[3][3];
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the nomesDisciplinas
     */
    public String[] getNomesDisciplinas() {
        return nomesDisciplinas;
    }

    /**
     * @param nomesDisciplinas the nomesDisciplinas to set
     */
    public void setNomesDisciplinas(String[] nomesDisciplinas) {
        this.nomesDisciplinas = nomesDisciplinas;
    }

    /**
     * @return the notasDisciplina
     */
    public double[][] getNotasDisciplina() {
        return notasDisciplina;
    }

    /**
     * @param notasDisciplina the notasDisciplina to set
     */
    public void setNotasDisciplina(double[][] notasDisciplina) {
        this.notasDisciplina = notasDisciplina;
    }

    /**
     * @return the mediaDisciplina
     */
    public double getMediaDisciplina() {
        return mediaDisciplina;
    }

    /**
     * @param mediaDisciplina the mediaDisciplina to set
     */
    public void setMediaDisciplina(double mediaDisciplina) {
        this.mediaDisciplina = mediaDisciplina;
    }
    
    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);
        System.out.println("Teve o seguinte boletim:");
        for (int i = 0; i < 3; i++){
            System.out.print("Na disciplina "+ (i+1) + " - " + nomesDisciplinas[i]+ " teve as notas: ");
            int disciplina = i;
            for (int j = 0; j < notasDisciplina[i].length; j++){
                System.out.print(notasDisciplina[i][j]+ " ");
            }            
            System.out.println();
        }
    }
    
    private double obterMedia(int disciplina){
                
        mediaDisciplina = 0; 
        disciplina--;
        for (int i = 0 ; i < notasDisciplina[disciplina].length; i++ ){
        mediaDisciplina += notasDisciplina[disciplina][i];
        }
        mediaDisciplina = mediaDisciplina / notasDisciplina[disciplina].length;
         
        return mediaDisciplina;
    }    
    
    public boolean aprovadoDisciplina(double mediaDisciplina){
        
        if (mediaDisciplina >= 7){
            return true;
        } else {
            return false;
        }
    }
    
    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.nomesDisciplinas[pos] = nomeDisciplina;
    }
    public void setNotaPosIJ(int posI, int posJ, double nota){
        this.notasDisciplina[posI][posJ] = nota;
    }
    
}
