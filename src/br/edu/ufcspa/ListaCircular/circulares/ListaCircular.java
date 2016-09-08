package circulares;

public class ListaCircular {
	protected Nodo inicio;
	protected Nodo fim;
	protected int index;

	public ListaCircular() {
		this.fim = null;
		this.inicio = null;
		index = 0;
	}

	public void adicionaInicio(String dado) {
		Nodo nodoAtual = new Nodo(dado);
		if (this.fim == null) {
			nodoAtual.proximo = nodoAtual;
			this.fim = nodoAtual;
		} else {
			nodoAtual.proximo = this.fim.proximo;
			this.fim.proximo = nodoAtual;
		}
		index++;
	}

	public void adicionaFim(String dado) {
		Nodo nodoAtual = new Nodo(dado);
		if (this.fim == null) {
			this.fim = nodoAtual;
		} else {
			nodoAtual.proximo = this.fim.proximo;
		}
		this.fim.proximo = nodoAtual;
		this.fim = nodoAtual;
		index++;
	}

	public void removeUltimo() {
		int contador = 0;
		if (this.fim == null) {
			throw new IllegalArgumentException("Item nao encontrado!");
		}
		Nodo nodoAtual = this.fim;

		while (contador + 1 != index) {
			nodoAtual = nodoAtual.proximo;
			contador++;
			System.out.println(nodoAtual.dado);
		}

		nodoAtual.proximo = this.fim.proximo;

		index--;
	}

	public Object busca(String dado) {
		Nodo nodoAtual = this.fim;
		while (nodoAtual.proximo != null) {
			if (nodoAtual.dado.equals(dado)) {
				return nodoAtual;
			} else {
				nodoAtual = nodoAtual.proximo;
			}
		}
		return 0;
	}

	public void imprimeConteudo() {
		Nodo nodoAtual = this.fim;
		while (nodoAtual.proximo != null) {
			System.out.println(nodoAtual.dado + " ");
			nodoAtual = nodoAtual.proximo;
		}
		System.out.println(nodoAtual.dado + " I:" + index);
	}

	public static void main(String[] args) {
		ListaCircular l1 = new ListaCircular();
		l1.adicionaInicio("TESTE 2");
		l1.adicionaInicio("TESTE 1");
		l1.adicionaFim("TESTE 3");

		l1.removeUltimo();

		l1.imprimeConteudo();

	}
}