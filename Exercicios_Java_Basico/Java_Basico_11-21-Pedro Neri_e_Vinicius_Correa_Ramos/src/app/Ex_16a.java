package app;

import java.math.BigInteger;

public class Ex_16a {
    public static void main(String[] args) throws Exception {
       int i=10;
       int num=200;
        System.out.printf("Os valores primos de %d ate %d \n",i,num);
        for ( i=10; i <= num; i++){
            //funcao que verifica numeros primos do objeto BigInteger.
           if (new BigInteger(String.valueOf(i)).isProbablePrime(200)) {
              System.out.printf(i + " é primo \n");
           }
        }
}
}