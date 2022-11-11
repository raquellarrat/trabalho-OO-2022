/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhooo;

/**
 *
 * @author NOTE
 */
public class Palavra {
    public Letra letras[] = new Letra[5];
    
    public Palavra(){
        for(int i = 0; i < 5; i ++){
            letras[i] = new Letra();
        }
    }
    
    public void transforma(String palavra){
        for(int i = 0; i < palavra.length(); i++){
            letras[i].setChar(palavra.charAt(i));
            //System.out.print(letras[i].getChar());
        }
    }
    
    public void setCores(String palavraSecreta){
        for(int i = 0; i < palavraSecreta.length(); i++){
            if(buscaCaractere(palavraSecreta.charAt(i))!= -1){
                if(letras[i].getChar() == palavraSecreta.charAt(i))
                    letras[i].setCor(1);
                else{ 
                    letras[i].setCor(2);
                    System.out.println(letras[i].getChar());
                }   
            }
            else
                letras[i].setCor(3);
            System.out.print(letras[i].getCor() + " ");
        }
        
    }
    
    private int buscaCaractere(char c){
        for (int i = 0; i < 5; i++){
            if(letras[i].getChar() == c)
                return i;
        }
        return -1;
    }
    
    public void imprime(){
        for(int i = 0; i < 5; i++){
            System.out.println(letras[i].getChar());
        }
    }
    
}
