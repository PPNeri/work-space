package app;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite numero 1");
        int p =scanner.nextInt();
        System.out.println("Digite numero 2");
        int q =scanner.nextInt();
        int resultado =mdc(p,q);
        System.out.println("Resultado da operação: "+resultado);
        scanner.close();
    }




    public static int mdc(int p, int q)
{
   if ( q == 0 ){ 
       return p;
    }
   
   return mdc(q,p%q);
}





}