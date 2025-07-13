/*9. Escreva uma função recursiva que implemente a busca binária em um vetor ordenado.*/
public class EX9 {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,6,7,8};
        int x = 2;
        int A = 0;
        int F = vetor.length-1;

        int resultado = procuraBinaria(vetor, x, A, F);
        if(resultado != -1){
            System.out.println("Contém armazenado");
        }
        else{
            System.out.println("Não encontrado.");
        }

    }   
        
        
    public static int procuraBinaria(int[] vetor, int x,int A, int F){
        if(A>F){
        return -1;
        }
        int meio =(A+F)/2;
        if(meio==x){
            return vetor[meio];     
        }else if(x>meio){
        return procuraBinaria(vetor, x, (meio+1), F);
        } else{
        return procuraBinaria(vetor, x, A, (meio-1));
        }
    }   
}
