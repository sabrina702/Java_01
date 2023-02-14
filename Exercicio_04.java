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
public class Exercicio_04 {
    public static void main(String[] args) {
        double dolar;
        double converte;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Valor em dolar: ");
        dolar = entrada.nextDouble();
        converte = dolar * 5.10;
        System.out.println("Valor em Real: "+converte);
        
    }
    
}
