package com.guilherme.cursojava.aula73.threadsresumesuspendstop;

public class Teste {

    public static void main(String[] args) {

        MinhaThread t1 = new MinhaThread("#1");
        MinhaThread t2 = new MinhaThread("#2");

        System.out.println("Pausando a 1");
        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Pausando a 2");
        t2.suspend();

        System.out.println("Resumindo a 1");
        t1.resume();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Resumindo a 2");

        t2.resume();

        t2.stop();
    }
}
