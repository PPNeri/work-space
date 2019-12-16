package Ex10;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws Exception {


AssistAdmin assistAdmin= new AssistAdmin("pedroAdmin", 123);
Empregado tecnico=new Tecnico("pedroTech", 1234);
Empregado assisAdm=new AssistAdmin("pedroAdmin", 4321);
System.out.println(tecnico.toString());
System.out.println(assisAdm.toString());;

//----------------------------------------------------------------------------

Animal rex=new Cachorro("ViraLata");
Animal felix=new Gato("Siames");

rex.emitirSom();
felix.emitirSom();
System.out.println( rex.andar());;
System.out.println(felix.andar());

//-------------------------------------------------------------------------------





        
    }
    
}