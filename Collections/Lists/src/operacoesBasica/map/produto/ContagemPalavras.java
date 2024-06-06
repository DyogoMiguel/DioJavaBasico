package operacoesBasica.map.produto;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        } else {
            throw new RuntimeException("O Map está vazio");
        }
    } 

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : palavrasMap.values()) {
            contagemTotal += contagem;
          } 
         return contagemTotal; 
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> p : palavrasMap.entrySet()){
            if (p.getValue() > maiorContagem){
                maiorContagem = p.getValue();
                palavraFrequente = p.getKey();
            }
        }
        return palavraFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
    
        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);
    
        
        System.out.println(contagemPalavras.exibirContagemPalavras());
    
        
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
      }

    
}
