
import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("Exercício (1): Plano de Ação - Augusto Arraes, Edital 17/2022");
		Exercicio1 exercicio1 = new Exercicio1();
		exercicio1.preencheVetor();
		exercicio1.mostraMaiorValor();
		exercicio1.mostraMenorValor();
		exercicio1.imprimeVetorOrdemCrescente();
	}
	
	
	private int tamanhoVetor = 6;
	private double[] vetor = new double[tamanhoVetor];
	
	
	public void preencheVetor() {
		System.out.println( String.format(":: Vamos preencher o Vetor de tamanho %d: ", this.tamanhoVetor) );
		for (int i=0; i<this.tamanhoVetor; i++) {
			System.out.println( String.format("Valor do vetor [%d]: ",(i+1)) );
			this.vetor[i] = this.digitaValorDistinto();
		}		
	}
	
	private double digitaValorDistinto() {
		Scanner teclado = new Scanner(System.in);
		double aux = teclado.nextDouble();
        while ( this.buscaValor(aux) ) {
        	System.out.println("Valor já existe no Vetor. Digite novo valor!");
        	aux = teclado.nextDouble();
        }
		return aux;
	}
	
	private boolean buscaValor(double valor) {
		boolean status = false;
		for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] == valor) {
            	status = true;
            	break;
            }
        }
		return status;
	}
	
	
	public void mostraMaiorValor() {
		double maior = Double.MIN_VALUE;
		int indice = -1;
		for (int i = 0; i < this.vetor.length; i++) {
		    if (this.vetor[i] > maior) {
		        maior = this.vetor[i];
		        indice = i;
		    }
		}
		System.out.println( String.format(":: Maior número é %.2f, na posição %d do vetor", maior, indice) );
	}
	
	
	public void mostraMenorValor() {
		double menor = Double.MAX_VALUE;
		int indice = -1;
		for (int i = 0; i < vetor.length; i++) {
		    if (this.vetor[i] < menor) {
		        menor = this.vetor[i];
		        indice = i;
		    }
		}
		System.out.println( String.format(":: Menor número é %.2f, no posicão %d do vetor", menor, indice) );
	}
	
	
	public void imprimeVetorOrdemCrescente() {
		double aux;
		for(int i =0; i<this.tamanhoVetor; i++){
			for(int j =0; j <this.tamanhoVetor-1; j++){
				if(this.vetor[j]> this.vetor[j+1]){
					aux = this.vetor[j];
					this.vetor[j] = this.vetor[j+1];
					this.vetor[j+1] = aux;
				}
			}
		}
		System.out.print(":: Imprimindo Vetor em Ordem Crescente:");
		for(int i =0; i<this.tamanhoVetor; i++) System.out.print(this.vetor[i]+" ");
	}

}
