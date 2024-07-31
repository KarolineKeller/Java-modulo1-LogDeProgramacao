public class Solution {

    // Função para ordenar um array de inteiros
    public static int[] ordenarArray(int[] input) {
        int n = input.length;
        // Itera pelos elementos do array
        for (int i = 0; i < n - 1; i++) {
            // Itera pelos elementos não ordenados
            for (int j = 0; j < n - i - 1; j++) {
                // Se o elemento atual for maior que o próximo, inverta
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        // Retorna o array ordenado
        return input;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função ordenarArray
        int[] meusDados = {5, 2, 9, 1, 5, 6};

        // Chama a função para ordenar o array
        int[] dadosOrdenados = ordenarArray(meusDados);

        // Exibe o array ordenado
        System.out.print("Array ordenado: ");
        for (int i = 0; i < dadosOrdenados.length; i++) {
            System.out.print(dadosOrdenados[i] + " ");
        }
    }
}