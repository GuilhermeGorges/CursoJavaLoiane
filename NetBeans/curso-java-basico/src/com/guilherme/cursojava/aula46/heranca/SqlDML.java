/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula46.heranca;

/**
 *
 * @author Gui e Di
 */
public interface SqlDML{

    void insert(String query);
    void update(String query);
    void delete(String query);
    String select(String query);
    
    
    
}
