public class Fatorial{
    // Versão iterativa do fatorial
    public int fat(int n){
        int resultado = 1;
        
        for(int i = 2; i <= n; i++){
            resultado*= i;
        }
        return resultado;
    }
}