package Ex03;

/**
 * Livro
 */
public class Livro extends Produto{

    

     public Livro(String nome, double preco, long codBarras) {
        super(nome, preco, codBarras);
        // TODO Auto-generated constructor stub
    }

    String autor;

    @Override
    public String toString() {
        return "Livro [autor=" + autor + "]";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
}