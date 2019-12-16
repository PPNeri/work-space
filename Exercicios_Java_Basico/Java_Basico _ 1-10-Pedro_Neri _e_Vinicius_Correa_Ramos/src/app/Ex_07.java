package app;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws Exception {
        //Instacia de um objeto tipo Scanner para armazenar dados das variaveis
        Scanner scanner=new Scanner(System.in);
        //Declaração das variáveis
        double R,V,A;
        //Declaração das variáveis do tipo constante para o valor de PI
        final double PI=3.14159;
        //imprime na tela do usuario
        System.out.println("Informe o raio em cm ");
//armazena variavel valor na variavel R
        R = scanner.nextDouble();
        
        System.out.println("Informe a altura da lata em cm ");
        A = scanner.nextDouble();
        //calculo do volume e Math função para calculo de potencia
        V=Math.pow(R, 2)*PI*A/1000;
        System.out.println("Volume " + String.format("%.2f", V)+ " litros");
        //fecha a instancia do objeto Scanner
        scanner.close();

    }
}