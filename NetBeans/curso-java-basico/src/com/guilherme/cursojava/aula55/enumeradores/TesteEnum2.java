/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula55.enumeradores;

import com.guilherme.cursojava.aula53.enumeradores.DiaSemana;

/**
 *
 * @author Gui e Di
 */
public class TesteEnum2 {

    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
        
        System.out.println(dia);

    }
}
