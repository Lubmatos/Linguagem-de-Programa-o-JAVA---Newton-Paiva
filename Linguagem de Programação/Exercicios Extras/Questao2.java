public class Questao2 {
    public static int SomaRec(int v[], int pos){
        if(pos == v.length-1){
            if ( v[pos]%2==0 && v[pos]<0){
                return v[pos];
            }
            else{
                return 0;
            }
        }
        if (v[pos]%2 == 0 && v[pos]<0){
            return v[pos]+ SomaRec(v, pos+1);
        }
        else{ 
            return SomaRec(v, pos+1);
        }
           
    }
}
