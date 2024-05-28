package Messager.Apps;

public class FacebookMessager extends ServicoMensagem{

    public void enviarMensagem() {
        validarConexao();
        System.out.println("Mensagem enviada via Facebook");
    }

    public void receberMensagem() {
        System.out.println("Mensagem recebida via Facebook");
    }
    

}
