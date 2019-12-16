package app;

import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("quantas linhas?\n");
        int linhas=scanner.nextInt();


        for(int i=1;i<=linhas;i++){
            for(int j=1;j<=i;j++){
                if(i<=9)System.out.printf("0");
                System.out.printf("%d",i);
            }
            
            System.out.printf("\n");

        }


        scanner.close();
    }
}
