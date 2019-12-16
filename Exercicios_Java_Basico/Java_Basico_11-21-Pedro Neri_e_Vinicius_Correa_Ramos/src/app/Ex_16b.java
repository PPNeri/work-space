package app;



public class Ex_16b {
    public static void main(String[] args) throws Exception {
       int i=10;
       int num=200;
        System.out.printf("Os valores pares de %d ate %d \n",i,num);
        for ( i=10; i <= num; i++){
            //Verifica numeros pares.
           if (i % 2==0) {
              System.out.printf(i + " é par \n");
           }
        }
}
}