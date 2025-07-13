import java.util.Scanner;

/*4. Crie uma classe de exceção personalizada chamada IdadeInvalidaException.
 Implemente um programa que peça a idade de uma pessoa e lance essa exceção se a idade for negativa ou maior que 150.*/

public class Exercicio4 {
    public static class IdadeInvalidaException extends Exception{
        public IdadeInvalidaException() {
            super("Idade informada é invalida");
        }
        public static void main(String[] args){
            Scanner ler = new Scanner(System.in);
            System.out.println("Informe a idade:");
            String x = ler.nextLine();

            try {
                int idade = Integer.parseInt(x);
                if (idade < 0 || idade > 150){
                throw new IdadeInvalidaException();
                }
                System.out.println("Idade Registrada");
            } catch (NumberFormatException e) {
                System.out.println("Não foi informado nenhum número");
            } catch (IdadeInvalidaException e){
                System.out.println(e.getMessage());
            }   catch (Exception e) {
                System.out.println("Erro não identificado, refaça");
            }
            finally{
                System.out.println("Programa Finalizado.");
            }
            
        }
    }
}
