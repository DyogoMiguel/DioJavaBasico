package operacoesBasica.map.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaMap;

    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
         agendaMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaMap.isEmpty()){
            agendaMap.remove(nome);
        } else {
            throw new RuntimeException("O Map está vazio");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaMap.isEmpty()){
            numeroPorNome = agendaMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("João");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Carlos"));
    }
}
