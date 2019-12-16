package app;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        
        final int N=10;
        double[] d=new double[N];
 
        for (double elementos:d){
            System.out.println("Digite o valor do elemento");
            elementos=scanner.nextDouble();
            System.out.print(elementos);
        }
        scanner.close();
        }

}