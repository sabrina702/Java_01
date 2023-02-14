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
public class Exercicio_07 {
    public static void main(String[] args) {
        double N1,N2,N3,N4;
        double media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe as quatro notas (de 0 á 10): ");
        N1 = entrada.nextDouble();
        N2 = entrada.nextDouble();
        N3 = entrada.nextDouble();
        N4 = entrada.nextDouble();
        media = N1+N2+N3+N4/4;
        if(media>=0 && media<=3.49){
            System.out.println("Reprovado!! \nnota:"+media);
    }
        else if(media>=3.5 && media<=6.49){
            System.out.println("Recuperação!! \nnota:"+media);
        }
        else{
            System.out.println("PARABÉNS, Aprovado:) \nnota:"+media);
        }

    }
}