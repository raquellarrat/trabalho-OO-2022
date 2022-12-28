/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhooo;

/**
 *
 * @author NOTE
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Jogo {
    List<String> palavras = new ArrayList<>();
    int numero;
    int vidas = 5;
    String palavraSecreta;
    List<Palavra> listaPalavras = new ArrayList<Palavra>();  /// lista que será preenchida com as palavras tentativa do jogador
    
    public void jogar(){
        try{
            this.palavraSecreta = sorteiaPalavraSecreta();
        }catch(IOException ex){
            System.out.println("Erro");
        }
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
    private String sorteiaPalavraSecreta() throws IOException {
        String path = "src/main/java/com/mycompany/trabalhooo/Arquivos/5Letras.txt";
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        String palavras = "";
        while (true) {
            if (linha != null) {
                palavras += linha;
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
        String [] palavrasSeparadas = palavras.split(" ");
        Random random = new Random();
        int indice = random.nextInt(palavrasSeparadas.length);
        String palavraAleatoria = palavrasSeparadas[indice];
        return palavraAleatoria;
    }
    
}
