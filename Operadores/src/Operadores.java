public class Operadores {
    public static void main(String[] args) throws Exception {
        
        int num1 = 10;
        int num2 = 15;
        boolean condi1 = false;
        boolean condi2 = true;

        String comparar = num1==num2 ? "Os números são iguais" : "Os números são diferentes";

        System.err.println(comparar);

        boolean simNao = num1==num2;

        System.err.println(simNao);

        if (condi1 && condi2){
            System.out.println("Ambas condições são verdadeiras");
        } 
        if (condi1 || condi2){
            System.out.println("Uma das condições são verdadeiras");
        } else {
            System.out.println("Ambas as condições são falsas");
        }
}
}