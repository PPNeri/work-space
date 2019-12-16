package app;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite numero 1");
        int num =scanner.nextInt();
        inverte(num);
        scanner.close();
    }




    public static int inverte(int num)
{
   if (num<0){
       return num;
   }else{
       System.out.print(" "+ num);
    return inverte(num-1);
}
}





}