package Ex04;

/**
 * Produto
 */
public class Produto implements Comparable{

    protected static String nome;
    protected double preco;
    protected long codBarras;

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco, long codBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codBarras = codBarras;
    }

    public long getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(long codBarras) {
        this.codBarras = codBarras;
    }
    // Metodo para retorna true

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) object;
        return (this.codBarras == produto.codBarras);
    }

    @Override
    public String comparaNome() {
        nome.equals(Produto.getNome());
        return null;
    }



}