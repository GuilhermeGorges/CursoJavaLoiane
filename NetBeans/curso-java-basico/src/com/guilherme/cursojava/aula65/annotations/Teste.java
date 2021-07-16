package com.guilherme.cursojava.aula65.annotations;

@InformacaoAula(
        autor = "Guilherme",
        aulaNumero = 65
)
public class Teste {

    @InformacaoAula(
            autor = "Guilherme",
            aulaNumero = 65
    )
    public static void main(String[] args) {

    }
}
