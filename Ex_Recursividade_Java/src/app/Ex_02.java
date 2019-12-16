package app;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a base");
        int base =scanner.nextInt();
        System.out.println("Digite o expoente");
        int expoente =scanner.nextInt();
        int resultado =pot(base,expoente);
        System.out.println("Resultado da operação: "+resultado);
        scanner.close();
    }


    public static int pot(int base, int exp){

            if (exp==0){

            return 1;

            }else{

            return (base*pot(base, exp-1));
        }
            }





}