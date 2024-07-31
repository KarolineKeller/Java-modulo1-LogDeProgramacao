public class Solution {

    // Função para contar e retornar a quantidade de pares e ímpares
    public static String contarParImpar(int[] numeros) {
        int contagemPares = 0;
        int contagemImpares = 0;

        // Itera sobre o array de números
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contagemPares++;
            } else {
                contagemImpares++;
            }
        }

        // Construção da string de resultado sem usar operador ternário
        String resultadoPares;
        if (contagemPares == 1) {
            resultadoPares = contagemPares + " par";
        } else {
            resultadoPares = contagemPares + " pares";
        }

        String resultadoImpares;
        if (contagemImpares == 1) {
            resultadoImpares = contagemImpares + " ímpar";
        } else {
            resultadoImpares = contagemImpares + " ímpares";
        }

        return resultadoPares + ", " + resultadoImpares;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função contarParImpar
        int[] numeros = {1, 2, 6};

        // Calcula a quantidade de pares e ímpares
        String resultado = contarParImpar(numeros);

        // Exibe o resultado
        System.out.println("Resultado: " + resultado);
    }
}