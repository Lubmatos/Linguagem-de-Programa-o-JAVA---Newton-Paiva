import java.util.Scanner;

/*4. Leia um valor X. Coloque este valor na primeira posição de um vetor N de 100 posições. Em cada posição subsequente de N (1 até 99), coloque a metade do valor
armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.*/

public class Ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double N;
        System.out.println("Informe um valor:");
        N = ler.nextDouble();
        double [] vetor = new double[100];
        vetor[0]=N;
        for(int cont =1;cont<=99;cont++){
            vetor[cont]=vetor[cont-1]/2;
        }
        for(int cont=0; cont<=99; cont++){ 
            System.out.println(vetor[cont]);
        }
        ler.close();
    }
}
