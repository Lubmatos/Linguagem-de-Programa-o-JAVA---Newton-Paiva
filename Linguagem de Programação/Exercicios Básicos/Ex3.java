import java.util.Scanner;

/*3. Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor de 10 posições. Em cada posição subsequente,
coloque o dobro do valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1, 2, 4, 8 e assim sucessivamente. Mostre o vetor em seguida.*/

public class Ex3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int [] vetor = new int[10];
        int inicial;
        System.out.println("Informe um valor: ");
        inicial = ler.nextInt();
        vetor[0]=inicial;
        for(int cont=1;cont<=9;cont++){
            vetor[cont]=vetor[(cont-1)]*2;
        }
        for(int cont=0;cont<=9;cont++){
            System.out.println(vetor[cont]);
        }
        ler.close();
    }
}
