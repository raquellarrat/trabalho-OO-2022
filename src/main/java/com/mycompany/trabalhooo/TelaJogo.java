/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhooo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author raque
 */
public class TelaJogo extends javax.swing.JFrame {

    String palavraSecreta;
    boolean bloco1Selecionado = false;
    boolean bloco2Selecionado = false;
    boolean bloco3Selecionado = false;
    boolean bloco4Selecionado = false;
    boolean bloco5Selecionado = false;
    boolean bloco6Selecionado = false;
    boolean bloco7Selecionado = false;
    boolean bloco8Selecionado = false;
    boolean bloco9Selecionado = false;
    boolean bloco10Selecionado = false;
    boolean bloco11Selecionado = false;
    boolean bloco12Selecionado = false;
    boolean bloco13Selecionado = false;
    boolean bloco14Selecionado = false;
    boolean bloco15Selecionado = false;
    boolean bloco16Selecionado = false;
    boolean bloco17Selecionado = false;
    boolean bloco18Selecionado = false;
    boolean bloco19Selecionado = false;
    boolean bloco20Selecionado = false;
    boolean bloco21Selecionado = false;
    boolean bloco22Selecionado = false;
    boolean bloco23Selecionado = false;
    boolean bloco24Selecionado = false;
    boolean bloco25Selecionado = false;
    boolean bloco26Selecionado = false;
    boolean bloco27Selecionado = false;
    boolean bloco28Selecionado = false;
    boolean bloco29Selecionado = false;
    boolean bloco30Selecionado = false;
    Jogo jogo;
    /**
     * Creates new form TelaJogo
     */
    public TelaJogo() {
        initComponents();
    }

    public void Jogar(String NomeJogador) {
        
        
        jogo = new Jogo(NomeJogador);

        try {
            jogo.palavraSecreta = jogo.sorteiaPalavraSecreta();
            this.palavraSecreta = jogo.palavraSecreta.toUpperCase();
        } catch (IOException ex) {
            System.out.println("Erro");
        }
        System.out.println(this.palavraSecreta);
        this.setVisible(true);
        
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton8.setVisible(false);
    }

    public void verificaTentativa1(String palavraSecreta) {
   
        if (botao1.getText().length() == 1
                && botao2.getText().length() == 1
                && botao3.getText().length() == 1
                && botao4.getText().length() == 1
                && botao5.getText().length() == 1) {
            String tentativa = botao1.getText() + botao2.getText() + botao3.getText() + botao4.getText() + botao5.getText();
            System.out.println(tentativa);
            if (tentativa.equals(palavraSecreta)) {
                //// exibir tela de vitoria
                
                botao1.setBackground(Color.green);
                botao2.setBackground(Color.green);
                botao3.setBackground(Color.green);
                botao4.setBackground(Color.green);
                botao5.setBackground(Color.green);
                
                try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "1   1   0";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
                
                
                
                String mensagem = "Parabéns, você venceu! A palavra secreta era: " + this.palavraSecreta;
                JOptionPane.showMessageDialog(null, mensagem);
                ///fechar telade jogo
            }
            else{  
                try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "1   0   1";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
                Palavra palavra = new Palavra(tentativa);
                System.out.println(palavra.letras.get(0).getChar());
                palavra.setCores(palavraSecreta);
                int cor = palavra.letras.get(0).getCor();
                System.out.println(cor);
                if (cor == 1) {
                    botao1.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao1.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao1.setBackground(Color.gray);
                }
                cor = palavra.letras.get(1).getCor();
                if (cor == 1) {
                    botao2.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao2.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao2.setBackground(Color.gray);
                }
                cor = palavra.letras.get(2).getCor();
                if (cor == 1) {
                    botao3.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao3.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao3.setBackground(Color.gray);
                }

                cor = palavra.letras.get(3).getCor();
                if (cor == 1) {
                    botao4.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao4.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao4.setBackground(Color.gray);
                }

                cor = palavra.letras.get(4).getCor();
                if (cor == 1) {
                    botao5.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao5.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao5.setBackground(Color.gray);
                }
                jButton3.setVisible(true);
                jButton1.setVisible(false);

                botao1.setEnabled(false);
                botao2.setEnabled(false);
                botao3.setEnabled(false);
                botao4.setEnabled(false);
                botao5.setEnabled(false);
            }
        }
    }

    public void verificaTentativa2(String palavraSecreta) {
        if (botao6.getText().length() == 1
                && botao7.getText().length() == 1
                && botao8.getText().length() == 1
                && botao9.getText().length() == 1
                && botao10.getText().length() == 1) {
            String tentativa = botao6.getText() + botao7.getText() + botao8.getText() + botao9.getText() + botao10.getText();
            System.out.println(tentativa);
            if (tentativa.equals(palavraSecreta)) {

                
                botao6.setBackground(Color.green);
                botao7.setBackground(Color.green);
                botao8.setBackground(Color.green);
                botao9.setBackground(Color.green);
                botao10.setBackground(Color.green);
                
                try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "2   1   0";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
                
                String mensagem = "Parabéns, você venceu! A palavra secreta era: " + this.palavraSecreta;
                JOptionPane.showMessageDialog(null, mensagem);
                ///fechar telade jogo
                //contabilizar pontos do jogador
            }
            else{

                try {
                        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                        String linha = "2   0   1";
                        buffWrite.append(linha + "\n");
                        buffWrite.close();
                    } catch (IOException e) {
                        System.out.println("Erro ao gravar usuario");
                    }


                Palavra palavra = new Palavra(tentativa);
                System.out.println(palavra.letras.get(0).getChar());
                palavra.setCores(palavraSecreta);
                int cor = palavra.letras.get(0).getCor();
                System.out.println(cor);
                if (cor == 1) {
                    botao6.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao6.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao6.setBackground(Color.gray);
                }
                cor = palavra.letras.get(1).getCor();
                if (cor == 1) {
                    botao7.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao7.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao7.setBackground(Color.gray);
                }
                cor = palavra.letras.get(2).getCor();
                if (cor == 1) {
                    botao8.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao8.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao8.setBackground(Color.gray);
                }

                cor = palavra.letras.get(3).getCor();
                if (cor == 1) {
                    botao9.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao9.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao9.setBackground(Color.gray);
                }

                cor = palavra.letras.get(4).getCor();
                if (cor == 1) {
                    botao10.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao10.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao10.setBackground(Color.gray);
                }

                jButton3.setVisible(false);
                jButton4.setVisible(true);

                botao6.setEnabled(false);
                botao7.setEnabled(false);
                botao8.setEnabled(false);
                botao9.setEnabled(false);
                botao10.setEnabled(false);
            }
        }
    }

    public void verificaTentativa3(String palavraSecreta) {
        if (botao11.getText().length() == 1
                && botao12.getText().length() == 1
                && botao13.getText().length() == 1
                && botao14.getText().length() == 1
                && botao15.getText().length() == 1) {
            String tentativa = botao11.getText() + botao12.getText() + botao13.getText() + botao14.getText() + botao15.getText();
            System.out.println(tentativa);
            if (tentativa.equals(palavraSecreta)) {
                
                botao11.setBackground(Color.green);
                botao12.setBackground(Color.green);
                botao13.setBackground(Color.green);
                botao14.setBackground(Color.green);
                botao15.setBackground(Color.green);
                
                
                 try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "3   1   0 ";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
                String mensagem = "Parabéns, você venceu! A palavra secreta era: " + this.palavraSecreta;
                JOptionPane.showMessageDialog(null, mensagem);
                ///fechar telade jogo
            }
            else{
               try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "3   0   1 ";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
               
               
                Palavra palavra = new Palavra(tentativa);
                System.out.println(palavra.letras.get(0).getChar());
                palavra.setCores(palavraSecreta);
                int cor = palavra.letras.get(0).getCor();
                System.out.println(cor);
                if (cor == 1) {
                    botao11.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao11.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao11.setBackground(Color.gray);
                }
                cor = palavra.letras.get(1).getCor();
                if (cor == 1) {
                    botao12.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao12.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao12.setBackground(Color.gray);
                }
                cor = palavra.letras.get(2).getCor();
                if (cor == 1) {
                    botao13.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao13.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao13.setBackground(Color.gray);
                }

                cor = palavra.letras.get(3).getCor();
                if (cor == 1) {
                    botao14.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao14.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao14.setBackground(Color.gray);
                }

                cor = palavra.letras.get(4).getCor();
                if (cor == 1) {
                    botao15.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao15.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao15.setBackground(Color.gray);
                }
                jButton5.setVisible(true);
                jButton4.setVisible(false);

                botao11.setEnabled(false);
                botao12.setEnabled(false);
                botao13.setEnabled(false);
                botao14.setEnabled(false);
                botao15.setEnabled(false);
            }
        }
    }

    public void verificaTentativa4(String palavraSecreta) {
        if (botao16.getText().length() == 1
                && botao17.getText().length() == 1
                && botao18.getText().length() == 1
                && botao19.getText().length() == 1
                && botao20.getText().length() == 1) {
            String tentativa = botao16.getText() + botao17.getText() + botao18.getText() + botao19.getText() + botao20.getText();
            System.out.println(tentativa);
            if (tentativa.equals(palavraSecreta)) {
                
                botao16.setBackground(Color.green);
                botao17.setBackground(Color.green);
                botao18.setBackground(Color.green);
                botao19.setBackground(Color.green);
                botao20.setBackground(Color.green);
                
                   try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "4   1   0 \n";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
                String mensagem = "Parabéns, você venceu! A palavra secreta era: " + this.palavraSecreta;
                JOptionPane.showMessageDialog(null, mensagem);
                ///fechar telade jogo
            }
            else{
               try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "4   0   1 ";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
               
                Palavra palavra = new Palavra(tentativa);
                System.out.println(palavra.letras.get(0).getChar());
                palavra.setCores(palavraSecreta);
                int cor = palavra.letras.get(0).getCor();
                System.out.println(cor);
                if (cor == 1) {
                    botao16.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao16.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao16.setBackground(Color.gray);
                }
                cor = palavra.letras.get(1).getCor();
                if (cor == 1) {
                    botao17.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao17.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao17.setBackground(Color.gray);
                }
                cor = palavra.letras.get(2).getCor();
                if (cor == 1) {
                    botao18.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao18.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao18.setBackground(Color.gray);
                }

                cor = palavra.letras.get(3).getCor();
                if (cor == 1) {
                    botao19.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao19.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao19.setBackground(Color.gray);
                }

                cor = palavra.letras.get(4).getCor();
                if (cor == 1) {
                    botao20.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao20.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao20.setBackground(Color.gray);
                }
                jButton5.setVisible(false);
                jButton6.setVisible(true);

                botao16.setEnabled(false);
                botao17.setEnabled(false);
                botao18.setEnabled(false);
                botao19.setEnabled(false);
                botao20.setEnabled(false);
            }
        }
    }

    public void verificaTentativa5(String palavraSecreta) {
        if (botao21.getText().length() == 1
                && botao22.getText().length() == 1
                && botao23.getText().length() == 1
                && botao24.getText().length() == 1
                && botao25.getText().length() == 1) {
            String tentativa = botao21.getText() + botao22.getText() + botao23.getText() + botao24.getText() + botao25.getText();
            System.out.println(tentativa);
            if (tentativa.equals(palavraSecreta)) {
                
                botao21.setBackground(Color.green);
                botao22.setBackground(Color.green);
                botao23.setBackground(Color.green);
                botao24.setBackground(Color.green);
                botao25.setBackground(Color.green);
                
                 try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "5   1   0 ";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
                 
                 
                String mensagem = "Parabéns, você venceu! A palavra secreta era: " + this.palavraSecreta;
                JOptionPane.showMessageDialog(null, mensagem);
                ///fechar telade jogo
            }
            else{
                try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "5   0   1 ";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
            
            
                Palavra palavra = new Palavra(tentativa);
                System.out.println(palavra.letras.get(0).getChar());
                palavra.setCores(palavraSecreta);
                int cor = palavra.letras.get(0).getCor();
                System.out.println(cor);
                if (cor == 1) {
                    botao21.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao21.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao21.setBackground(Color.gray);
                }
                cor = palavra.letras.get(1).getCor();
                if (cor == 1) {
                    botao22.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao22.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao22.setBackground(Color.gray);
                }
                cor = palavra.letras.get(2).getCor();
                if (cor == 1) {
                    botao23.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao23.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao23.setBackground(Color.gray);
                }

                cor = palavra.letras.get(3).getCor();
                if (cor == 1) {
                    botao24.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao24.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao24.setBackground(Color.gray);
                }

                cor = palavra.letras.get(4).getCor();
                if (cor == 1) {
                    botao25.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao25.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao25.setBackground(Color.gray);
                }
                jButton8.setVisible(true);
                jButton6.setVisible(false);

                botao21.setEnabled(false);
                botao22.setEnabled(false);
                botao23.setEnabled(false);
                botao24.setEnabled(false);
                botao25.setEnabled(false);
            }
        }
    }

    public void verificaTentativa6(String palavraSecreta) {
        if (botao26.getText().length() == 1
                && botao27.getText().length() == 1
                && botao28.getText().length() == 1
                && botao29.getText().length() == 1
                && botao30.getText().length() == 1) {
            String tentativa = botao26.getText() + botao27.getText() + botao28.getText() + botao29.getText() + botao30.getText();
            System.out.println(tentativa);
            if (tentativa.equals(palavraSecreta)) {
                
                botao26.setBackground(Color.green);
                botao27.setBackground(Color.green);
                botao28.setBackground(Color.green);
                botao29.setBackground(Color.green);
                botao30.setBackground(Color.green);
                
                  try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "6   1   0 ";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
                  
                String mensagem = "Parabéns, você venceu! A palavra secreta era: " + this.palavraSecreta;
                JOptionPane.showMessageDialog(null, mensagem);
                ///fechar telade jogo
            }
            else{
                try {
                    BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.jogo.path, true));
                    String linha = "6   0   1";
                    buffWrite.append(linha + "\n");
                    buffWrite.close();
                } catch (IOException e) {
                    System.out.println("Erro ao gravar usuario");
                }
             
             
                Palavra palavra = new Palavra(tentativa);
                System.out.println(palavra.letras.get(0).getChar());
                palavra.setCores(palavraSecreta);
                int cor = palavra.letras.get(0).getCor();
                System.out.println(cor);
                if (cor == 1) {
                    botao26.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao26.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao26.setBackground(Color.gray);
                }
                cor = palavra.letras.get(1).getCor();
                if (cor == 1) {
                    botao27.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao27.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao27.setBackground(Color.gray);
                }
                cor = palavra.letras.get(2).getCor();
                if (cor == 1) {
                    botao28.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao28.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao28.setBackground(Color.gray);
                }

                cor = palavra.letras.get(3).getCor();
                if (cor == 1) {
                    botao29.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao29.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao29.setBackground(Color.gray);
                }

                cor = palavra.letras.get(4).getCor();
                if (cor == 1) {
                    botao30.setBackground(Color.green);
                }
                if (cor == 2) {
                    botao30.setBackground(Color.yellow);
                }
                if (cor == 3) {
                    botao30.setBackground(Color.gray);
                }

                jButton8.setVisible(false);


                botao21.setEnabled(false);
                botao22.setEnabled(false);
                botao23.setEnabled(false);
                botao24.setEnabled(false);
                botao25.setEnabled(false);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botao1 = new javax.swing.JButton();
        w = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        q = new javax.swing.JButton();
        e = new javax.swing.JButton();
        r = new javax.swing.JButton();
        t = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        y = new javax.swing.JButton();
        u = new javax.swing.JButton();
        i = new javax.swing.JButton();
        o = new javax.swing.JButton();
        p = new javax.swing.JButton();
        s = new javax.swing.JButton();
        d = new javax.swing.JButton();
        f = new javax.swing.JButton();
        g = new javax.swing.JButton();
        a = new javax.swing.JButton();
        h = new javax.swing.JButton();
        j = new javax.swing.JButton();
        k = new javax.swing.JButton();
        l = new javax.swing.JButton();
        z = new javax.swing.JButton();
        x = new javax.swing.JButton();
        c = new javax.swing.JButton();
        v = new javax.swing.JButton();
        b = new javax.swing.JButton();
        n = new javax.swing.JButton();
        m = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao10 = new javax.swing.JButton();
        botao11 = new javax.swing.JButton();
        botao12 = new javax.swing.JButton();
        botao13 = new javax.swing.JButton();
        botao14 = new javax.swing.JButton();
        botao15 = new javax.swing.JButton();
        botao16 = new javax.swing.JButton();
        botao17 = new javax.swing.JButton();
        botao18 = new javax.swing.JButton();
        botao19 = new javax.swing.JButton();
        botao20 = new javax.swing.JButton();
        botao21 = new javax.swing.JButton();
        botao22 = new javax.swing.JButton();
        botao23 = new javax.swing.JButton();
        botao24 = new javax.swing.JButton();
        botao25 = new javax.swing.JButton();
        botao26 = new javax.swing.JButton();
        botao27 = new javax.swing.JButton();
        botao28 = new javax.swing.JButton();
        botao29 = new javax.swing.JButton();
        botao30 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(699, 1000));

        botao1.setBackground(new java.awt.Color(153, 153, 153));
        botao1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao1.setForeground(new java.awt.Color(255, 255, 255));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        w.setBackground(new java.awt.Color(0, 0, 0));
        w.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        w.setForeground(new java.awt.Color(255, 255, 255));
        w.setText("W");
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });

        botao2.setBackground(new java.awt.Color(153, 153, 153));
        botao2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao2.setForeground(new java.awt.Color(255, 255, 255));
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setBackground(new java.awt.Color(153, 153, 153));
        botao3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao3.setForeground(new java.awt.Color(255, 255, 255));
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao4.setBackground(new java.awt.Color(153, 153, 153));
        botao4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao4.setForeground(new java.awt.Color(255, 255, 255));
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setBackground(new java.awt.Color(153, 153, 153));
        botao5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao5.setForeground(new java.awt.Color(255, 255, 255));
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        q.setBackground(new java.awt.Color(0, 0, 0));
        q.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        q.setForeground(new java.awt.Color(255, 255, 255));
        q.setText("Q");
        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });

        e.setBackground(new java.awt.Color(0, 0, 0));
        e.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        e.setForeground(new java.awt.Color(255, 255, 255));
        e.setText("E");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        r.setBackground(new java.awt.Color(0, 0, 0));
        r.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        r.setForeground(new java.awt.Color(255, 255, 255));
        r.setText("R");
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });

        t.setBackground(new java.awt.Color(0, 0, 0));
        t.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setText("T");
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        y.setBackground(new java.awt.Color(0, 0, 0));
        y.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        y.setForeground(new java.awt.Color(255, 255, 255));
        y.setText("Y");
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });

        u.setBackground(new java.awt.Color(0, 0, 0));
        u.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        u.setForeground(new java.awt.Color(255, 255, 255));
        u.setText("U");
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });

        i.setBackground(new java.awt.Color(0, 0, 0));
        i.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        i.setForeground(new java.awt.Color(255, 255, 255));
        i.setText("I");
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        o.setBackground(new java.awt.Color(0, 0, 0));
        o.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        o.setForeground(new java.awt.Color(255, 255, 255));
        o.setText("O");
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });

        p.setBackground(new java.awt.Color(0, 0, 0));
        p.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setText("P");
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        s.setBackground(new java.awt.Color(0, 0, 0));
        s.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        s.setForeground(new java.awt.Color(255, 255, 255));
        s.setText("S");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        d.setBackground(new java.awt.Color(0, 0, 0));
        d.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setText("D");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        f.setBackground(new java.awt.Color(0, 0, 0));
        f.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        f.setForeground(new java.awt.Color(255, 255, 255));
        f.setText("F");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        g.setBackground(new java.awt.Color(0, 0, 0));
        g.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        g.setForeground(new java.awt.Color(255, 255, 255));
        g.setText("G");
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        a.setBackground(new java.awt.Color(0, 0, 0));
        a.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("A");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        h.setBackground(new java.awt.Color(0, 0, 0));
        h.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        h.setForeground(new java.awt.Color(255, 255, 255));
        h.setText("H");
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });

        j.setBackground(new java.awt.Color(0, 0, 0));
        j.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        j.setForeground(new java.awt.Color(255, 255, 255));
        j.setText("J");
        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });

        k.setBackground(new java.awt.Color(0, 0, 0));
        k.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        k.setForeground(new java.awt.Color(255, 255, 255));
        k.setText("K");
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });

        l.setBackground(new java.awt.Color(0, 0, 0));
        l.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l.setForeground(new java.awt.Color(255, 255, 255));
        l.setText("L");
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        z.setBackground(new java.awt.Color(0, 0, 0));
        z.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        z.setForeground(new java.awt.Color(255, 255, 255));
        z.setText("Z");
        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });

        x.setBackground(new java.awt.Color(0, 0, 0));
        x.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        x.setForeground(new java.awt.Color(255, 255, 255));
        x.setText("X");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        c.setBackground(new java.awt.Color(0, 0, 0));
        c.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        v.setBackground(new java.awt.Color(0, 0, 0));
        v.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        v.setForeground(new java.awt.Color(255, 255, 255));
        v.setText("V");
        v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vActionPerformed(evt);
            }
        });

        b.setBackground(new java.awt.Color(0, 0, 0));
        b.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setText("B");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        n.setBackground(new java.awt.Color(0, 0, 0));
        n.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        n.setForeground(new java.awt.Color(255, 255, 255));
        n.setText("N");
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        m.setBackground(new java.awt.Color(0, 0, 0));
        m.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        m.setForeground(new java.awt.Color(255, 255, 255));
        m.setText("M");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        botao6.setBackground(new java.awt.Color(153, 153, 153));
        botao6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao6.setForeground(new java.awt.Color(255, 255, 255));
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao7.setBackground(new java.awt.Color(153, 153, 153));
        botao7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao7.setForeground(new java.awt.Color(255, 255, 255));
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setBackground(new java.awt.Color(153, 153, 153));
        botao8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao8.setForeground(new java.awt.Color(255, 255, 255));
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao9.setBackground(new java.awt.Color(153, 153, 153));
        botao9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao9.setForeground(new java.awt.Color(255, 255, 255));
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botao10.setBackground(new java.awt.Color(153, 153, 153));
        botao10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao10.setForeground(new java.awt.Color(255, 255, 255));
        botao10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao10ActionPerformed(evt);
            }
        });

        botao11.setBackground(new java.awt.Color(153, 153, 153));
        botao11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao11.setForeground(new java.awt.Color(255, 255, 255));
        botao11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao11ActionPerformed(evt);
            }
        });

        botao12.setBackground(new java.awt.Color(153, 153, 153));
        botao12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao12.setForeground(new java.awt.Color(255, 255, 255));
        botao12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao12ActionPerformed(evt);
            }
        });

        botao13.setBackground(new java.awt.Color(153, 153, 153));
        botao13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao13.setForeground(new java.awt.Color(255, 255, 255));
        botao13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao13ActionPerformed(evt);
            }
        });

        botao14.setBackground(new java.awt.Color(153, 153, 153));
        botao14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao14.setForeground(new java.awt.Color(255, 255, 255));
        botao14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao14ActionPerformed(evt);
            }
        });

        botao15.setBackground(new java.awt.Color(153, 153, 153));
        botao15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao15.setForeground(new java.awt.Color(255, 255, 255));
        botao15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao15ActionPerformed(evt);
            }
        });

        botao16.setBackground(new java.awt.Color(153, 153, 153));
        botao16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao16.setForeground(new java.awt.Color(255, 255, 255));
        botao16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao16ActionPerformed(evt);
            }
        });

        botao17.setBackground(new java.awt.Color(153, 153, 153));
        botao17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao17.setForeground(new java.awt.Color(255, 255, 255));
        botao17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao17ActionPerformed(evt);
            }
        });

        botao18.setBackground(new java.awt.Color(153, 153, 153));
        botao18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao18.setForeground(new java.awt.Color(255, 255, 255));
        botao18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao18ActionPerformed(evt);
            }
        });

        botao19.setBackground(new java.awt.Color(153, 153, 153));
        botao19.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao19.setForeground(new java.awt.Color(255, 255, 255));
        botao19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao19ActionPerformed(evt);
            }
        });

        botao20.setBackground(new java.awt.Color(153, 153, 153));
        botao20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao20.setForeground(new java.awt.Color(255, 255, 255));
        botao20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao20ActionPerformed(evt);
            }
        });

        botao21.setBackground(new java.awt.Color(153, 153, 153));
        botao21.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao21.setForeground(new java.awt.Color(255, 255, 255));
        botao21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao21ActionPerformed(evt);
            }
        });

        botao22.setBackground(new java.awt.Color(153, 153, 153));
        botao22.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao22.setForeground(new java.awt.Color(255, 255, 255));
        botao22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao22ActionPerformed(evt);
            }
        });

        botao23.setBackground(new java.awt.Color(153, 153, 153));
        botao23.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao23.setForeground(new java.awt.Color(255, 255, 255));
        botao23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao23ActionPerformed(evt);
            }
        });

        botao24.setBackground(new java.awt.Color(153, 153, 153));
        botao24.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao24.setForeground(new java.awt.Color(255, 255, 255));
        botao24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao24ActionPerformed(evt);
            }
        });

        botao25.setBackground(new java.awt.Color(153, 153, 153));
        botao25.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao25.setForeground(new java.awt.Color(255, 255, 255));
        botao25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao25ActionPerformed(evt);
            }
        });

        botao26.setBackground(new java.awt.Color(153, 153, 153));
        botao26.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao26.setForeground(new java.awt.Color(255, 255, 255));
        botao26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao26ActionPerformed(evt);
            }
        });

        botao27.setBackground(new java.awt.Color(153, 153, 153));
        botao27.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao27.setForeground(new java.awt.Color(255, 255, 255));
        botao27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao27ActionPerformed(evt);
            }
        });

        botao28.setBackground(new java.awt.Color(153, 153, 153));
        botao28.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao28.setForeground(new java.awt.Color(255, 255, 255));
        botao28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao28ActionPerformed(evt);
            }
        });

        botao29.setBackground(new java.awt.Color(153, 153, 153));
        botao29.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao29.setForeground(new java.awt.Color(255, 255, 255));
        botao29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao29ActionPerformed(evt);
            }
        });

        botao30.setBackground(new java.awt.Color(153, 153, 153));
        botao30.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        botao30.setForeground(new java.awt.Color(255, 255, 255));
        botao30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao30ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton4.setText(">");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton5.setText(">");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton6.setText(">");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton8.setText(">");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setText("Find Word");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botao21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(botao26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botao30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botao11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botao16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botao3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao26, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao27, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(q.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(q.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(q.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(q.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(q.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(q.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(q.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(q.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(q.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(q.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(q.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(q.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(q.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(q.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(q.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(q.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(q.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(q.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(q.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(q.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(q.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(q.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(q.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(q.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(q.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(q.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(q.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(q.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(q.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(q.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_qActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
        bloco1Selecionado = true;
    }//GEN-LAST:event_botao1ActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(w.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(w.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(w.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(w.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(w.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(w.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(w.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(w.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(w.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(w.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(w.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(w.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(w.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(w.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(w.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(w.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(w.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(w.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(w.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(w.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(w.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(w.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(w.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(w.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(w.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(w.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(w.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(w.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(w.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(w.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_wActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(e.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(e.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(e.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(e.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(e.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(e.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(e.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(e.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(e.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(e.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(e.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(e.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(e.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(e.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(e.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(e.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(e.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(e.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(e.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(e.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(e.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(e.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(e.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(e.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(e.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(e.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(e.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(e.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(e.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(e.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_eActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(r.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(r.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(r.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(r.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(r.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(r.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(r.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(r.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(r.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(r.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(r.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(r.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(r.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(r.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(r.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(r.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(r.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(r.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(r.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(r.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(r.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(r.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(r.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(r.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(r.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(r.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(r.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(r.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(r.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(r.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_rActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(t.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(t.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(t.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(t.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(t.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(t.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(t.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(t.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(t.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(t.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(t.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(t.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(t.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(t.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(t.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(t.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(t.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(t.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(t.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(t.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(t.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(t.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(t.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(t.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(t.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(t.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(t.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(t.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(t.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(t.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_tActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        // TODO add your handling code here:
        bloco2Selecionado = true;
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        // TODO add your handling code here:
        bloco3Selecionado = true;
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        // TODO add your handling code here:
        bloco4Selecionado = true;
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        // TODO add your handling code here:
        bloco5Selecionado = true;
    }//GEN-LAST:event_botao5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        verificaTentativa1(this.palavraSecreta);
        //verificaTentativa1(palavraSecreta);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(y.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(y.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(y.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(y.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(y.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(y.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(y.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(y.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(y.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(y.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(y.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(y.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(y.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(y.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(y.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(y.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(y.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(y.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(y.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(y.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(y.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(y.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(y.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(y.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(y.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(y.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(y.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(y.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(y.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(y.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_yActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(u.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(u.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(u.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(u.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(u.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(u.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(u.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(u.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(u.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(u.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(u.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(u.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(u.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(u.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(u.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(u.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(u.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(u.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(u.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(u.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(u.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(u.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(u.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(u.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(u.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(u.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(u.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(u.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(u.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(u.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_uActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(i.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(i.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(i.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(i.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(i.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(i.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(i.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(i.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(i.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(i.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(i.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(i.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(i.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(i.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(i.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(i.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(i.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(i.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(i.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(i.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(i.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(i.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(i.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(i.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(i.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(i.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(i.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(i.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(i.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(i.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_iActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(o.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(o.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(o.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(o.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(o.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(o.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(o.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(o.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(o.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(o.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(o.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(o.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(o.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(o.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(o.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(o.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(o.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(o.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(o.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(o.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(o.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(o.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(o.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(o.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(o.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(o.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(o.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(o.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(o.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(o.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_oActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(p.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(p.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(p.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(p.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(p.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(p.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(p.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(p.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(p.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(p.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(p.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(p.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(p.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(p.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(p.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(p.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(p.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(p.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(p.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(p.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(p.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(p.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(p.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(p.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(p.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(p.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(p.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(p.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(p.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(p.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_pActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(s.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(s.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(s.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(s.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(s.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(s.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(s.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(s.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(s.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(s.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(s.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(s.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(s.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(s.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(s.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(s.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(s.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(s.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(s.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(s.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(s.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(s.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(s.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(s.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(s.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(s.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(s.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(s.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(s.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(s.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_sActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(d.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(d.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(d.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(d.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(d.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(d.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(d.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(d.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(d.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(d.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(d.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(d.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(d.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(d.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(d.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(d.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(d.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(d.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(d.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(d.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(d.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(d.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(d.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(d.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(d.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(d.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(d.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(d.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(d.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(d.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_dActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(f.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(f.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(f.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(f.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(f.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(f.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(f.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(f.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(f.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(f.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(f.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(f.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(f.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(f.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(f.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(f.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(f.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(f.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(f.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(f.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(f.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(f.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(f.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(f.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(f.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(f.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(f.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(f.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(f.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(f.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_fActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(g.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(g.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(g.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(g.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(g.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(g.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(g.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(g.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(g.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(g.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(g.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(g.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(g.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(g.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(g.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(g.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(g.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(g.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(g.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(g.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(g.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(g.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(g.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(g.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(g.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(g.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(g.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(g.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(g.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(g.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_gActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(a.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(a.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(a.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(a.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(a.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(a.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(a.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(a.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(a.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(a.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(a.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(a.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(a.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(a.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(a.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(a.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(a.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(a.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(a.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(a.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(a.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(a.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(a.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(a.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(a.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(a.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(a.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(a.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(a.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(a.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_aActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(h.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(h.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(h.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(h.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(h.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(h.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(h.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(h.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(h.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(h.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(h.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(h.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(h.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(h.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(h.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(h.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(h.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(h.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(h.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(h.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(h.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(h.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(h.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(h.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(h.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(h.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(h.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(h.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(h.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(h.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_hActionPerformed

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(j.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(j.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(j.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(j.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(j.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(j.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(j.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(j.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(j.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(j.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(j.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(j.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(j.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(j.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(j.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(j.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(j.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(j.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(j.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(j.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(j.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(j.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(j.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(j.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(j.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(j.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(j.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(j.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(j.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(j.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_jActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(k.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(k.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(k.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(k.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(k.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(k.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(k.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(k.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(k.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(k.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(k.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(k.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(k.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(k.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(k.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(k.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(k.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(k.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(k.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(k.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(k.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(k.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(k.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(k.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(k.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(k.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(k.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(k.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(k.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(k.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_kActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(l.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(l.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(l.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(l.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(l.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(l.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(l.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(l.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(l.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(l.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(l.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(l.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(l.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(l.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(l.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(l.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(l.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(l.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(l.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(l.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(l.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(l.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(l.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(l.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(l.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(l.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(l.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(l.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(l.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(l.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_lActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(z.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(z.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(z.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(z.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(z.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(z.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(z.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(z.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(z.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(z.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(z.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(z.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(z.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(z.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(z.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(z.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(z.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(z.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(z.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(z.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(z.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(z.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(z.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(z.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(z.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(z.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(z.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(z.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(z.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(z.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_zActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(x.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(x.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(x.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(x.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(x.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(x.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(x.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(x.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(x.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(x.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(x.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(x.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(x.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(x.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(x.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(x.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(x.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(x.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(x.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(x.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(x.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(x.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(x.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(x.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(x.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(x.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(x.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(x.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(x.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(x.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_xActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(c.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(c.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(c.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(c.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(c.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(c.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(c.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(c.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(c.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(c.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(c.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(c.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(c.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(c.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(c.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(c.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(c.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(c.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(c.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(c.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(c.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(c.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(c.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(c.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(c.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(c.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(c.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(c.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(c.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(c.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_cActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(v.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(v.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(v.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(v.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(v.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(v.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(v.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(v.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(v.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(v.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(v.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(v.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(v.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(v.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(v.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(v.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(v.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(v.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(v.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(v.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(v.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(v.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(v.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(v.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(v.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(v.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(v.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(v.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(v.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(v.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_vActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(b.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(b.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(b.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(b.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(b.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(b.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(b.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(b.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(b.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(b.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(b.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(b.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(b.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(b.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(b.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(b.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(b.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(b.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(b.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(b.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(b.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(b.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(b.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(b.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(b.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(b.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(b.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(b.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(b.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(b.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_bActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(n.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(n.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(n.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(n.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(n.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(n.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(n.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(n.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(n.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(n.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(n.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(n.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(n.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(n.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(n.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(n.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(n.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(n.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(n.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(n.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(n.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(n.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(n.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(n.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(n.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(n.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(n.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(n.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(n.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(n.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_nActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
        if (bloco1Selecionado == true) {
            botao1.setText(m.getText());
            bloco1Selecionado = false;
        }
        if (bloco2Selecionado == true) {
            botao2.setText(m.getText());
            bloco2Selecionado = false;
        }
        if (bloco3Selecionado == true) {
            botao3.setText(m.getText());
            bloco3Selecionado = false;
        }
        if (bloco4Selecionado == true) {
            botao4.setText(m.getText());
            bloco4Selecionado = false;
        }
        if (bloco5Selecionado == true) {
            botao5.setText(m.getText());
            bloco5Selecionado = false;
        }
        if (bloco6Selecionado == true) {
            botao6.setText(m.getText());
            bloco6Selecionado = false;
        }
        if (bloco7Selecionado == true) {
            botao7.setText(m.getText());
            bloco7Selecionado = false;
        }
        if (bloco8Selecionado == true) {
            botao8.setText(m.getText());
            bloco8Selecionado = false;
        }
        if (bloco9Selecionado == true) {
            botao9.setText(m.getText());
            bloco9Selecionado = false;
        }
        if (bloco10Selecionado == true) {
            botao10.setText(m.getText());
            bloco10Selecionado = false;
        }
        if (bloco11Selecionado == true) {
            botao11.setText(m.getText());
            bloco11Selecionado = false;
        }
        if (bloco12Selecionado == true) {
            botao12.setText(m.getText());
            bloco12Selecionado = false;
        }
        if (bloco13Selecionado == true) {
            botao13.setText(m.getText());
            bloco13Selecionado = false;
        }
        if (bloco14Selecionado == true) {
            botao14.setText(m.getText());
            bloco14Selecionado = false;
        }
        if (bloco15Selecionado == true) {
            botao15.setText(m.getText());
            bloco15Selecionado = false;
        }
        if (bloco16Selecionado == true) {
            botao16.setText(m.getText());
            bloco16Selecionado = false;
        }
        if (bloco17Selecionado == true) {
            botao17.setText(m.getText());
            bloco17Selecionado = false;
        }
        if (bloco18Selecionado == true) {
            botao18.setText(m.getText());
            bloco18Selecionado = false;
        }
        if (bloco19Selecionado == true) {
            botao19.setText(m.getText());
            bloco19Selecionado = false;
        }
        if (bloco20Selecionado == true) {
            botao20.setText(m.getText());
            bloco20Selecionado = false;
        }
        if (bloco21Selecionado == true) {
            botao21.setText(m.getText());
            bloco21Selecionado = false;
        }
        if (bloco22Selecionado == true) {
            botao22.setText(m.getText());
            bloco22Selecionado = false;
        }
        if (bloco23Selecionado == true) {
            botao23.setText(m.getText());
            bloco23Selecionado = false;
        }
        if (bloco24Selecionado == true) {
            botao24.setText(m.getText());
            bloco24Selecionado = false;
        }
        if (bloco25Selecionado == true) {
            botao25.setText(m.getText());
            bloco25Selecionado = false;
        }
        if (bloco26Selecionado == true) {
            botao26.setText(m.getText());
            bloco26Selecionado = false;
        }
        if (bloco27Selecionado == true) {
            botao27.setText(m.getText());
            bloco27Selecionado = false;
        }
        if (bloco28Selecionado == true) {
            botao28.setText(m.getText());
            bloco28Selecionado = false;
        }
        if (bloco29Selecionado == true) {
            botao29.setText(m.getText());
            bloco29Selecionado = false;
        }
        if (bloco30Selecionado == true) {
            botao30.setText(m.getText());
            bloco30Selecionado = false;
        }
    }//GEN-LAST:event_mActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        // TODO add your handling code here:
        bloco6Selecionado = true;
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        // TODO add your handling code here:
        bloco7Selecionado = true;
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        // TODO add your handling code here:
        bloco8Selecionado = true;
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        // TODO add your handling code here:
        bloco9Selecionado = true;
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao10ActionPerformed
        // TODO add your handling code here:
        bloco10Selecionado = true;
    }//GEN-LAST:event_botao10ActionPerformed

    private void botao11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao11ActionPerformed
        // TODO add your handling code here:
        bloco11Selecionado = true;
    }//GEN-LAST:event_botao11ActionPerformed

    private void botao12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao12ActionPerformed
        // TODO add your handling code here:
        bloco12Selecionado = true;
    }//GEN-LAST:event_botao12ActionPerformed

    private void botao13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao13ActionPerformed
        // TODO add your handling code here:
        bloco13Selecionado = true;
    }//GEN-LAST:event_botao13ActionPerformed

    private void botao14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao14ActionPerformed
        // TODO add your handling code here:
        bloco14Selecionado = true;
    }//GEN-LAST:event_botao14ActionPerformed

    private void botao15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao15ActionPerformed
        // TODO add your handling code here:
        bloco15Selecionado = true;
    }//GEN-LAST:event_botao15ActionPerformed

    private void botao16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao16ActionPerformed
        // TODO add your handling code here:
        bloco16Selecionado = true;
    }//GEN-LAST:event_botao16ActionPerformed

    private void botao17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao17ActionPerformed
        // TODO add your handling code here:
        bloco17Selecionado = true;
    }//GEN-LAST:event_botao17ActionPerformed

    private void botao18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao18ActionPerformed
        // TODO add your handling code here:
        bloco18Selecionado = true;
    }//GEN-LAST:event_botao18ActionPerformed

    private void botao19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao19ActionPerformed
        // TODO add your handling code here:
        bloco19Selecionado = true;
    }//GEN-LAST:event_botao19ActionPerformed

    private void botao20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao20ActionPerformed
        // TODO add your handling code here:
        bloco20Selecionado = true;
    }//GEN-LAST:event_botao20ActionPerformed

    private void botao21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao21ActionPerformed
        // TODO add your handling code here:
        bloco21Selecionado = true;
    }//GEN-LAST:event_botao21ActionPerformed

    private void botao22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao22ActionPerformed
        // TODO add your handling code here:
        bloco22Selecionado = true;
    }//GEN-LAST:event_botao22ActionPerformed

    private void botao23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao23ActionPerformed
        // TODO add your handling code here:
        bloco23Selecionado = true;
    }//GEN-LAST:event_botao23ActionPerformed

    private void botao24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao24ActionPerformed
        // TODO add your handling code here:
        bloco24Selecionado = true;
    }//GEN-LAST:event_botao24ActionPerformed

    private void botao25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao25ActionPerformed
        // TODO add your handling code here:
        bloco25Selecionado = true;
    }//GEN-LAST:event_botao25ActionPerformed

    private void botao26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao26ActionPerformed
        // TODO add your handling code here:
        bloco26Selecionado = true;
    }//GEN-LAST:event_botao26ActionPerformed

    private void botao27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao27ActionPerformed
        // TODO add your handling code here:
        bloco27Selecionado = true;
    }//GEN-LAST:event_botao27ActionPerformed

    private void botao28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao28ActionPerformed
        // TODO add your handling code here:
        bloco28Selecionado = true;
    }//GEN-LAST:event_botao28ActionPerformed

    private void botao29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao29ActionPerformed
        // TODO add your handling code here:
        bloco29Selecionado = true;
    }//GEN-LAST:event_botao29ActionPerformed

    private void botao30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao30ActionPerformed
        // TODO add your handling code here:
        bloco30Selecionado = true;
    }//GEN-LAST:event_botao30ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        verificaTentativa2(this.palavraSecreta);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        verificaTentativa3(this.palavraSecreta);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        verificaTentativa4(this.palavraSecreta);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        verificaTentativa5(this.palavraSecreta);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        verificaTentativa6(this.palavraSecreta);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao10;
    private javax.swing.JButton botao11;
    private javax.swing.JButton botao12;
    private javax.swing.JButton botao13;
    private javax.swing.JButton botao14;
    private javax.swing.JButton botao15;
    private javax.swing.JButton botao16;
    private javax.swing.JButton botao17;
    private javax.swing.JButton botao18;
    private javax.swing.JButton botao19;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao20;
    private javax.swing.JButton botao21;
    private javax.swing.JButton botao22;
    private javax.swing.JButton botao23;
    private javax.swing.JButton botao24;
    private javax.swing.JButton botao25;
    private javax.swing.JButton botao26;
    private javax.swing.JButton botao27;
    private javax.swing.JButton botao28;
    private javax.swing.JButton botao29;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao30;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton c;
    private javax.swing.JButton d;
    private javax.swing.JButton e;
    private javax.swing.JButton f;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JButton i;
    private javax.swing.JButton j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton k;
    private javax.swing.JButton l;
    private javax.swing.JButton m;
    private javax.swing.JButton n;
    private javax.swing.JButton o;
    private javax.swing.JButton p;
    private javax.swing.JButton q;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JButton t;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JButton w;
    private javax.swing.JButton x;
    private javax.swing.JButton y;
    private javax.swing.JButton z;
    // End of variables declaration//GEN-END:variables
}
