package com.guilherme.cursojava.aula65.annotations;

@interface InformacaoAula {

    String autor();
    
    int aulaNumero();
    
    String blog() default "https://github.com/GuilhermeGorges";
    
    String site() default "https://www.linkedin.com/in/guilherme-gabriel-a7757b20b/";
    
}
