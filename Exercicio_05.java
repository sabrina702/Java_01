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
public class Exercicio_05 {
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;
        int sexo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu sexo: (Mulher-1 ou Homen-2)");
        sexo = entrada.nextInt();
        if(sexo==1){
            System.out.println("Informe seu peso:");
            peso = entrada.nextDouble();
            System.out.println("Informe sua Altura:");
            altura = entrada.nextDouble();
            imc = peso/(altura*altura);
            if(imc<19.1){
                System.out.println("Abaixo do peso");
            }
            else if(imc>=19.1 && imc<=25.8){
                System.out.println("Peso ideal");
            }
            else{
                System.out.println("Obeso");
            }
    
        }
            else if(sexo==2){
                System.out.println("Informe seu peso:");
                peso = entrada.nextDouble();
                System.out.println("Informe sua Altura:");
                altura = entrada.nextDouble();
                imc = peso/(altura*altura);
                if(imc<20.7){
                    System.out.println("Abaixo do peso");
                }
                else if(imc>=20.7 && imc<=26.4){
                    System.out.println("Peso ideal");
                }
                else{
                    System.out.println("Obeso");
                }



    }
        }
    }