package app;
import java.util.Scanner;
public class Ex_19 {
    public static void main(String[] args) throws Exception {

        
        Scanner scanner=new Scanner(System.in);

        
        int genero,age,totalHomens=0,totalMulheres=0;

for(int i=0;i<10;i++){

        System.out.printf(" %d-Digite seu genero 0-Masculino e 1-Feminino \n",i+1);
        genero = scanner.nextInt();
        System.out.println("Digite sua idade");
        age= scanner.nextInt();


        if (genero==0 && age>=18){
            totalHomens++;
        }else if (genero==1 && age>=18){
            
            totalMulheres++;
        }
    }
        


        System.out.printf("Existem %d Homens e %d Mulheres maiores de idade \n",totalHomens,totalMulheres);
        scanner.close();
    }
}