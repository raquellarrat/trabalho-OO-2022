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
    public String palavraSecreta;
    List<Palavra> listaPalavras = new ArrayList<>();  /// lista que será preenchida com as palavras tentativa do jogador
    private List<Usuario> usuarios = new ArrayList<>();
    Usuario usuarioAtual;
    
    public Jogo(String nomeUsuario){
        
        this.preencheListaUsuarios();
        

        //configuracaoInicial(nomeUsuario);
        
        
        
        for(Usuario item : usuarios){
            System.out.print(item.apelidoUsuario);
        }
        
    } 
    
    public void preencheListaUsuarios(){
        
        String path = "src/main/java/com/mycompany/trabalhooo/Usuarios.txt";
        try{
            BufferedReader checarUsuario = new BufferedReader(new FileReader(path));
           // String linha= checarUsuario.readLine();
            
            
            
                for (String linha = checarUsuario.readLine(); !linha.isEmpty(); linha = checarUsuario.readLine()) {

                //System.out.println(linha);
                //String dados[] = new String[4];

                String[] dados = linha.split(";");
                // dados = string.split(" ");
               
              
                System.out.println(dados[0]);
                System.out.println(dados[1]);
                System.out.println(dados[2]);
                System.out.println(dados[3]);

               // Jogador jogador = new Jogador(dados[2],dados[1],dados[0],val);
               // usuarios.add(jogador);
                   //  linha = checarUsuario.readLine();

            }
            
            checarUsuario.close();
        }catch (IOException e){
            System.out.println("Impossivel ler lista de usuarios");
           
        }
        
    }
    
    private void configuracaoInicial(String nomeUsuario){
        
        
        String path = "src/main/java/com/mycompany/trabalhooo/Historico/" + nomeUsuario +".txt";
        try{
            BufferedReader checarUsuario = new BufferedReader(new FileReader(path));
            String linha = checarUsuario.readLine();
            checarUsuario.close();
        }catch (IOException e){
           // System.out.println("Usuario nao existe");
           // Usuario novo = new Jogador("email","senha",nomeUsuario,10);
        }
    }
    
    private int obterIndiceUsuario(String usuario){
        for(int i = 0; i < usuarios.size(); i ++){
            if(usuarios.get(i).getApelidoUsuario().equals(usuario))
                return i;
        }
        return -1;
    }
    
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
                Palavra palavra = new Palavra(tentativa);
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
    public String sorteiaPalavraSecreta() throws IOException {
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
    
    
    
    






