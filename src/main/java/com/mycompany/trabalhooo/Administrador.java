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
public class Administrador extends Usuario{

    public Administrador(String email, String senha, String apelidoUsuario, String vitorias) {
        super(email, senha, apelidoUsuario, vitorias);
    }

    @Override
    public void gerenciarPalavras() {
   
    }

   
    @Override
    public void gerenciarUsuarios() {
       
    }

    @Override
    public void Jogar() {
        
    }
    @Override
    public void registraUsuario(){
        try{
            BufferedWriter buffWriteUsuario = new BufferedWriter(new FileWriter("src/main/java/com/mycompany/trabalhooo/Administradores.txt",true));
            buffWriteUsuario.append("\n" + this.apelidoUsuario + ";" + this.senha + ";" + this.email + ";" + this.vitorias);
            buffWriteUsuario.close();
        }catch(IOException e){
            System.out.println("Erro ao escrever novo usuário em Usuarios.txt");
        }
    }

}
