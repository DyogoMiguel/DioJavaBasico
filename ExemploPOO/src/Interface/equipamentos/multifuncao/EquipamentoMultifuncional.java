package Interface.equipamentos.multifuncao;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {

    public void digitalizar() {
        System.out.println("Digitalizando via multifuncional");
    }

    public void copiar() {
        System.out.println("Copiando via multifuncional");
    }

    public void imprimir() {
        System.out.println("Imprimindo via multifuncional");
    }
    
}
