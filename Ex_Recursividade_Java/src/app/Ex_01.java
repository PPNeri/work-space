package app;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite um numero");
        int num =scanner.nextInt();
        int soma =somaAlgarismos(num);
        System.out.println("Soma dos algarismos: "+soma);
        scanner.close();
    }

    public static int somaAlgarismos(int num){
        //se a variavel num for igual a 10, significa que nós já somamos todos os algarismos
        if(num<10)
            return num;
        else
            return somaAlgarismos(num/10)+num %10;
    }





}