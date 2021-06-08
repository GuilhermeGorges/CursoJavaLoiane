/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula43.labs.exer02;

/**
 *
 * @author Gui e Di
 */
public class Teste {
    public static void main(String[] args) {
        
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("Contribuinte PF 01");
        pf1.setRendaBruta(1000);
        pf1.setCpf("64522514069");
        
        PessoaFisica pf2 = new PessoaFisica();
        pf2.setNome("Contribuinte PF 02");
        pf2.setRendaBruta(2000);
        pf2.setCpf("31233604074");
                
        PessoaFisica pf3 = new PessoaFisica();
        pf3.setNome("Contribuinte PF 03");
        pf3.setRendaBruta(3000);
        pf3.setCpf("62806965020");
                
        PessoaFisica pf4 = new PessoaFisica();
        pf4.setNome("Contribuinte PF 04");
        pf4.setRendaBruta(4000);
        pf4.setCpf("22182818057");
                
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("Contribuinte PJ 01");
        pj1.setRendaBruta(1000);
        pj1.setCnpj("27735087000100");
                
        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.setNome("Contribuinte PJ 02");
        pj2.setRendaBruta(4000);
        pj2.setCnpj("14273859000189");
                
        PessoaJuridica pj3 = new PessoaJuridica();
        pj3.setNome("Contribuinte PJ 03");
        pj3.setRendaBruta(2000);
        pj3.setCnpj("15284127000157");
        
        
        Contribuinte[] contribuintes = new Contribuinte[7];
        contribuintes[0] = pf1;
        contribuintes[1] = pf2;
        contribuintes[2] = pf3;
        contribuintes[3] = pf4;
        contribuintes[4] = pj1;
        contribuintes[5] = pj2;
        contribuintes[6] = pj3;
        
        for (Contribuinte c: contribuintes){
            System.out.println(c.toString());
        }
    }
}
