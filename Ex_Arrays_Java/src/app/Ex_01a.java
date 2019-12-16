package app;

public class Ex_01a {
    public static void main(String[] args) throws Exception {
        //Declaração de constante 
        final int N=11;
        //Declaração de array com tamanho da constante
        int[] array = new int[N];

              //Laço de repetição para imprimir cada elemento do  vetor de 1 a 10
        for (int i=10;i>0;i--){
            array[i]+=i;
            System.out.printf("%d ",array[i]);
            
            
        }
             
        
    }
}