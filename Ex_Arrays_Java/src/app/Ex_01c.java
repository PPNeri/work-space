package app;


public class Ex_01c {
    public static void main(String[] args) throws Exception {
        
        final int  N=11;
        int n=0;
        
        int []elem=new int [N];

        for (int i=1;i<elem.length;i++){
            //int num=elem[i];
            if (i<=5){
                elem[i]+=i;
                System.out.printf("%d ",elem[i]);
            }else{
            
                n+=2;
                elem[i]+=5*n;
                System.out.printf("%d ",elem[i]);
                
            }

        
            


        }
        }

}