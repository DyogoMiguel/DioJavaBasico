package operacoesBasica.list.pesquisa.soma;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numList;

    public SomaNumeros() {
        this.numList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numList.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        if (!numList.isEmpty()){
         for (Integer i : numList){
            total = total + i;
         }
        }
        return total;
    }

    public Integer encontrarMaiorNumero(){
    int maiorNum = Integer.MIN_VALUE;
    if (!numList.isEmpty()){
        for (Integer i : numList){
           if (i > maiorNum){
            maiorNum = i;
           }
        }
       }
       return maiorNum;
    }

    public Integer encontrarMenorNumero(){
        int menorNum = Integer.MAX_VALUE;
        if (!numList.isEmpty()){
            for (Integer i : numList){
               if (i < menorNum){
                menorNum = i;
               }
            }
           }
           return menorNum;
        }

    public void exibirNumeros(){
        System.out.println(numList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(50);
        somaNumeros.adicionarNumero(-5);

        System.out.println(somaNumeros.calcularSoma());

        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();

    }
    
}
