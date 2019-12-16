package app;



public class Ex_01b {
    public static void main(String[] args) throws Exception {
        
        final int  N=11;
        
        int [] num=new int [N];
        for (int i=0;i<num.length;i++){

            num[i]+=Math.pow(i, 2);
            
            System.out.printf("%d ",num[i]);


        }
        }

}