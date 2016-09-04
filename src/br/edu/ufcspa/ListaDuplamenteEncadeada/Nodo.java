package br.edu.ufcspa.ListaDuplamenteEncadeada;

/**
 * Created by GabrielRS on 03/09/2016.
 */
public class Nodo {


    private String dado;
    private Nodo anterior;
    private Nodo proximo;

    public Nodo(String dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
