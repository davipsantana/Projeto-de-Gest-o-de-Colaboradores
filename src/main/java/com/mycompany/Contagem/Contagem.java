/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Contagem;

import com.mycompany.meuProjeto.Colaborador;

/**
 *
 * @author davip
 */
public class Contagem {
    
    private static int contagemA = 0;
    private static int contagemB = 0;
    
   
    public void setContagemDoTurno(Colaborador c){   
        if (c.getTurno() == "A"){
            this.contagemA +=1;
        }
        else {
            this.contagemB += 1;
        }
    }
    public int getContagemA() {
        return this.contagemA;
        }
    public int getContagemB(){
        return this.contagemB;
    }
}
