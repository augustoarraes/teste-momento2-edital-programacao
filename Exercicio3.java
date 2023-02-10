
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		System.out.println("Exercício (3): Plano de Ação - Augusto Arraes, Edital 17/2022");
		Exercicio3 exercicio3 = new Exercicio3();
		exercicio3.defineMatrizes();
		exercicio3.imprimeMatriz("A", exercicio3.matrixA);
		exercicio3.imprimeMatriz("B", exercicio3.matrixB);
		exercicio3.imprimeMatriz("C", exercicio3.matrixC);
	}
	
	
	private int matrixDimensaoLinha = 3;
	private int matrixDimensaoColuna = 2;
	private int[][] matrixA = new int[matrixDimensaoLinha][matrixDimensaoColuna];
	private int[][] matrixB = new int[matrixDimensaoLinha][matrixDimensaoColuna];
	private int[][] matrixC = new int[matrixDimensaoLinha][matrixDimensaoColuna];
	
	public void defineMatrizes() {
		Scanner teclado = new Scanner(System.in);
		System.out.println(":: Alimentando as Matrix A e B ...");
		for(int linha=0 ; linha < this.matrixDimensaoLinha ; linha++){
            for(int coluna = 0; coluna < this.matrixDimensaoColuna ; coluna ++){
            	System.out.println( String.format("Matriz 'A'. Digite um valor na posição[%d][%d]", linha, coluna) );
                this.matrixA[linha][coluna] = teclado.nextInt(); 
                System.out.println( String.format("Matriz 'B'. Digite um valor na posição[%d][%d]", linha, coluna) );
                this.matrixB[linha][coluna] = teclado.nextInt();
                this.matrixC[linha][coluna] = matrixA[linha][coluna] + matrixB[linha][coluna];
            }
        }
	}
	
	public void imprimeMatriz(String matrixNome, int[][] matriz) {
		System.out.println(":: Matrix "+matrixNome);
		for(int linha=0 ; linha < this.matrixDimensaoLinha ; linha++){
            for(int coluna = 0; coluna < this.matrixDimensaoColuna ; coluna ++){
                System.out.printf("\t %d \t", matriz[linha][coluna]);
            }
            System.out.println();
        }
	}
	
}
