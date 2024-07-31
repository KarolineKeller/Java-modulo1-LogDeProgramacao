public class Solution {

    // Função para calcular os percentuais do distribuidor e dos impostos
    public static double[] calcularPercentuais(double[] valores) {
        // Extrai os valores do array de entrada
        double precoFabrica = valores[0];
        double custoDistribuidor = valores[1];
        double precoImpostos = valores[2];

        // Calcula os percentuais
        double percentualDistribuidor = (custoDistribuidor / precoFabrica) * 100;
        double percentualImpostos = (precoImpostos / precoFabrica) * 100;

        // Arredonda os percentuais para 2 casas decimais
        percentualDistribuidor = Math.round(percentualDistribuidor * 100.0) / 100.0;
        percentualImpostos = Math.round(percentualImpostos * 100.0) / 100.0;

        // Retorna um array com os percentuais
        return new double[] {percentualDistribuidor, percentualImpostos};
    }

    public static void main(String[] args) {
        // Exemplo de uso da função calcularPercentuais
        double[] valores1 = {100000.00, 12000.00, 20000.00};
        double[] resultado1 = calcularPercentuais(valores1);
        System.out.println("Resultado: [" + resultado1[0] + ", " + resultado1[1] + "]");

        double[] valores2 = {115500.00, 25000.00, 32500.00};
        double[] resultado2 = calcularPercentuais(valores2);
        System.out.println("Resultado: [" + resultado2[0] + ", " + resultado2[1] + "]");
    }
}
