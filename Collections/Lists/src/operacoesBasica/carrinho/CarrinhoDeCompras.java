package operacoesBasica.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemsList;

    public CarrinhoDeCompras(){
        this.itemsList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itemsList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();

        for (Item i : itemsList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        itemsList.removeAll(itemsParaRemover);
    }
    
    public double valorTotal(){
        double totalItems = 0;
        for (Item item : itemsList){
        double valor = item.getPreco() * item.getQuantidade();
        totalItems = totalItems + valor;
        }
        return totalItems;
    }

    public void exibirItems(){
        System.out.println(itemsList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("Valor total dos items: " +carrinhoDeCompras.valorTotal());

        carrinhoDeCompras.adicionarItem("Pão", 6.50, 2);
        carrinhoDeCompras.adicionarItem("Queijo", 14.50, 3);
        carrinhoDeCompras.adicionarItem("Açúcar", 10, 1);

        System.out.println("Valor total dos items: " +carrinhoDeCompras.valorTotal());

        carrinhoDeCompras.removerItem("Pão");

        System.out.println("Valor total dos items: " +carrinhoDeCompras.valorTotal());

        carrinhoDeCompras.exibirItems();


    }
}
