import java.util.Scanner;
/*3. Implemente uma função recursiva que receba um número N, informado pelo usuário, e imprima uma contagem regressiva até 1.*/
public class EX3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe um número inteiro:");
        int I = ler.nextInt();
       regressiva(I);
    }


    public static int regressiva(int I){
        if(I<1){
        return 1;
        }
        System.out.println(I);
        return(regressiva(I-1));
    }

}
