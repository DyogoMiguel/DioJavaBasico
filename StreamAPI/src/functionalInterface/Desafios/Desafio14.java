package functionalInterface.Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio14 {

    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
           
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer numerosPrimos = numeros.stream()
        .filter(n -> isPrimo(n))
        .sorted(Comparator.reverseOrder())
        .findFirst()
        .orElse(null);

        System.out.println(numerosPrimos);

        
    }
}
