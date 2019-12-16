package Ex02;

/**
 * Cds
 */
public class Cds extends Produto{

    public Cds(String nome, double preco) {
        super(nome, preco);
        // TODO Auto-generated constructor stub
    }

    private int nFaixa;

   

    public int getnFaixa() {
        return nFaixa;
    }

    public void setnFaixa(int nFaixa) {
        this.nFaixa = nFaixa;
    }

    @Override
    public String toString() {
        return "Cds [nFaixa=" + nFaixa + "]";
    }

    
    
}