package functionalInterface.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio2 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;

        List<Integer> pares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .toList();

        int resultado = pares.stream()
        .reduce(0, somar);

        System.out.println(resultado);


    }
}
