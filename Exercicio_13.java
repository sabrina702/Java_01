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
public class Exercicio_13 {
    public static void main(String[] args) {
        double pessoas, dias;
        double total;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número de pessoas da viagem: ");
        pessoas = entrada.nextDouble();
        System.out.println("Quantos dias: ");
        dias = entrada.nextDouble();
        if(pessoas>=1 && pessoas<=4){
            total = (pessoas*160.00)*dias;
            System.out.println("Valor Total da viagem: "+total);
    }
        else if(pessoas>=5 && pessoas<=8){
            total = (pessoas*120.00)*dias;
            System.out.println("Valor Total da viagem: "+total);
        }
        else if(pessoas>8){
            total = (pessoas*80.00)*dias;
            System.out.println("Valor Total da viagem: "+total);
        }

    }
}
