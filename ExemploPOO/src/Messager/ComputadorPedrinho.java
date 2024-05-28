package Messager;

import Messager.Apps.FacebookMessager;
import Messager.Apps.MSNMessager;
import Messager.Apps.ServicoMensagem;
import Messager.Apps.TelegramMessager;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        
        ServicoMensagem sm = null;

        String appEscolhido = "Facebook";

        if (appEscolhido.equals("msn")){
            sm = new MSNMessager();
        } else if (appEscolhido.equals("Facebook")){
            sm = new FacebookMessager();
        } else if (appEscolhido.equals("Telegram")){
            sm = new TelegramMessager();
        }

        sm.enviarMensagem();
        sm.receberMensagem();
    }
}
