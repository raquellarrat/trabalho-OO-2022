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
    
    public void transforma(String palavra){ //// transforma a palavra tentativa em um vetor de Letra
        for(int i = 0; i < palavra.length(); i++){
            letras[i].setChar(palavra.charAt(i));
        }
    }
    
    public void setCores(String palavraSecreta){
        for(int i = 0; i < palavraSecreta.length(); i++){
            auxiliarSetCores(letras[i], i, palavraSecreta);
        }
        
    }
    
    private void auxiliarSetCores(Letra letra, int posicao, String palavraSecreta){
        if(palavraSecreta.charAt(posicao) == letra.getChar())
            letra.setCor(1);
        else{
            for(int i = 0; i < 5; i++){
                if(palavraSecreta.charAt(i) == letra.getChar()){
                    letra.setCor(2);
                    break;
                }
            }
        }
        if(letra.getCor() != 1 && letra.getCor() != 2)
            letra.setCor(3);
    }
    
    public void imprime(){
        
        for (int i = 0; i < 5; i++){
            System.out.print(letras[i].getChar() + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++){
        System.out.print(letras[i].getCor() + " ");
    }
//        for(int i = 0; i < 5; i++){
//            System.out.print(letras[i].getChar() + "----" + letras[i].getCor());
//            System.out.println();
//        }
    }
    
}
