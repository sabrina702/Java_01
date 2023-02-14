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
public class Exercicio_11 {
    public static void main(String[] args) {
        double Qm,dias;
        double Vtotal=0,Vq=0,Vd=0;
         Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número de dias que ficou com o carro: ");
        dias= entrada.nextDouble();
        System.out.println("Informe os Quilometros rodados: ");
        Qm = entrada.nextDouble();
        Vq = (Qm-60)*0.50;
        Vd = dias*45.0;
        Vtotal = Vq+Vd;
        System.out.println("Valor a ser pago: "+Vtotal);
    }
    
}
