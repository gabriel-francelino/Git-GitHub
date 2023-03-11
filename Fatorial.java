public class Fatorial{
    // Versão iterativa do fatorial com teste para fatorial de 0
    public int fat(int n) throws IllegalArgumentException{    
        if (n < 0) {
            throw new IllegalArgumentException("Não existe fatorial para números negativos");
        }
        
        int resultado = 1;
        if (n !=0) {
            for(int i = 2; i <= n; i++){
                resultado*= i;
            }            
        }
        return resultado;
    }
}