package functionalInterface.Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {

    public static Boolean divisivel (int n){
        if (n % 3 == 0 || n % 5 == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
        .filter(n -> divisivel(n))
        .reduce(0, Integer::sum);

        System.out.println(soma);
    }
}
