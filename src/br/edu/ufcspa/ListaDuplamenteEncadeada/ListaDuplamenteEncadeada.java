package br.edu.ufcspa.ListaDuplamenteEncadeada;

import java.lang.annotation.Documented;

/**
 * Created by GabrielRS on 03/09/2016.
 */
public class ListaDuplamenteEncadeada {

    private Nodo inicio;
    private Nodo fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionaFim(String dado)
    {
        if(this.inicio != null && this.fim != null)
        {
            Nodo novoNodo = new Nodo(dado);
            novoNodo.setAnterior(this.fim);
            this.fim.setProximo(novoNodo);
            this.fim = novoNodo;
        }

        /*caso não tenha sido iniciado
          poderia ser implementado um flag na própria lista*/
        if(this.inicio == null)
            this.inicio = new Nodo(dado);
        if(this.fim == null)
            this.fim = this.inicio;
    }

    public void adicionaInicio(String dado)
    {
        if(this.inicio != null && this.fim != null)
        {
            Nodo novoNodo = new Nodo(dado);
            novoNodo.setProximo(this.inicio);
            this.inicio.setAnterior(novoNodo);
            this.inicio = novoNodo;
        }

        if(this.inicio == null)
            this.inicio = new Nodo(dado);
        if(this.fim == null)
            this.fim = this.inicio;
    }

    public void mostraLista()
    {
        Nodo atual = inicio;
        do
        {
            if(atual != null)
            {
                System.out.println(atual.getDado());
                atual = atual.getProximo();
            }
        }while(atual != null);
    }

    public boolean buscaElemento(String dado)
    {
        Nodo atual = inicio;
        do
        {
            if(atual != null)
            {
                if(atual.getDado().equals(dado))
                    return true;
                atual = atual.getProximo();
            }
            if(atual.getProximo() == inicio)
                return false;
        }while(atual != null);
        return false;
    }

    public boolean adicionaPosicao(String dado, int pos)
    {
        Nodo atual = inicio;
        int posAtual = 0;

        do {
            if(atual != null)
            {
                if(posAtual == (pos-1)) {
                    Nodo novoNodo = new Nodo(dado);
                    novoNodo.setProximo(atual.getProximo());
                    novoNodo.setAnterior(atual);
                    atual.setProximo(novoNodo);
                    return true;
                }
                atual = atual.getProximo();
                posAtual++;
            }
        }while (atual != null);

        return false;
    }

    public boolean removePosicao(int pos)
    {
        Nodo atual = inicio;
        int posAtual = 0;
        do {
            if(atual != null)
            {
                if(posAtual == (pos-1)) {
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                    return true;
                }
                atual = atual.getProximo();
                posAtual++;
            }
        }while (atual != null);

        return false;
    }


}