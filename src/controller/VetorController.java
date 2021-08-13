package controller;

public class VetorController {

	public VetorController() {
		super();
	}

	public int somaVetor(int[] vetor, int tamanho) {
//		Condi��o de parada
		if (tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho - 1;
			int valor = vetor[ultimaPosicao];
			tamanho--;
			return valor + somaVetor(vetor, tamanho);

//			Op��o direta e simplificada
//			return vetor[tamanho - 1] + somaVetor(vetor, tamanho - 1);
		}
	}
}
