
package com.guilherme.cursojava.aula52.excecao.labs;

/**
 *
 * @author Gui e Di
 */
public class AgendaCheiaExeption extends Exception {

    @Override
    public String getMessage() {        
        return "Agenda já está Cheia";
    }      
    
}
