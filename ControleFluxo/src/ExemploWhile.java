import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada>0){
            Double valDoce = valAleatorio();
            if(valDoce > mesada)
            valDoce = mesada;

            System.out.println("Doce do valor " +valDoce+ " adicionado ao carrinho");
            mesada = mesada - valDoce;
        }
        System.out.println("Mesada: " +mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");

    }
private static double valAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2, 8);
}    
}
