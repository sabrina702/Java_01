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
public class Exercicio_12 {
    public static void main(String[] args) {
        double renda;
        double pagar;
         Scanner entrada = new Scanner(System.in);
         System.out.println("Informe sua renda: ");
         renda = entrada.nextDouble();
         if(renda<=10800.00){
             System.out.println("isento do pagamento!!");
         }
         else if(renda>10800.00 && renda<=21600.00){
             pagar = (renda*0.15)-1620.00;
             System.out.println("Valor de IRPF a pagar: "+pagar);
         }
         else if(renda>21600.01){
             pagar = (renda*0.275)-4320.00;
             System.out.println("Valor de IRPF a pagar: "+pagar);
         }
    }
    
}
