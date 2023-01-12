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
public class Jogador extends Usuario {

    public Jogador(String email, String senha, String apelidoUsuario, String vitorias) {
        super(email, senha, apelidoUsuario, vitorias);
    }

    @Override
    public void registraUsuario() {
        try {
            BufferedWriter buffWriteUsuario = new BufferedWriter(new FileWriter("src/main/java/com/mycompany/trabalhooo/Usuarios.txt", true));
            buffWriteUsuario.append("\n" + this.apelidoUsuario + ";" + this.senha + ";" + this.email + ";" + this.vitorias);
            buffWriteUsuario.close();
            File arquivo = new File("src/main/java/com/mycompany/trabalhooo/Historico/" + apelidoUsuario + ".txt");
            arquivo.createNewFile();
        } catch (IOException e) {
            System.out.println("Erro ao escrever novo usuário em Usuarios.txt");
        }
    }

}
