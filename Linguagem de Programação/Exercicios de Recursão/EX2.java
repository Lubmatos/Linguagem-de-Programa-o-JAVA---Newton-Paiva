import java.util.Scanner;
/*2. Escreva uma função recursiva que receba uma string e a retorne invertida.*/

public class EX2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe uma palavra:");
        String X = ler.nextLine();
        System.out.println("A palavra invertida: "+inverter(X, X.length()-1));
        ler.close();
    }
    
    public static String inverter(String X, int L){
        if(L<0){
            return (" ");
        }
        return X.charAt(L) +inverter(X, L -1);
    }
    
}
