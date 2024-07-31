public class Solution {

    public static String calcularDesconto(double[] precos) {
        // Calcula o valor total das peças sem desconto
        double valorTotalSemDesconto = 0.0;
        for (int i = 0; i < precos.length; i++) {
            valorTotalSemDesconto += precos[i];
        }

        // Calcula o valor do desconto
        double valorDesconto = 0.0;
        if (precos.length > 1) {
            double menorPreco = precos[0];
            for (int i = 1; i < precos.length; i++) {
                if (precos[i] < menorPreco) {
                    menorPreco = precos[i];
                }
            }
            valorDesconto = menorPreco * 0.5;
        }

        // Calcula o valor total a pagar
        double valorTotalComDesconto = valorTotalSemDesconto - valorDesconto;

        // Formata a saída
        return String.format("Valor total: %.2f | Valor de descontos: %.2f | Valor a pagar: %.2f",
                valorTotalSemDesconto, valorDesconto, valorTotalComDesconto);
    }

    public static void main(String[] args) {
        // Teste com exemplos
        double[] precos1 = {20.0, 40.0};
        System.out.println(calcularDesconto(precos1)); // Saída esperada: Valor total: 60.0 | Valor de descontos: 10.0 | Valor a pagar: 50.0

        double[] precos2 = {20.0, 40.0, 30.0};
        System.out.println(calcularDesconto(precos2)); // Saída esperada: Valor total: 90.0 | Valor de descontos: 10.0 | Valor a pagar: 80.0

        double[] precos3 = {20.0, 80.0, 60.0, 40.0};
        System.out.println(calcularDesconto(precos3)); // Saída esperada: Valor total: 200.0 | Valor de descontos: 10.0 | Valor a pagar: 190.0
    }
}
