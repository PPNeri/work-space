package app;
import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) throws Exception {
        //Declaração das variáveis
        Double peso,altura,imc;
        //Instacia de um objeto tipo Scanner para armazenar dados das variaveis
        Scanner scanner=new Scanner(System.in);
        //imprime na tela do usuario
        System.out.println("Digite o seu peso ");
        //Armazena o valor do input do usuario na variável peso
        peso = scanner.nextDouble();
        System.out.println("Digite o sua altura ");
        altura = scanner.nextDouble();
        //Calculo do imc
        imc=peso/Math.pow(altura, 2);
        System.out.println("Seu indice IMC é: "+ imc);
        //fecha 
        scanner.close();
    }
}