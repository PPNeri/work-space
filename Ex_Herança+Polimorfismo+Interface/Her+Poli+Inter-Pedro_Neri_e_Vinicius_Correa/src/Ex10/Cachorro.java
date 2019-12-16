package Ex10;

/**
 * Cachorro
 */
public class Cachorro extends Animal{

    public Cachorro(String especie) {
        super(especie);
        // TODO Auto-generated constructor stub
    }


    @Override
    public void emitirSom() {
        System.out.println("Latindo");
        
    }
    
}