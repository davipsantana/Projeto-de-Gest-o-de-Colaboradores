/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meuProjeto;

import com.mycompany.Contagem.Contagem;
import com.mycompany.meuProjeto.JovemAprendiz.JovemAprendiz;

/**
 *
 * @author davip
 */
public class MeuProjeto {
        
    public static void main(String[] args) {
        
        Contagem c = new Contagem();
        JovemAprendiz jv1 = new JovemAprendiz ("A", "Felipe Silva", 2008, 2100076,"Quinta",c,c);
        jv1.detalhesJovem();
        JovemAprendiz jv2 = new JovemAprendiz("A", "gabriel", 2006, 21000777, "Quinta",c, c);
        jv2.detalhesJovem();
        JovemAprendiz jv3 = new JovemAprendiz("B", "Felipe Amorim", 2009, 21000778, "Terca",c, c);
        jv3.detalhesJovem();
        JovemAprendiz jv4 = new JovemAprendiz ("B", "Davi", 1999, 21000285, "Terca",c, c);
        jv4.detalhesJovem();
        
        c.DetalheContagem();

    }
}
