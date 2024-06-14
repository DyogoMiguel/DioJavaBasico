package functionalInterface.Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

    public static boolean negativo(int n){
        if (n <= 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNegativos = numeros.stream()
        .filter(n -> negativo(n))
        .toList();

        System.out.println(numerosNegativos);
    }
}
