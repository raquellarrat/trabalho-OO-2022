/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhooo;

/**
 *
 * @author NOTE
 */
import java.util.*;
public class Jogo {
    String palavraSecreta = "porta";
    List<Palavra> listaPalavras = new ArrayList<Palavra>();
    
    public void jogar(String tentativa){
        if(tentativa.length() == 5){
            Palavra palavra = new Palavra();
            palavra.transforma(tentativa);
            palavra.setCores(palavraSecreta);
            
        }
    }
    /*Palavra [] palavras = new Palavra[5];
    int vidas = 5;
    private String secreta;
    String auxiliar = "-----";
    Letra letra = new Letra();
    
    public void jogar(String tentativa){
        while(vidas > 0 && !secreta.equals(tentativa)){
            for(int i = 0; i < secreta.length(); i++){
                if(tentativa.indexOf(secreta.charAt(i))!= -1){
                    if(tentativa.indexOf(secreta.charAt(i))== i)
                        letra.setChar(secreta.charAt(i));//colocar cor verde;
                        letra.setCor(1);
                    else{
                        letra.setChar(secreta.charAt(i));//colocar cor verde;
                        letra.setCor(2);//colocar cor amarela;  
                    }
                }
                else{
                    //colocar cinza;
                }
            }
        }
    }*/
    
}
