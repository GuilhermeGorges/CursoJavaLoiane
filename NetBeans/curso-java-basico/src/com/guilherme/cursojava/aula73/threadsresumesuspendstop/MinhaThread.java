package com.guilherme.cursojava.aula73.threadsresumesuspendstop;

public class MinhaThread implements Runnable {

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;
    

    private final int NUM = 10;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {

        System.out.println("Executando " + this.nome);

        try {
            for (int i = 0; i < NUM; i++) {
                System.out.println("Thread " + nome + " , " + i);
                Thread.sleep(300);
                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                    if (this.foiTerminada){
                        break;
                    }
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Thread " + this.nome + " terminada.");

    }
    
    void suspend(){
        this.estaSuspensa = true;
    }

    synchronized void resume(){
        this.estaSuspensa = false;
        notify();
    }
    
    synchronized void stop(){
        this.foiTerminada = true;        
        notify();
    }
}
