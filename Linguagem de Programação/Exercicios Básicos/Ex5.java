import java.util.Scanner;

/*5. Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. Lembre-se que os 2 primeiros elementos da série de Fibonacci
são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal.*/

public class Ex5 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número");
        int valor = ler.nextInt();
        ler.close();
        if(valor==0 || valor ==1){
            System.out.println("Fibonacci correspondente: "+valor);
        }
        else{
            double [] F = new double[valor+1];
            F[0]=0;
            F[1]=1;
            for(int cont = 2;cont<=valor;cont++){
                F[cont] = F[cont-1]+ F[cont-2];
            }
            System.out.println("Fibonacci correspondente: "+F[valor]);
        }

    }
}
