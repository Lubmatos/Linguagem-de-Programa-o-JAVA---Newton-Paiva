import java.util.Scanner;
/*6. Escreva uma função recursiva que receba um número inteiro positivo e retorne a quantidade de dígitos que ele possui.*/

public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe um número positivo:");
        int x = ler.nextInt();
        System.out.println("Contém " + QtsDigitos(x) + " Dígitos");
    }
    public static int QtsDigitos (int x){
        if(x<=9){
        return 1;
        }
        return 1 + QtsDigitos(x/10);
    }
}
