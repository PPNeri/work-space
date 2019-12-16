package app;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) throws Exception {
        //Declaração das variáveis
        Double comprimento,altura,area,perimetro;
        //Instacia de um objeto tipo Scanner para armazenar dados das variaveis
        Scanner scanner=new Scanner(System.in);
        //imprime na tela do usuario
        System.out.println("Digite comprimento do retangulo ");
        //Armazena variavel
        comprimento = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo ");
        altura = scanner.nextDouble();
        //Calculo da area
        area=comprimento*altura;
        //Calculo do perimetro
        perimetro=2*(altura+comprimento);
        System.out.println("area do retamgulo: "+ area);
        System.out.println("perimetro do retangulo: "+ perimetro);
        //fecha a instancia do objeto Scanner
        scanner.close();
    }
}