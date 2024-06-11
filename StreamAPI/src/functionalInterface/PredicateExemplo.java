package functionalInterface;

import java.util.Arrays;
import java.util.List;

public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "kotlin", "python", "javascrypt", "c", "go", "ruby");

        palavras.stream()
        .filter(p -> p.length() > 5)
        .forEach(System.out::println);


    }
}
