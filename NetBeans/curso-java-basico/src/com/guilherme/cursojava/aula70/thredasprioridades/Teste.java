package com.guilherme.cursojava.aula70.thredasprioridades;

import com.guilherme.cursojava.aula69.variasthread.MinhaThreadRunnable;

public class Teste {
    public static void main(String[] args) {
        
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("--1", 600);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("--2", 600);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("--3", 600);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
