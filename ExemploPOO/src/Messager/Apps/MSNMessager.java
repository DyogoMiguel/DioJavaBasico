package Messager.Apps;

public class MSNMessager extends ServicoMensagem {

    public void enviarMensagem() {
        validarConexao();
        System.out.println("Mensagem MSN enviada");
    }

    public void receberMensagem() {
        System.out.println("Mensagem MSN recebida");
    }
    


}
