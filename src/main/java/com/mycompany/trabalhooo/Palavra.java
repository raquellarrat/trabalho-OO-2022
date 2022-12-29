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

public class Palavra {
    public List<Letra> letras = new ArrayList<>();
    
    
    public Palavra(String palavra){ //// transforma a palavra tentativa em um vetor de Letra
        for(int i = 0; i < palavra.length(); i++){
            letras.add(new Letra());
            letras.get(i).setChar(palavra.charAt(i));
        }
    }
    
    public void setCores(String palavraSecreta){
        for(int i = 0; i < palavraSecreta.length(); i++){
            auxiliarSetCores(letras.get(i), i, palavraSecreta);
        }
        
    }
    
    private void auxiliarSetCores(Letra letra, int posicao, String palavraSecreta){
        if(palavraSecreta.charAt(posicao) == letra.getChar())
            letra.setCor(1);  /// cor verde: a letra existe na palavra e se encontra na mesma posiçao
        else{
            for(int i = 0; i < 5; i++){
                if(palavraSecreta.charAt(i) == letra.getChar()){
                    letra.setCor(2);  /// cor amarela: a letra se encontra na palavra, mas em posição distinta
                    break;
                }
            }
        }
        if(letra.getCor() != 1 && letra.getCor() != 2)
            letra.setCor(3);   /// cor cinza: a letra não se encontra na palavra
    }
    
    public void imprime(){
        
        for (int i = 0; i < 5; i++){
            System.out.print(letras.get(i).getChar() + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++){
        System.out.print(letras.get(i).getCor() + " ");
    }
//        for(int i = 0; i < 5; i++){
//            System.out.print(letras[i].getChar() + "----" + letras[i].getCor());
//            System.out.println();
//        }
    }
    
}
