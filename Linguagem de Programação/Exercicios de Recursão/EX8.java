/*8. Crie uma função recursiva que determine se uma string é um palíndromo (ou seja, se ela é igual quando lida de trás para frente).*/

public class EX8 {
    public static void main(String[] args) {
    String X = ("arara");
        String invertido = Palindromo(X, X.length()-1);
        if(X.equals(invertido)){
            System.out.println("(é um palindromo)");
        }
        else{
            System.out.println("(não é palindromo)");
        }


    }
   public static String Palindromo(String X, int L) {
        if (L < 0) {
            return "";
        }
        return X.charAt(L) + "" + Palindromo(X, L - 1);
    }
}
