/*12. Crie uma função recursiva que encontre o menor elemento de um array de inteiros.*/

public class Ex12 {
    public static void main(String[] args) {
        int [] A = new int[]{1,2,3,4};
        int C=A.length-1;

        System.out.println("O menor numero é o " +ProcurarMenor(A, C));
    }
    public static int ProcurarMenor(int[]A,int C){
        int menor=A[C];
        if(C == 0){
            return A[0];
        }
        int menorAnterior=ProcurarMenor(A, C-1);
        if (A[C] < menorAnterior) {
            return A[C];
        } 
        else {
            return menorAnterior;
        }
    
    }
}
