import java.util.Locale;
import java.util.Scanner;

/*1. Escreva um programa que crie um vetor de números inteiros, receba 10 valores informados 
pelo usuário, imprima todos os valores pares e depois todos os valores ímpares.
*/

public class Ex1 {
    public static void main (String[]args){
        Scanner ler = new Scanner (System.in).useLocale(Locale.US);
        int [] vetor = new int [10];
        int cont;
        for(cont=0;cont<=9; cont++){
            System.out.print("informe 10 valores inteiros:");
            vetor[cont]= ler.nextInt();
        }
        for(cont=0;cont<=9;cont++){
            if(vetor[cont]%2==0){
                System.out.println("Par: "+vetor[cont]);
            }
        }
        for(cont=0;cont<=9;cont++){
            if(vetor[cont]%2!=0){
                System.out.println("Ímpar: "+vetor[cont]);
            }
        }
        ler.close();
    }
}