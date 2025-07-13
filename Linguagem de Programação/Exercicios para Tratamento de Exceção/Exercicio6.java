/*6. Crie um programa que tente dividir dois números e realizar operações com um array. Trate as múltiplas exceções usando try-catch.*/
public class Exercicio6 {
    public static void main(String[] args) {
        double dividendo = 26;
        double divisor = 2;

        String palavra = "Armonia";
        int posicao = 9;

        try {
            System.out.println("O resultado da divisão é : "+Dividir(dividendo, divisor));
            System.out.println("Foi armazenado a palavra:  " + Armazenar(palavra, posicao));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Programa salvo e finalizado");
        }

    }

    public static double Dividir(double dividendo, double divisor) throws ArithmeticException{
        if(divisor==0){
        throw new ArithmeticException("Divisor zero");
        }else{
            return dividendo/divisor;
        }
    }
    public static String Armazenar(String palavra, int posicao) throws ArrayIndexOutOfBoundsException, Exception{
        String [] NovasPalavras = new String[10];
        if(posicao > NovasPalavras.length){
        throw new ArrayIndexOutOfBoundsException("Posição selecionada não existe.");
        }
        else{
            if(NovasPalavras[posicao]!=null){
            throw new Exception("Está posição já está preenchida");
            }
            NovasPalavras[posicao]=palavra;
            return NovasPalavras[posicao];
        }
    }

}
