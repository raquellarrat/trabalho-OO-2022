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
import java.util.Scanner;
import java.util.Random;

public class Jogo {
    //String palavraSecreta = "porta";  /// palavra que será sorteada para o jogador adivinhar
    //String palavraSecreta = "";
    String[] palavrasSecretas = {"porta", "forca", "nadar", "velho", "rosca"};
    Random random = new Random();
    int indice = random.nextInt(4);
    String palavraSecreta = palavrasSecretas[indice];

    int vidas = 5;
    List<Palavra> listaPalavras = new ArrayList<Palavra>();  /// lista que será preenchida com as palavras tentativa do jogador
    
    public void jogar(){
        String tentativa;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua palavra");
        System.out.println("_ _ _ _ _");
        tentativa = s.nextLine();
        if(tentativa.length() == 5){
            while(vidas >= 0){
            if(tentativa.equals(palavraSecreta)){
                System.out.println("Parabéns, você acertou! A palavra secreta é " + palavraSecreta + "!");
                return;
            }
                Palavra palavra = new Palavra();
                palavra.transforma(tentativa);
                palavra.setCores(palavraSecreta);
                listaPalavras.add(palavra);
                imprimirTela(palavra);
                vidas--;
                //System.out.println("Digite sua palavra");
                System.out.println();
                System.out.println("_ _ _ _ _");
                tentativa = s.nextLine();
            }
        }
    }
    private void imprimirTela(Palavra palavra){
        for(int i = 0; i < listaPalavras.size(); i++){
            System.out.println();
            listaPalavras.get(i).imprime();
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
