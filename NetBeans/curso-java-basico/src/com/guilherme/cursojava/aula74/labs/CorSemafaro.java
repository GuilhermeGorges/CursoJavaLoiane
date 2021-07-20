package com.guilherme.cursojava.aula74.labs;

public enum CorSemafaro {
    VERDE(1500), AMARELO(500), VERMELHO(2000);
    
    private int tempoEspera;

    private CorSemafaro(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }   
    
}
