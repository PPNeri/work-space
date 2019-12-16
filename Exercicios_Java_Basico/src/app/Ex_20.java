package app;
public class Ex_20 {
    public static void main(String[] args) throws Exception {
/*
Fibonacci(0) = 0
Fibonacci(1) = 1
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
*/
        
        System.out.println("Fibonacci sequencia");


        final int n=50;
  //tipo long pois numeros são grandes demais para serem representados, caso tipo integer até o 46º termo consegue ser representado, no 47º  o numero fica negativo.
        long F=0,anterior=0;
        
        for (int i=1;i<=n;i++){
            if(i==1){
                F=1;
                anterior=0;
            }else{
                F+=anterior;
                anterior=F-anterior;
            }
            
            
            System.out.printf(" %d, " ,F);
        }
        


    
    }
}