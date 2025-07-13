import java.util.Scanner;

/*6. Crie uma matriz bidimensional quadrada para armazenar 9 valores inteiros informados pelo usuário. Depois, calcule e mostre na tela o determinante da matriz.*/

public class Ex6 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int [3][3];
        for(int linha=0;linha<=2;linha++){
            for (int coluna =0;coluna<=2;coluna++){
                System.out.println("Insira 9 valores: ");
                matriz[linha][coluna]=ler.nextInt();
            }
        }
        int determintante =
            matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
            - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
            + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
        System.out.print("O determinante da matriz é: "+determintante);       
    }

}
