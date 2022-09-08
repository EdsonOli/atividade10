/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author edso0
 */

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author sidneynogueira
 */
public class MeuMapeamento<C,V> implements IMeuMapeamento<C,V> {
    
    
    private ArrayList<Object[]> mapa = new ArrayList<>();
    
    @Override
    public void insere(C chave, V valor) {
        Object[] lista = new Object[2];
        if(!jaExiste(chave)){
            lista[0] =  chave;
            lista[1] = valor;
            mapa.add(lista);
        }
    }

    @Override
    public V valor(C chave) {

        V retorno = null;
        for( Object[] o : mapa){
            if(o[0].equals(chave)){
                retorno = (V) o[1];
            }
        }
        
        return retorno;
    }

    @Override
    public Collection<V> valores() {
        ArrayList<V> val = new ArrayList<>();
         for( Object[] o : mapa){
            val.add((V)o[1]);
        }
        return val; 
    }     

    @Override
    public Collection<C> chaves() {
            ArrayList<C> val = new ArrayList<>();
         for( Object[] o : mapa){
            val.add((C)o[0]);
        }
        return val;
    }
    
    private boolean jaExiste(Object coisa){
       boolean existe = false;
      for( Object[] o : mapa){
        if(o[0].equals(coisa)){
            existe = true;
        }
      }
      return existe;
    }
   
}

