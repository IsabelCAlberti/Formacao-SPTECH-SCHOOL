package school.sptech;

import java.text.Normalizer;

public class PilhaObj<T> {

    //deverá armazenar elementos de tipo genérico <T>
    private int topo;
    private T[] pilha;

    public PilhaObj(int tamanho) {
        pilha = (T[]) new Object[tamanho];
        this.topo = -1;
    }

    public int getTopo() {
        return topo;
    }

    public T[] getPilha() {
        return pilha;
    }

    public void push(T info) {
        if (topo != pilha.length - 1) {
            pilha[++topo] = info;
        }
    }

    //int pop() - Se a pilha não está vazia,
    //então devolve elemento de pilha[topo] e decrementa topo,
    //senão retorna –1
    public T pop() {
        if (topo != -1) {
            T aux = pilha[topo];
            topo--;
            return aux;
        }
        return null;
    }

    //int peek() - se pilha não está vazia,
    //então devolve elemento de pilha[topo], senão devolve –1
    public T peek() {
        if (topo != -1) {
            return pilha[topo];
        }
        return null;
    }

    //void exibe() - Se a pilha está vazia, exibe "Pilha vazia",
    // senão exibe os elementos da pilha
    public void exibe() {
        if (topo == -1) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.println(pilha[i]);
            }
        }
    }
    public Boolean isEmpty() {
        return topo == -1;
    }

    public Boolean isFull() {
        return topo == pilha.length - 1;
    }

}
