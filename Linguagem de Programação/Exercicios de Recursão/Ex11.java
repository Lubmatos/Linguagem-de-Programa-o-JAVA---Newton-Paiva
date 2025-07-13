/*11. Escreva uma função recursiva que conte quantas vezes um determinado número aparece em um array.*/

public class Ex11 {
    public static void main(String[] args) {
        int [] Array = new int[]{1,2,2,2,5,6,7};
        int inicio = 0;
        int x = 0;
        
        System.out.println("Numero encontrado " +contagem(Array, x, inicio) + " Vezes");
        
    }

    public static int contagem(int [] Array,int x,int inicio){
        int C=0;
        if(inicio>=Array.length){
            return 0;
        }
        if(Array[inicio]==x){
        C=1;
        }
        return C+contagem(Array, x, inicio+1);
    }
}
