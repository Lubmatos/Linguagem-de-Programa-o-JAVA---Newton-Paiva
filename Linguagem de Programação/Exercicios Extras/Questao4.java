import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) throws Exception,ArrayIndexOutOfBoundsException,ArithmeticException {
        Scanner ler = new Scanner(System.in);
        int [] v = new int[10];
        System.out.println("informe os números do vetor");
        for(int i =0; i<v.length;i++){
            v[i] = ler.nextInt();
        }
        System.out.println("Informe a posição do divisor");
        int x = ler.nextInt();
        System.out.println("Informe a posição do dividendo");
        int y = ler.nextInt();
    
        if(v[y]==0){
            throw new ArithmeticException("Divisão por zero");
        }
        if(x<0||x>10||y<0|| y>=10){
            throw new ArrayIndexOutOfBoundsException("Não encontrada a Posição");
        }
        try {
            double Divisão = v[x]/ v[y];
            System.out.println("Resultado"+ Divisão);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Algo não deu certo, tente novamente");
        }
    }
}
