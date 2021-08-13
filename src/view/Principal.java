package view;

import controller.VetorController;

public class Principal {

	public static void main(String[] args) {

		int[] vetor = { 4, 8, 9, 5, 3, 7, 10, 7, 9, 1, 2 };
		int tamanho = vetor.length;

		VetorController vc = new VetorController();
		int somaVetor = vc.somaVetor(vetor, tamanho);
		System.out.println(somaVetor);
	}

}
