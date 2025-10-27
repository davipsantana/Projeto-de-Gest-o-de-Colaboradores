/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Contagem;

import com.mycompany.meuProjeto.Colaborador;
import com.mycompany.meuProjeto.JovemAprendiz.JovemAprendiz;


public class Contagem {
    
    private static int contagemA = 0;
    private static int contagemB = 0;
    
    private static int cursoTerca = 0;
    private static int cursoQuinta = 0;
    
   
    public void setContagemDoTurno(Colaborador c){   
        if (c.getTurno() == "A"){
            this.contagemA +=1;
        }
        else {
            this.contagemB += 1;
        }
        
    }
    
    public void setDiasdeCurso(JovemAprendiz a){
        if (a.getDiasCurso() == "Terca"){
            this.cursoTerca +=1;
        }
        else {
            this.cursoQuinta +=1;
        }
    }
    public int getContagemA() {
        return this.contagemA;
        }
    public int getContagemB(){
        return this.contagemB;
    }
    
    public int getCursoTerca(){
        return this.cursoTerca;
    }
    public int getCursoQuinta (){
        return this.cursoQuinta;
    }
}
