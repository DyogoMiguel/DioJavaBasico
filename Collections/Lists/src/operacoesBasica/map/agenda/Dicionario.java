package operacoesBasica.map.agenda;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicioMap;

    public Dicionario() {
        this.dicioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicioMap.isEmpty()){
            dicioMap.remove(palavra);
        } else {
            throw new RuntimeException("O Map está vazio");
        }
    }
    
    public void exibirPalavras(){
        System.out.println(dicioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisarPorPalavra = null;
        if(!dicioMap.isEmpty()){
            pesquisarPorPalavra = dicioMap.get(palavra);
           
        } else {
            throw new RuntimeException("Este Map está vazio");
        }
        return pesquisarPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavras();

        String definicaoJava = dicionario.pesquisarPorPalavra("java");
    
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");    
        System.out.println(definicaoCSharp);

        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
