import java.util.Scanner;

/*8. Escreva um programa que calcule a multiplicação entre duas matrizes quaisquer. Seu programa deve determinar se é possível executar a multiplicação,
e mostrar o resultado do cálculo para os casos possíveis. Quando não for possível efetuar a operação, uma mensagem deve ser exibida na tela.*/

public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhasA = scanner.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunasA = scanner.nextInt();
        
        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhasB = scanner.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunasB = scanner.nextInt();
        
        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar as matrizes, pois o número de colunas da primeira matriz é diferente do número de linhas da segunda matriz.");
        } else {
            int[][] matrizA = new int[linhasA][colunasA];
            int[][] matrizB = new int[linhasB][colunasB];
            int[][] resultado = new int[linhasA][colunasB];
            
         
            System.out.println("Digite os elementos da primeira matriz:");
            preencherMatriz(scanner, matrizA);
            
   
            System.out.println("Digite os elementos da segunda matriz:");
            preencherMatriz(scanner, matrizB);
            
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    resultado[i][j] = 0;
                    for (int k = 0; k < colunasA; k++) {
                        resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
            

            System.out.println("\nMatriz Resultado:");
            imprimirMatriz(resultado);
        }
        
        scanner.close();
    }
    

    private static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%4d ", elemento);
            }
            System.out.println();
        }
    }
}

}
