package com.guilherme.cursojava.aula27orientacaoaobjetos_metodos.labs;

public class Aluno {
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomesDisciplinas = new String[3];
    double[][] notasDisciplina = new double[3][3];
    double mediaDisciplina;
    
    void mostrarInfo(){
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
    
    boolean aprovadoDisciplina(int disciplina){
        
        mediaDisciplina = 0; 
        disciplina--;
        for (int i = 0 ; i < notasDisciplina[disciplina].length; i++ ){
        mediaDisciplina += notasDisciplina[disciplina][i];
        }
        mediaDisciplina = mediaDisciplina / notasDisciplina[disciplina].length;
                    
        if (mediaDisciplina >= 7){
            return true;
        } else {
            return false;
        }
    }
    
}
