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
public class Exercicio_06 {
    public static void main(String[] args) {
        double L;
        double C ;
        double area=0;
        double perimetro=0;
       Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a largura e comprimento para calculo: ");
        L = entrada.nextDouble();
        C = entrada.nextDouble();
        area = C*L;
        perimetro = (2*C)+(2*L);
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
        
    }
    
}
