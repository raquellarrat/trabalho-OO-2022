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
    String[] palavrasSecretas = {"porta", "forca", "nadar", "velho", "rosca", "louca", "feliz", "pobre"};
    Random random = new Random();
    int indice = random.nextInt(7);  /// sorteia um índice para pegar uma string de palavrasSecretas
    String palavraSecreta = palavrasSecretas[indice]; /// palavra que será sorteada para o jogador adivinhar

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
    
}
