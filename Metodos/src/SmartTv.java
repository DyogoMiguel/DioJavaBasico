public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void volumeMais(){
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void volumeMenos(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void canalMais(){
        canal++;
    }

    public void canalMenos(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }


}
