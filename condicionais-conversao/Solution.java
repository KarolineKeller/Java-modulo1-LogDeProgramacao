public class Solution {

    public static double calcularPrecoEntrada(double[] dados) {
        double diaSemana = dados[0];
        double precoNormal = dados[1];
        double musicaAoVivo = dados[2];

        double precoFinal = precoNormal;

        // Aplicar desconto de 25% se for segunda, terça ou quinta-feira
        if (diaSemana == 1.0 || diaSemana == 2.0 || diaSemana == 4.0) {
            precoFinal = precoFinal - (precoFinal * 0.25);
        }

        // Aplicar acréscimo de 15% se for dia de música ao vivo
        if (musicaAoVivo == 1.0) {
            precoFinal = precoFinal + (precoFinal * 0.15);
        }

        // Arredondar para três casas decimais
        precoFinal = Math.round(precoFinal * 1000.0) / 1000.0;

        return precoFinal;
    }

    public static void main(String[] args) {
        // Teste com exemplos
        double[] dados1 = {3.0, 25.00, 2.0};
        System.out.println(calcularPrecoEntrada(dados1)); // Saída esperada: 25.000

        double[] dados2 = {4.0, 50.00, 1.0};
        System.out.println(calcularPrecoEntrada(dados2)); // Saída esperada: 43.125
    }
}
