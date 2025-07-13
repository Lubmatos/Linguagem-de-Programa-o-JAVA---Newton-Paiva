/*3. Crie um programa que tente acessar um índice fora do limite de um array e trate a exceção.*/
public class Excercicio3 {
    public static void main(String[] args) {
        String [] Array = new String []{"publico","privado","não declado", "do estado"};   
        int x=4;
        try {
            System.out.println("o tipo selecionado foi"+Array[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A posição solicitada não existe");
        }
    }
}
