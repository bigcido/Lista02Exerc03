package controller;

public class VetPares {

	public VetPares() {
		super();
	}
	public int parvet(int[] vet, int tamanho) {
		//contador de vetor. Não tem como a posição ser menor que 0, portanto, se tamanho=0, return 0
		if (tamanho == 0) {
			return 0;
		} else {
			int ultPos = tamanho - 1;
			int vlr = vet[ultPos];
				if (vlr % 2 == 0) {
					return 1 + parvet(vet, tamanho-1);
			} else {
				return parvet(vet, tamanho -1);
			}
			/*Após verificar o vetor inteiro, é necessário verificar os 
			 * valores do vetor. Se ele for par, soma 1, se não, soma 0.
			 */
		}
	}
}
