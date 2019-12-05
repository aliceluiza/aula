/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Visitante7
 */
public class Aula {
    class Licao {
        
    }
    
    public static void main(String[] args) {
        int numero = 0;
        List<Integer> lista = new ArrayList<>();
        lista.add(numero);
        if(numero < 5) {
            System.out.println("menor que 5");
        } else { 
            System.out.println("maior que 5");
        }
        while (numero < 5) {
            numero++;
        }
        
        Exemplo ex = new Exemplo(30, 60);
        System.out.println(lista + " " + numero + "\n" + ex);   
    }
    
    
}
