package functionalInterface;

import java.util.Arrays;
import java.util.List;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numerosDobrar = numeros.stream()
        .map(n -> n * 2)
        .toList();

        numerosDobrar.forEach(System.out::println);
    }
}
