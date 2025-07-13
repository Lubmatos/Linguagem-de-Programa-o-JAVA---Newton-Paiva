/*13. Implemente uma função recursiva para verificar se um número N é primo.*/


public class Ex13 {
    public static void main(String[] args) {
        System.out.println("O número 16 é primo?" + isPrimo(16));
    }
    public static boolean isPrimo(int n){
        if (n<=1){
            return false;
        }
        if(n<=3){
        return true;
        }
        if(n%2==0 || n%3==0){
        return false;
        }
        return isPrimoRecursivo(n,5);
        
    }
    public static boolean isPrimoRecursivo(int n, int divisor){
        if(divisor*divisor>n){
        return true;
        }
        if(n%divisor == 0 || n%(divisor+2)==0){
        return false;
        }
        return isPrimoRecursivo(n, divisor+6);
    }
}
