import java.util.Scanner;

/*1. Implemente uma função recursiva que receba um número N, informado pelo usuário, e retorne
a soma dos primeiros N números naturais (1 + 2 + 3 + 4 + ... + n-1 +n).*/
public class Ex1 {
    
    public static int somaN(int N){  
        if(N==1){
            return 1;
        }
            return N+(somaN(N-1));
        }
           
        public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe o valor");
        int N = ler.nextInt();

        System.out.println("Soma: "+ somaN(N));
        ler.close();
    }
    
}
