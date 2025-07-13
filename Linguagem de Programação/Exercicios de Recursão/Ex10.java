/*10. Escreva uma função recursiva que multiplique dois números inteiros a e b apenas utilizando somas sucessivas.*/
public class Ex10 {
    public static void main(String[] args) {
        int N1 = 4;
        int N2 = 3;

        System.out.println("Multiplicação dos dois resulta em: " + Multiplicando(N1, N2));
    }
    public static int Multiplicando(int N1, int N2){
        if(N2==0){
            return 0;
        }
        if(N2==1){
        return N1;
        }
        return N1+Multiplicando(N1, N2-1);
    }     

}
