
/*5. Crie uma função que calcula a raiz quadrada de um número, mas lance uma IllegalArgumentException
se o número for negativo. A exceção deve ser capturada e tratada no método main.*/

public class Exercicio5 {
    public static void main(String[] args) {
        double numero = -35;
      try {
          System.out.println("Resultado da raiz é: "+calcular(numero));
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }        
    }
    public static double calcular(double numero) throws IllegalArgumentException{  
        if(numero < 0){
            throw new IllegalArgumentException("Não é possivel Calcular, número negativo.");
        }
        return Math.sqrt(numero);
    }
    
}
