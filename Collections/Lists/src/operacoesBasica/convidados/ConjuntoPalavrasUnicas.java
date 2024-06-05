package operacoesBasica.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasSet == null) ? 0 : palavrasSet.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasSet == null) {
            if (other.palavrasSet != null)
                return false;
        } else if (!palavrasSet.equals(other.palavrasSet))
            return false;
        return true;

    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavrasSet.isEmpty()){
            if (palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            } else {
                throw new RuntimeException("Esta palavra não existe");
            }
        } else {
            throw new RuntimeException("Este set está vazio");
        }
    }

    public void verificarPalavra(String palavra){
        if (!palavrasSet.isEmpty()){
            if (palavrasSet.contains(palavra)){
                System.out.println("A palavra " +palavra+ " existe no set");
            } else {
                System.out.println("Esta palavra não existe no set");
            } 
        } else {
            throw new RuntimeException("Este set está vazio");
        }
    }
    
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }
    
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Um");
        conjuntoPalavrasUnicas.adicionarPalavra("Dois");
        conjuntoPalavrasUnicas.adicionarPalavra("Três");
        conjuntoPalavrasUnicas.adicionarPalavra("Quatro");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Dois");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Quatro");
    }
}
