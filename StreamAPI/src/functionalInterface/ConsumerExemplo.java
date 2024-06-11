package functionalInterface;

import java.util.Arrays;
import java.util.List;

public class ConsumerExemplo {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);


        numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
    }
}
