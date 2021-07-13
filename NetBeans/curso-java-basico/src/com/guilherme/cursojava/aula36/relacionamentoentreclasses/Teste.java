
package com.guilherme.cursojava.aula36.relacionamentoentreclasses;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Frodo");
        //contato.setEndereco("Sao Paulo");
        //contato.setTelefone("122345677");

        // objeto endereco
        Endereco end = new Endereco();
        end.setNomeRua("Condado");
        end.setNumero("12345");
        end.setComplemento("-");
        end.setCidade("Morgor");
        end.setEstado("Mordor");
        end.setCep("88888");
        
        contato.setEndereco(end);
        
        // objeto telefone
        Telefone tel = new Telefone();
        tel.setDdd("88");
        tel.setNumero("123456789");
        tel.setTipo("Cel");
        
        Telefone tel2 = new Telefone();
        tel2.setDdd("88");
        tel2.setNumero("987654321");
        tel2.setTipo("Casa");
        
        Telefone[] telefones = new Telefone[2];
        
        telefones[0] = tel;
        telefones[1] = tel2;
        
        
         contato.setTelefones(telefones);
        
        // teste saida console 
        
        System.out.println(contato.getNome());
        // System.out.println(contato.getTelefone());
        
        
        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
        
        /*if (contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/
        
        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
        
    }
}
