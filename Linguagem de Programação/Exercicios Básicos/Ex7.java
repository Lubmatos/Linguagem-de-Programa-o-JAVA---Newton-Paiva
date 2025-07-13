import java.util.Scanner;
/*7. Escreva um programa que receba um número inteiro 2≤𝑁≤5, crie uma matriz quadrada 𝑁×𝑁, preencha a matriz
 com valores de 1 até 𝑁2, calcule o quadrado da matriz criada e exiba o resultado na tela.*/
public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N;
        
        do {
            System.out.print("Digite um número inteiro entre 2 e 5: ");
            N = ler.nextInt();
        } while (N < 2 || N > 5);
        
        int[][] matriz = new int[N][N];
        int[][] resultado = new int[N][N];
        int valor = 1;
        
       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = valor++;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    resultado[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }
  
        ler.close();

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%4d ", elemento);
            }
            System.out.println();
        }
    }
}

