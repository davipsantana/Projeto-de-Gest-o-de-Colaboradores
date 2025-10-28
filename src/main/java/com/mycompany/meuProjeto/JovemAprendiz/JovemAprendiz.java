/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meuProjeto.JovemAprendiz;

import com.mycompany.Contagem.Contagem;
import com.mycompany.meuProjeto.Colaborador;

/**
 *
 * @author davip
 */
public class JovemAprendiz extends Colaborador {
     private String diasCurso;
     
    public JovemAprendiz(String turno, String nome, int anoNascimento, int codRH, String diasCurso, Contagem contagemTurno, Contagem contagemDias) {
        super(turno, nome, anoNascimento, codRH, contagemTurno ); 
        this.diasCurso = diasCurso;
        contagemDias.setDiasdeCurso(this);
    }

    public String getDiasCurso(){
       return this.diasCurso;
    }
    public void detalhesJovem(){
   
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano Nasciemnto: " + this.getAnoNascimento());
        System.out.println("Turno: " + this.getTurno());
        System.out.println("idade: "+this.getIdade());
        System.out.println("Dias de curso: "+this.getDiasCurso());
        System.out.println("------------------------------");
    }
    
}
