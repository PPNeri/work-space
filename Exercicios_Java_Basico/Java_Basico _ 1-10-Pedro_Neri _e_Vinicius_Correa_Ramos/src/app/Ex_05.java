package app;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) throws Exception {
        //Declaração das variáveis
        double hp,lp,ha,la,areaParede,areaAzulejo,total;
        //Instacia de um objeto tipo Scanner para armazenar dados das variaveis
        Scanner scanner=new Scanner(System.in);
        //imprime na tela do usuario
        System.out.println("altura da parede em metros:");
        //armazena variavel
        hp= scanner.nextDouble();
        System.out.println("largura da parede em metros:");
        lp= scanner.nextDouble();
        System.out.println("altura do azulejo em metros:");
        ha= scanner.nextDouble();
        System.out.println("largura do azulejo em metros:");
        la= scanner.nextDouble();
        //calculo area parede
        areaParede= hp*lp;
        //area azulejo
        areaAzulejo=ha*la;
        //calculo total de azulejos
        total=areaParede/areaAzulejo;
        System.out.println("Quantidade de azulejos: "+String.format("%.2f", total));
        //fecha a instancia do objeto Scanner
        scanner.close();
        

        
    }
}