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
        
          
        JovemAprendiz jv1 = new JovemAprendiz ("A", "Felipe Silva", 2008, 2100076, "Quinta");
        jv1.detalhesJovem();
        JovemAprendiz jv2 = new JovemAprendiz("A", "gabriel", 2006, 21000777, "Quinta");
        jv2.detalhesJovem();
        JovemAprendiz jv3 = new JovemAprendiz("B", "Felipe Amorim", 2009, 21000778, "Terca");
        jv3.detalhesJovem();
        JovemAprendiz jv4 = new JovemAprendiz ("B", "Davi", 1999, 21000285, "Terca");
        jv4.detalhesJovem();

        
        Contagem c = new Contagem();
        c.setContagemDoTurno(jv1);
        c.setContagemDoTurno(jv2);
        c.setContagemDoTurno(jv3);
        c.setContagemDoTurno(jv4);
        
        System.out.println("Total de Jovens do Turno A: "+c.getContagemA());
        System.out.println("Total de Jovens do Turno B: "+c.getContagemB());
        /*
        System.out.println("Total de Jovem Aprendiz turno A: "+JovemAprendiz.getContagemA());
        System.out.println("Total de Jovem Aprendiz turno B: "+JovemAprendiz.getContagemB());
*/
    }
}
