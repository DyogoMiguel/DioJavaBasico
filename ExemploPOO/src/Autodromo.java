public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("932223-1");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("19334432-5");
        //z400.ligar();

        Veiculo coringa = z400;
        coringa.ligar();
    }
}
