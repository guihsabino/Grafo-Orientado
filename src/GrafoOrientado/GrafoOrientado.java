package GrafoOrientado;

public class GrafoOrientado {
	/**
	 * Classe que matém uma lista com locação estática na memoria
	 * 
	 * @author Sabino
	 * @version 06/11/2017
	 */
	private ListaLigada tabela[];
	public GrafoOrientado(int qVertices) {
		tabela = new ListaLigada[qVertices];
	}
public int fEspelhamento(int vertice){
	return vertice - 1;
}

	public void adiciona(int origem, int destino) {
		int i = fEspelhamento(origem);
		if (tabela[i] == null)
			tabela[i] = new ListaLigada();
		tabela[i].adicionaFinal(destino);
	}
	
	public void remove(int origem, int destino) {
		int i = fEspelhamento(origem);
		if (tabela[i] != null)
			//Implementar removeElemento na lista Ligada, que recebe por parametro o elemento
			return tabela[i].removeElemento(destino);
	}		
	return null;

	public String toString() {
		String r = "";
		for (int i = 0; i < tamanho; i++) {
			r = r + " " + dados[i];
		}
		r = r + "\n Quantidade de elementos: " + tamanho;
		return r;
	}

	public int[] getListaLigada() {
		return ListaLigada;
	}

	public void setListaLigada(int listaLigada[]) {
		ListaLigada = listaLigada;
	}
}
