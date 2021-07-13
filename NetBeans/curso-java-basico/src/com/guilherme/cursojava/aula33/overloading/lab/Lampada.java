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
public class Lampada {
        
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private String garantiaMeses; 
    private String[] tipos; 
    private boolean lampadaLigada;

    public Lampada() {
    }

    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, String garantiaMeses, String[] tipos, boolean lampadaLigada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.lampadaLigada = lampadaLigada;
    }
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tensao
     */
    public String getTensao() {
        return tensao;
    }

    /**
     * @param tensao the tensao to set
     */
    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the tipoLuz
     */
    public String getTipoLuz() {
        return tipoLuz;
    }

    /**
     * @param tipoLuz the tipoLuz to set
     */
    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    /**
     * @return the garantiaMeses
     */
    public String getGarantiaMeses() {
        return garantiaMeses;
    }

    /**
     * @param garantiaMeses the garantiaMeses to set
     */
    public void setGarantiaMeses(String garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    /**
     * @return the tipos
     */
    public String[] getTipos() {
        return tipos;
    }

    /**
     * @param tipos the tipos to set
     */
    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    /**
     * @return the lampadaLigada
     */
    public boolean isLampadaLigada() {
        return lampadaLigada;
    }

    /**
     * @param lampadaLigada the lampadaLigada to set
     */
    public void setLampadaLigada(boolean lampadaLigada) {
        this.lampadaLigada = lampadaLigada;
    }

        
    public void ligarLampada(){
        setLampadaLigada(true);
               
    }
    
    public void desligarLampada(){
        setLampadaLigada(false);
    }
    
    
    public void mostrarEstado(){
        if(isLampadaLigada()){
            System.out.println("Lâmpada está ligada!");
        } else {
            System.out.println("Lâmpada está desligada!");
        }
    }
    
    public void mudarEstado(){
        if (isLampadaLigada()){
            desligarLampada();
        } else {
            ligarLampada();            
        }
    }
}
