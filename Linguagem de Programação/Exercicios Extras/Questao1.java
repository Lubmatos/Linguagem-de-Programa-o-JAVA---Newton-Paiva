public class Questao1 {
    public static int somaVetor(int v[]){
        int soma = 0;
        for(int i = 0; i <v.length;i++){
            if(v[i]%2==0 && v[i]<0){
            soma+=v[i];
            }    
        }
        return soma;
    }
}
