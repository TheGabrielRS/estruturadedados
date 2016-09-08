package circulares;

public class Nodo {
	protected String dado;
	protected Nodo proximo;
	protected Nodo anterior;
	
	public Nodo(String dado2){
		this.dado = dado2;
		this.proximo = null;
		this.anterior = null;
	}
}
