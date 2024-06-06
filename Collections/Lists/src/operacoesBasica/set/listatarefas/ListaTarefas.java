package operacoesBasica.set.listatarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover = t;
                    break;
                } else {
                    throw new RuntimeException("Esta tarefa não existe");
                }
            }
        } else {
            throw new RuntimeException("Este set está vazio");
        }
        tarefaSet.remove(tarefaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas(){
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.isConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            throw new RuntimeException("Este set está vazio");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        } else {
            throw new RuntimeException("Este set está vazio");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
    for (Tarefa t : tarefaSet) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefaConcluida = t;
        break;
        }
        }
        tarefaConcluida.setConcluida(true);
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
    for (Tarefa t : tarefaSet) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefaPendente = t;
        break;
        }
        }
        tarefaPendente.setConcluida(false);
    }

    public void limparListaTarefas(){
    if(!tarefaSet.isEmpty()){
        tarefaSet.clear();
        } else {
            throw new RuntimeException("Este set já está vazio");
        }
    }

    public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();

    listaTarefas.adicionarTarefa("Tarefa 1");
    listaTarefas.adicionarTarefa("Tarefa 2");
    listaTarefas.adicionarTarefa("Tarefa 3");
    listaTarefas.adicionarTarefa("Tarefa 4");
    listaTarefas.adicionarTarefa("Tarefa 5");

    listaTarefas.exibirTarefas();

    listaTarefas.removerTarefa("Tarefa 1");

    listaTarefas.exibirTarefas();

    listaTarefas.contarTarefas();

    listaTarefas.marcarTarefaConcluida("Tarefa 2");
    listaTarefas.marcarTarefaConcluida("Tarefa 3");
    
    System.out.println(listaTarefas.obterTarefasConcluidas());

    listaTarefas.marcarTarefaPendente("Tarefa 2");

    System.out.println(listaTarefas.obterTarefasPendentes());

    listaTarefas.limparListaTarefas();
    
    listaTarefas.exibirTarefas();
    }
}
