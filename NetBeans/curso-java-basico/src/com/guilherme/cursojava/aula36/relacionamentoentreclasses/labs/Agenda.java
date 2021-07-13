
package com.guilherme.cursojava.aula36.relacionamentoentreclasses.labs;

public class Agenda {
    
    private String nome;
    private Contato[] contatos;

    
    
    public Agenda(){        
    }
    
    
    public Agenda(String nome){  
        this.nome = nome;
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
     * @return the contatos
     */
    public Contato[] getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    
    public String obterInfo(){
        String info = "Nome = " + nome + "\n";
        
        if (contatos != null){
            for (Contato c : contatos){
                info += c.obterInfo() + "\n";
            }
        }
        
        return info;
    }
    
}
