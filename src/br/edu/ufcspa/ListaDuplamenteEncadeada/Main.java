package br.edu.ufcspa.ListaDuplamenteEncadeada;

/**
 * Created by GabrielRS on 03/09/2016.
 */
public class Main {

    public static void main(String []args)
    {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.adicionaFim("Fim 1");
        lista.adicionaInicio("No inicio");
        lista.adicionaFim("tem que estar mais no fim");
        lista.adicionaInicio("tem que estar mais no inicio ainda");
        lista.mostraLista();

    }

}