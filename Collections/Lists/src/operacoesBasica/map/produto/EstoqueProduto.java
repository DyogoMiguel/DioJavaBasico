package operacoesBasica.map.produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProduto() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if(!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                valorTotal += p.getQuantitade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueMap.values()){
            if (p.getPreco() > maiorPreco){
                produtoCaro = p;
            }
        }
        return produtoCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueMap.values()){
            if (p.getPreco() < menorPreco){
                produtoBarato = p;
            }
        }
        return produtoBarato;
    }
    
    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
    
        estoque.exibirProdutos();
    
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    
        estoque.exibirProdutos();
    
        
      }
}
