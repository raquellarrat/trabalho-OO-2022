/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhooo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author raque
 */
public abstract class Usuario {

    String apelidoUsuario; /// vai ser o nome do arquivo txt que tem o historico de vitórias
    String email;
    String senha;
    int vitorias;
    File historico;
    private int fase;

    public Usuario(String email, String senha, String apelidoUsuario,String vitorias) {
        this.apelidoUsuario = apelidoUsuario;
        this.email = email;
        this.senha = senha;
        this.vitorias = Character.getNumericValue(vitorias.charAt(0));
        
        File arquivo = new File("src/main/java/com/mycompany/trabalhooo/Historico/" + apelidoUsuario +".txt");
        try {
            arquivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try{
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter("src/main/java/com/mycompany/trabalhooo/Historico/" + apelidoUsuario +".txt",true));
            buffWrite.append("TENTATIVA  ACERTO  ERRO  \n");
            buffWrite.close();
        }catch(IOException e){
            System.out.println("Erro ao escrever no historico");
        }
        
       
        this.historico = arquivo;
	
    }
    public void registraUsuario(){
        try{
            BufferedWriter buffWriteUsuario = new BufferedWriter(new FileWriter("src/main/java/com/mycompany/trabalhooo/Usuarios.txt",true));
            buffWriteUsuario.append(this.apelidoUsuario + ";" + this.senha + ";" + this.email + ";" + this.vitorias + "\n");
            buffWriteUsuario.close();
            File arquivo = new File("src/main/java/com/mycompany/trabalhooo/Historico/" + apelidoUsuario +".txt");
            arquivo.createNewFile();
        }catch(IOException e){
            System.out.println("Erro ao escrever novo usuário em Usuarios.txt");
        }
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getApelidoUsuario() {
        return apelidoUsuario;
    }

    public abstract void gerenciarPalavras(); /// adicionar palavras no jogo;
    
    
    public abstract void gerenciarUsuarios();
    
    public abstract void Jogar();

}
