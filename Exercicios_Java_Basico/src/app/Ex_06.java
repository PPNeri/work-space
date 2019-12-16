package app;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) throws Exception {
//Instacia de um objeto tipo Scanner para armazenar dados das variaveis
        Scanner scanner=new Scanner(System.in);
        //Declaração das variáveis
        double areaTotal,areaConstruida,total;
        //imprime na tela do usuario
        System.out.println("Digite a área total do terreno em metros quadrados");
        //armazena variavesi
        areaTotal= scanner.nextDouble();
        System.out.println("Digite a area Construida em metros quadrados");
        areaConstruida= scanner.nextDouble();
        //Calculo imposto
        total=(areaTotal-areaConstruida)*3.8+5*(areaConstruida);
        System.out.println("Total"+String.format("%.2f",total));
        //fecha a instancia do objeto Scanner
        scanner.close();
    }
}