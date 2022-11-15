/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhooo;

/**
 *
 * @author Arthur
 */
public class Teclado {
    
      private char [] alfabetoqerty = new char[]{'q', 'w', 'e','r', 't', 'y','u',
          'i', 'o','p', 'a', 's','d', 'f', 'g','h', 'j', 'k','l', 'z', 'x','c',
          'v', 'b','n', 'm'};      
      
      private Letra[][] teclado = new Letra[3][10];

    public Teclado(){
        
        int count_letra = 0;       
          for(int i=0;i<3;i++){
             for(int j=0;j<10;j++){
                  if (count_letra >= alfabetoqerty.length || count_letra < 0) {
                    continue;
                 }
            
                  teclado[i][j] = new Letra();
                 teclado[i][j].setChar(alfabetoqerty[count_letra]);
                 teclado[i][j].setCor(3);
                  count_letra++;
                  
                 System.out.print(teclado[i][j].getChar());
                  System.out.print(teclado[i][j].getCor());
             }
              
          }
        
     }
     
}
