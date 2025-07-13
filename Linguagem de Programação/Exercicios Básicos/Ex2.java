import java.util.Locale;
import java.util.Scanner;

/*2. Escreva um programa que leia 10 valores inteiros, informados pelo usuário e armazene-os em um vetor. Após isso, lendo o vetor uma única vez
 e sem criar outros vetores, mostre na tela a média dos valores armazenados no vetor ponderados pelos índices nos quais estão armazenados.
*/

public class Ex2 {
    public static void main(String[]args){
        Scanner ler = new Scanner (System.in).useLocale(Locale.US);
        int [] vetor = new int[10];
        int cont;
        int media=0;
        for(cont=0;cont<=9;cont++){
            System.out.println("Informe 10 números inteiros: ");
            vetor[cont] = ler.nextInt();
            media+=vetor[cont];
        }
        System.out.print("Média Ponderada dos números informados: "+(media/10));
        ler.close();
    }
}
