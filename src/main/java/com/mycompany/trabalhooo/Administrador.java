/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhooo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author raque
 */
public class Administrador extends Usuario {

    public Administrador(String email, String senha, String apelidoUsuario, String vitorias) {
        super(email, senha, apelidoUsuario, vitorias);
    }

    @Override
    public void registraUsuario() {
        try {
            BufferedWriter buffWriteUsuario = new BufferedWriter(new FileWriter("src/main/java/com/mycompany/trabalhooo/Administradores.txt", true));
            buffWriteUsuario.append("\n" + this.apelidoUsuario + ";" + this.senha + ";" + this.email + ";" + this.vitorias);
            buffWriteUsuario.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever novo usuário em Usuarios.txt");
        }
        String[] options = {"Cadastrar nova palavra", "Sair"};
        int option = -1;
        while (option != 1) {
            option = JOptionPane.showOptionDialog(null, "Escolha o que deseja fazer agora:", "Administrador cadastrado!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (option == 0) {
                this.cadastrarPalavra();
            } else {
                exit(0);
            }
        }
    }

    public void cadastrarPalavra() {
        String novaPalavra = JOptionPane.showInputDialog(null, "Digite a nova palavra: ");
        if (novaPalavra.length() == 5 && novaPalavra.matches("[a-z]*")) {
            try {
                BufferedWriter buffWritePalavra = new BufferedWriter(new FileWriter("src/main/java/com/mycompany/trabalhooo/Arquivos/5Letras.txt", true));
                buffWritePalavra.append(" " + novaPalavra);
                buffWritePalavra.close();
            } catch (IOException e) {
                System.out.println("Erro ao escrever nova palavra.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Palavra Inválida. Não foi possível adicioná-la");
        }
    }

}
