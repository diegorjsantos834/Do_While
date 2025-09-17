/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.do_e_while_atividade;

/**
 *
 * @author Koragem
 */
import java.util.Scanner;
public class Do_e_While_atividade {
    public static void main(String[] args) {
    //Do e While atividade

     Scanner scanner = new Scanner(System.in);

    //algoritmo 1,Exibir todos os numeros pares existentes entre 1 e 20.
    System.out.println("Mostrar números pares de 1 a 20");//mostrar oq o algoritmo faz

    int impares= 1; //numero que começa a contagem
    System.out.println("1"); //começa a contagem
    
    do {//vai fazer um laço para contar numeros impares
        impares +=2; //vai adiconar 2 a variavel num1
        System.out.println(impares);//mostra o resultado
          
   } while (impares <19);//caso num1 for menor que 19 continua a repetição, caso for maior para

   //algoritmo 2, Efetuar a tabuada do número informado.
   System.out.println("Digite um número!: ");//Pergunta o numero
    int num = scanner.nextInt();//gaurda o numero digitado

    int t=1;//declara a variavel "t", vai ser o numero que vai mutiplicar a variavel "num"  

    while ( t <10){ // cria um loop onde "t" precisa ser <10 para ser verdaeiro e funcionar, caso a condição for atendida o laço se repetira.
        t++;//adicona 1 na variavel "t" até chegar 10 
        System.out.println(num + " X " + t + " = " + (num *t));
        
    }

    //algoritmo 3,Exibir a quantidade de números existentes entre 100 a 125.
    System.out.println("quantidade de números existentes entre 100 a 125.");//mostra oq o algoritmo vai fazer

    int cem = 100; //variavel para o numero 100
    int fim = 125; //varivaael para o numero 125
    int quantidade = 0; //variavel para mostrar a quantidade de numero existente

    int c = cem; //variavel feita para fazer o 100 chegar em 125
    while (c <= fim) { //repetição para fazer o 100 chegar em 125
        quantidade++;//adiciona 1 toda vez que o laço se repete, isso vai contar o numero de vezes que o laço se repetiu consequentemente a quantidade de numeros existentes
        c++; //adiciona 1 para o 100 chegar a 125, controla para o loop parar quando o numero chegar ao valor desejado
    }

    System.out.println("Quantidade de números entre 100 a 125 é: " + quantidade);//mostra o resultado
    
    //algoritmo 4, Através de um valor inicial e final, apresente a soma dos números impares entre os numeros informados.

    System.out.println("digite o 1 número: ");//pergunta o primeiro número
    int num1 = scanner.nextInt();//guarda o valor do primeiro número

    System.out.println("digite o 2 número: ");//pergunta o segundo número
    int num2 = scanner.nextInt();//guarda o valor do segundo número

    int soma = 0;// variavel feita para armazenar o total da soma dos numeros impares

    int controle = num1;// Variável de controle do loop, começa no valor inicial e vai até o valor final

    do {
    if (controle % 2 != 0) {   // verifica se i é ímpar
        soma += controle;      // soma = soma + i
    }
    controle++;//para passar para o próximo número no intervalo.
    } while (controle <= num2);//loop que o controle precisa ser menor ou igual a num2 para o loop parar

    System.out.println("Soma dos números ímpares entre " + num1 + " e " + num2 + " = " + soma);// mostra o resultado


    }
}
