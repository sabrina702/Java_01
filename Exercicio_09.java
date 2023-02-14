/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Exercicio_09 {
    public static void main(String[] args) {
        double Atotal,Acont,Asem=0,total=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a área total e a área contruída do Terreno em m²: ");
        Atotal = entrada.nextDouble();
        Acont = entrada.nextDouble();
        Asem = Atotal-Acont;
        total = (Asem*3.80)+(Acont*5.0);
        System.out.println("Total a ser pago: "+total);
        
    }
    
}
