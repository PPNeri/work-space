package app;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) throws Exception {
//Declaração das variáveis
        Double valorReal,valorDolar;
//Instacia de um objeto tipo Scanner para armazenar dados das variaveis 
        Scanner scanner=new Scanner(System.in);
//imprime na tela do usuario
        System.out.println("Digite o Valor em Dolar ");
//Armazena o valor do input do usuario na variável 
        valorDolar = scanner.nextDouble();
//Cálculo da conversão 
        valorReal=valorDolar *2.50;
//Imprimi a mensagem na tela
        System.out.println("Valor em real é "+ valorReal);
//fecha a instancia do objeto Scanner
        scanner.close();

    
    }
}