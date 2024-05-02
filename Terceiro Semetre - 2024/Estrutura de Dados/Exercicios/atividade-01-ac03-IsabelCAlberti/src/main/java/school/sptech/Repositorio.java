package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    //1. Atributos encapsulados de Repositorio:
    //List<Classe tema> lista
    //PilhaObj<Integer> pilha

    //2. Construtor de Repositorio - Instancia os atributos lista e pilha.
    // Pode criar a pilha com tamanho 10.

    List<Estadio> listEstadio;
    PilhaObj<Integer> pilha;

    public Repositorio() {
        listEstadio = new ArrayList<>();
        pilha = new PilhaObj<>(10);
    }

    /*3. Métodos de Repositorio
Método salvar: void, recebe como argumento um objeto do tipo ClasseTema.
Esse método adiciona esse objeto à lista.
Como o método salvar pode ser desfeito, empilha o id do objeto na pilha.
*/
    public void salvar(Estadio estadio) {
        listEstadio.add(estadio);
        pilha.push(estadio.getId());
    }

/*Método deletar: void, recebe como argumento um inteiro id, do objeto a ser deletado.
Esse método verifica se o objeto com id igual ao argumento existe na lista.
Se existir, remove esse objeto da lista.
Se não existir, exibe a mensagem "ID inexistente".
*/

    public void deletar(int id) {
        for (Estadio estadio : listEstadio) {
            if (estadio.getId() == id) {
                listEstadio.remove(estadio);
                return;
            }
        }
        System.out.println("ID inexistente");
    }

    /*Método exibir:, void, não recebe argumentos.
    Esse método verifica se a lista está vazia.
    Se estiver, exibe "Repositório vazio", senão exibe o conteúdo da lista.
    Esse método também chama o método exibe da pilha.
    */
    public void exibir() {
        if (listEstadio.isEmpty()) {
            System.out.println("Repositório vazio");
        } else {
            for (Estadio estadio : listEstadio) {
                System.out.println(estadio);
            }
        }
        pilha.exibe();
    }

    /*Método desfazer: void, não recebe argumentos.
    Esse método verifica se a pilha está vazia.
    Se estiver, exibe mensagem "Não há nada a desfazer".
    Senão, desempilha um id da pilha e chama o deletar,
    passando esse id, para desfazer a última operação de salvar.*/
    public void desfazer() {
        if (pilha.isEmpty()) {
            System.out.println("Não há nada a desfazer");
        } else {
            deletar(
                    pilha.pop()
            );
        }
    }

    public boolean existePorId(int id) {
        for (Estadio estadio : listEstadio) {
            if (estadio.getId() == id) {
                return true;
            }
        }
        return false;
    }
}