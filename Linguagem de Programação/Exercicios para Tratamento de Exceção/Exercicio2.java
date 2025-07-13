
import java.util.Scanner;

/*2. Peça ao usuário para digitar um número. Trate a exceção caso o usuário insira algo que não seja um número.*/

public class Exercicio2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número");
        String entrada = ler.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("numero registrado");
        } catch (NumberFormatException e) {
            System.out.println("nenhum número foi informado");
        }
        ler.close();
    }
}
