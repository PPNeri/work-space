package app;



public class Ex_06 {
    public static void main(String[] args) throws Exception {
       
        int array[] = {1, 2, 3, 4, 5,10,45};

        for (int elementos:array){
            System.out.print(" "+elementos);
        }
        System.out.println();
        System.out.println("Soma dos elementos do array "+somarElementos(array, array.length));
        
    }
   
        public static int somarElementos(int array[], int tamArray) {
            if (tamArray > 0) {
                int soma = somarElementos(array, tamArray - 1)+array[tamArray - 1];
                return soma;
            } else {
                return 0;
            }
        }
    

    





}