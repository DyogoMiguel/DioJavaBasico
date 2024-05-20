import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
        System.out.println("Digite seu nome");
        String nome = scan.nextLine();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scan.nextLine();

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        System.out.println("Digite sua altura");
        Double altura = scan.nextDouble();

        System.out.println("Informações : " + nome + sobrenome + idade + altura);
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam de um valor numérico");
        }
    }
}
