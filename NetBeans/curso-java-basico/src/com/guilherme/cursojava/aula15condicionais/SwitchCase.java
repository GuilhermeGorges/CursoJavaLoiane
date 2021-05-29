package com.guilherme.cursojava.aula15condicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o dia da semana [0] para sair");
        /*
        while (true){            
            int diaSemana = scan.nextInt(); 
            if (diaSemana == 1){
                System.out.println("Domingo");
            } else if (diaSemana == 2){
                System.out.println("Segunda");
            } else if (diaSemana == 3){
                System.out.println("Terça");
            } else if (diaSemana == 4){
                System.out.println("Quarta");
            } else if (diaSemana == 5){
                System.out.println("Quinta");
            } else if (diaSemana == 6){
                System.out.println("Sexta");
            } else if (diaSemana == 7){
                System.out.println("Sábado");
            } else if (diaSemana == 0){
                System.out.println("Até mais");
                break;
            } else {
                System.out.println("Não é um dia da semana válido");
            }
        }
        
        System.out.println("Digite o dia da semana [0] para sair");
        
        while (true){
            int diaSemana = scan.nextInt(); 
            if (diaSemana == 0) {
                System.out.println("Até mais"); 
                break; 
            }            
            switch(diaSemana){
                case 1: System.out.println("Domingo"); break;
                case 2: System.out.println("Segunda"); break;
                case 3: System.out.println("Terça"); break;
                case 4: System.out.println("Quarta"); break;
                case 5: System.out.println("Quinta"); break;
                case 6: System.out.println("Sexta"); break;
                case 7: System.out.println("Sabado"); break;     
                default: System.out.println("Não é um dia da semana válido");
            }
        }
        */
        
        
        while (true){
            int diaSemana = scan.nextInt(); 
            if (diaSemana == 0) {
                System.out.println("Até mais"); 
                break; 
            }            
            switch(diaSemana){
                case 2: 
                case 3:
                case 4:
                case 5: 
                case 6: System.out.println("Dia da semana"); break;
                case 1: 
                case 7: System.out.println("Final de semana"); break;     
                default: System.out.println("Não é um dia da semana válido");
            }
        }
        
        
        
        
    }
}
