package operacoesBasica.map.produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantitade;

    public Produto(String nome, double preco, int quantitade) {
        this.nome = nome;
        this.preco = preco;
        this.quantitade = quantitade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantitade() {
        return quantitade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantitade=" + quantitade + "]";
    }

    
    
    
    
}
