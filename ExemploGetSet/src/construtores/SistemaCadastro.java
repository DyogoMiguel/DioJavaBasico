package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "1202392323");

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() +" - " +marcos.getCpf());
    }
}
