package Ex02;

public class Main {



    
    public static void main(String[] args) throws Exception {
        Contato contato1 = new Contato("Pedro",22439971);
        Agenda agenda=new Agenda("Ir na escola","13","Abril","1986");

        System.out.println(contato1.getNome());
        System.out.println(agenda.getTarefa());


    }
}