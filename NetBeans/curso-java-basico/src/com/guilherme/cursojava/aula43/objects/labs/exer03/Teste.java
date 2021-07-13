/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula43.objects.labs.exer03;

/**
 *
 * @author Gui e Di
 */
public class Teste {
    public static void main(String[] args) {
        
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        //camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2);
        
        
        Animal tubarao = new Animal();
        tubarao.setNome("Tubarao");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        
        Mamifero urso = new Mamifero();
        urso.setNome("Urso do canadá");        
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);
        
        Animal[] animals = new Animal[3];
        animals[0] = camelo;
        animals[1] = tubarao;
        animals[2] = urso;
        
        System.out.println("------------------------");
        for (Animal animal: animals){
            System.out.println(animal.toString());
            System.out.println("------------------------");
        }
    }
}
