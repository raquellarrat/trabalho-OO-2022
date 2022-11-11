/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhooo;

/**
 *
 * @author NOTE
 */
public class Letra {
    private int cor;// 1 = verde; 2 = amarelo; 3 = cinza;
    public char caractere;
    
    public void setCor(int escolha){
        cor = escolha;
    }
    
    public int getCor(){
        return cor;
    }
    
    public void setChar(char c){
        caractere = c;
    }
    
    public char getChar(){
        return caractere;
    }
}
