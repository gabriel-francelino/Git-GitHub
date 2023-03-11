public class Fatorial{
    // Versão iterativa do fatorial
    public int fat(int n) throws IllegalArgumentException{
        int resultado = 1;

        if (n < 0) {
            throw new IllegalArgumentException("Não existe fatorial para números negativos");
        }
        
        for(int i = 2; i <= n; i++){
            resultado*= i;
        }
        return resultado;
    }
}