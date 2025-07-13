import java.util.Scanner;
public class Exercicio1 {
/*1. Implemente um programa que peça dois números inteiros e tente realizar uma divisão. Trate a exceção de divisão por
 zero utilizando try-catch.*/
    public static void Divisao(int x,int y) throws Exception{
        if(y!=0){
        System.out.println("Resultado da Divisão: "+(x/y));
        }
        else{
        throw new Exception("Divisor é Zero, impossível Calcular");
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o dividendo:");
        int x = ler.nextInt();
        System.err.println("Informe o divisor");
        int y = ler.nextInt();
        ler.close();
        try {
            Divisao(x, y);
        } catch (Exception e) {
            System.out.println(e.getMessage());   
        }
    }   
}
