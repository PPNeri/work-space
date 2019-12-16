package app;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) throws Exception {
        //Instacia de um objeto tipo Scanner para armazenar dados das variaveis
        Scanner scanner=new Scanner(System.in);
        //Declaração das variáveis
        double A,B,aux;
        //imprime na tela do usuario
        System.out.println("Informe valor de A ");
        //armazena o valor do input na variavel A
        A= scanner.nextDouble();
        System.out.println("Informe valor de B ");
        B= scanner.nextDouble();
        //Atribui o valor B para variabel aux 
        aux=B;
        //Atribui o valor A para variabel B
        B=A;
        //Atribui o valor aux para variabel A
        A=aux;
//Imprime na tela os valores trocados
        System.out.printf("A=%.2f \n", A);
        System.out.printf("B=%.2f \n",B);
        //fecha a instancia do objeto Scanner
        scanner.close();
    }
}