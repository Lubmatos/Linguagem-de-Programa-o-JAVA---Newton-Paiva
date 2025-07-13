
public class Questao3 {
    public static void main(String[] args) {
        int [][] M = new int[5][5];
            for(int L = 0; L<=4;L++){
                for(int C = 0; C<=4;C++){
                if(L==C){
                M[L][C]=0;
                }
                else{
                    if(C>L){
                    M[L][C]=1;
                    }
                    else{
                    M[L][C]=-1;
                    }
                }
            }
        }

        for (int L = 0; L < M.length; L++) {
            for (int C = 0; C < M[L].length; C++) {
            System.out.print(M[L][C] + " ");
        }
            System.out.println(); // Adiciona quebra de linha após cada linha da matriz
        }
    }
}