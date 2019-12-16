package Ex03;

/**
 * Dvds
 */
public class Dvds extends Produto{



    

    

    public Dvds(String nome, double preco, long codBarras) {
        super(nome, preco, codBarras);
        // TODO Auto-generated constructor stub
    }

    private String duração;



    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    @Override
    public String toString() {
        return "Dvds [duração=" + duração + "]";
    }
    
}