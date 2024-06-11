package functionalInterface;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {

        List<String> listaSaudacoes = Stream.generate(() -> "Olá")
        .limit(5)
        .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
