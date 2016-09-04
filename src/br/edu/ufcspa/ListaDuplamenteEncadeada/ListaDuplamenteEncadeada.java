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
        boolean flag = true;
        do
        {
            if(atual != null)
            {
                System.out.println(atual.getDado());
                atual = atual.getProximo();
            }
        }while(atual != null);
    }
}