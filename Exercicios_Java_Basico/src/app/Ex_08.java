package app;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws Exception {
        //Instacia de um objeto tipo Scanner para armazenar dados das variaveis
        Scanner scanner=new Scanner(System.in);
        //Declaração das variáveis
        double F,C;
        //imprime na tela do usuario
        System.out.println("Informe a temperatura em Fahrenheit ");
        //armazena o valor do input na variavel F
        F= scanner.nextDouble();
        //calculo conversão
        C = (F-32) *5/9;
        System.out.println("Temperatura " + String.format("%.2f", C)+"º celcius");
        //fecha a instancia do objeto Scanner
        scanner.close();
    }
}