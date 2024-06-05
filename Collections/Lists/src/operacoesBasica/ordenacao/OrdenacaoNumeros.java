package operacoesBasica.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    
    private List<Integer> numList;

    public OrdenacaoNumeros() {
        this.numList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAsc = new ArrayList<>(numList);
        if (!numList.isEmpty()){
        Collections.sort(numerosAsc);
        return numerosAsc;
        } else {
        throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDes = new ArrayList<>(numList);
        if (!numList.isEmpty()){
        Collections.reverse(numerosDes);
        return numerosDes;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(6);

        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
