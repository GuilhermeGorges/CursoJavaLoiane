/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17z.labs.exercicios;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true){
            System.out.println("Digite o nome do usuário: ");
            String login = scan.nextLine();
            
            System.out.println("Digite a senha: ");
            String password = scan.nextLine();
            
            
            
            if (login.equalsIgnoreCase(password)){
                System.out.println("Login e senha iguais, tente novamente.");
            } else {
                System.out.println("Login "+login );
                System.out.println("Password "+password);
                break;
            }
        }
        
    }
}
