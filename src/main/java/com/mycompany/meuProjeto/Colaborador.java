/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.meuProjeto;

import java.time.LocalDate;
/**
 *
 * @author davip
 */
public class Colaborador {
    
    public int anoAtual = LocalDate.now().getYear();
    private String turno;
    private String nome;
    private int anoNascimento;
    private int codRH; 
    private int idade;
        
    public Colaborador (String turno, String nome, int anoNascimento, int codRH){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.codRH = codRH;
        this.idade = anoAtual - anoNascimento;
        this.turno = turno;
    }
    public String getTurno(){
        return this.turno;
    }
    public String getNome(){
        return this.nome;
    }
    public int getAnoNascimento(){
        return this.anoNascimento;
    }
    public int getCodRH(){
        return this.codRH;
    }
    public int getIdade(){
        return this.idade;
    }
    
}
