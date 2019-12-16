package Ex03;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.time.LocalDateTime;

public class Main {
   
    public static void main(String[] args) throws Exception {
       
        


        Pessoa p1=new Pessoa("Pedro",11456131,"245214558");
        Pessoa p2=new Pessoa("Vinicius",114456131,"245214558");
        Livro l1= new Livro("titulo", "autor", "genero",1111111);
        Emprestimo emp1=new Emprestimo(LocalDate.of(2019,12,10),LocalDate.of(2019,12,9),p1.getCpf(),p1.getContato(),l1.getISBN());

              
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(emp1.toString());
        
        
        
    }

   
    
}