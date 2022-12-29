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
    File historico;
    private int fase;

    public Usuario(String email, String senha, String apelidoUsuario) {
        this.apelidoUsuario = apelidoUsuario;
        this.email = email;
        this.senha = senha;

        File arquivo = new File("src/main/java/com/mycompany/trabalhooo/Historico/" + apelidoUsuario +".txt");
        try {
            arquivo.createNewFile();
            System.out.println("Usuario criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.historico = arquivo;
        try{
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter("src/main/java/com/mycompany/trabalhooo/Usuarios.txt",true));
            String linha = this.apelidoUsuario;
            buffWrite.append(linha + "\n");
            buffWrite.close();
        }catch(IOException e){
            System.out.println("Erro ao gravar usuario");
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
    
    public abstract void criarCampeonato();
    
    public abstract void gerenciarUsuarios();
    
    public abstract void Jogar();

}
