package Messager.Apps;

public class TelegramMessager extends ServicoMensagem{

    public void enviarMensagem() {
        validarConexao();
        System.out.println("Mensagem enviada via Telegram");
    }

    public void receberMensagem() {
        System.out.println("Mensagem recebida via Telegram");
    }
    
}
