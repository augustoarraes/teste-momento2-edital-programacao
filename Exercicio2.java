
public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("Exercício (2): Plano de Ação - Augusto Arraes, Edital 17/2022");
		Exercicio2 exercicio2 = new Exercicio2();
		exercicio2.defineMatrix();
		exercicio2.imprimeMatrix();
	}
	
	
	private int matrixTamanho = 3;
	private int[][] matrix = new int[matrixTamanho][matrixTamanho];
	
	public void defineMatrix() {
		System.out.println( String.format(":: Definindo a Matrix[%d][%d] ...",this.matrixTamanho, this.matrixTamanho) );
		for(int linha=0 ; linha < this.matrixTamanho ; linha++){
            for(int coluna = 0; coluna < this.matrixTamanho ; coluna ++){
                this.matrix[linha][coluna] = linha + coluna;
            }
        }
	}
	
	public void imprimeMatrix() {
		System.out.println(":: A Matrix:");
		for(int linha=0 ; linha < this.matrixTamanho ; linha++){
            for(int coluna = 0; coluna < this.matrixTamanho ; coluna ++){
                System.out.printf("\t %d \t", this.matrix[linha][coluna]);
            }
            System.out.println();
        }
	}

}
