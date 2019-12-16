package app;

import java.util.Random;

public class Ex_17 {
    public static void main(String[] args) throws Exception {
        Random generator=new Random();

        for (int i=0;i<50;i++){
            System.out.println(generator.nextInt(101));

        }
    }
}