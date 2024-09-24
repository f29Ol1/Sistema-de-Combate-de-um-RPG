/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpggame;

/**
 *
 * @author CESUPAARGO
 */
public class Criacão {
    
    
    public static void main(String[] args) {
        
        
       Inimigo inimigo1 = new Inimigo();
       inimigo1.nome = "Abel";
       inimigo1.arma = "espada torta";
       inimigo1.pocao = "vida extra";
       inimigo1.vida = 100;
       
        inimigo1.Descricoes_vilao();
        inimigo1.vida();
       
       
       Inimigo inimigo2 = new Inimigo();
       inimigo2.nome = "tundra";
       inimigo2.arma = "adaga sangrenta";
       inimigo2.pocao = "escudo";
       inimigo2.vida = 80;
       
        inimigo2.Descricoes_vilao();
        inimigo2.vida();
       
       
       System.out.print("\n");
       
       Inimigo inimigo3 = new Inimigo();
       inimigo3.nome = "Hudra";
       inimigo3.arma = "Lança Rustica";
       inimigo3.pocao = "Raio";
       inimigo3.vida = 80;
       
        inimigo3.Descricoes_vilao();
        inimigo3.vida();
       
        
        System.out.print("\n");
       
       Inimigo inimigo4 = new Inimigo();
       inimigo4.nome = "Torjão";
       inimigo4.arma = "Espada Reborn";
       inimigo4.pocao = "vida";
       inimigo4.vida = 80;
       
        inimigo4.Descricoes_vilao();
        inimigo4.vida();
        
        System.out.print("\n");
       
       Inimigo inimigo5 = new Inimigo();
       inimigo5.nome = "Elfo Latino";
       inimigo5.arma = "Arco AK";
       inimigo5.pocao = "Raio";
       inimigo5.vida = 80;
       
        inimigo5.Descricoes_vilao();
        inimigo5.vida();
  

        
        
      Inimigo chefe = new Inimigo();
       chefe.nome = "Pata de Camelo";
       chefe.arma = "Espada divina";
       chefe.pocao = "Permeação";
       chefe.vida = 100;
       
        chefe.Descricoes_vilao();
        chefe.vida();
  
        
                
                
                
    }
    
    
    
}
