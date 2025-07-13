import java.util.Scanner;
/*5. Crie uma função recursiva que calcule a^b (a elevado a b) sem utilizar a operação de exponenciação direta.*/
public class EX5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("informe o número a ser elevado:");
        int a = ler.nextInt();
        System.out.println("informe o número que eleva:");
        int b = ler.nextInt();

        ler.close();
        System.out.println("valor é :" +elevar(a, b));

    }
    public static long elevar(int a, int b){
        if(a<=1 || b==0){
            return 1;
        }
        return a*elevar(a, b-1);
    }
}
