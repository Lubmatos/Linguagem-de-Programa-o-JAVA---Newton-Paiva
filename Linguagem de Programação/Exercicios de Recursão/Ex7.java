import java.util.Scanner;
/*7. Desenvolva uma função recursiva que receba um número inteiro positivo e retorne a soma de seus dígitos.*/
public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe um número positivo:");
        int x = ler.nextInt();
        System.out.println("A soma dos dígitos é: " +SomaDigitos(x));
    }
    public static int SomaDigitos(int x){
        if(x<10){
        return x;
        }
        return (x%2) + SomaDigitos(x/10);
    }
}
