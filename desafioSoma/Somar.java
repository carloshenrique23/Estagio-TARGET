package desafioSoma;
public class Somar {

    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;     // Incrementa o valor de K em 1
            SOMA = SOMA + K;  // Adiciona o novo valor de K a SOMA
        }

        System.out.println("O valor final de SOMA é: " + SOMA);
    }
}
