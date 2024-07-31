public class Solution {

    // Função para calcular o salário de Pedrinho
    public static double calcularSalario(double[] dados) {
        // Extração dos valores do array
        int carrosVendidos = (int) dados[0];
        double valorTotalVendas = dados[1];
        double salarioFixo = dados[2];
        double valorPorCarro = dados[3];

        // Calcula a comissão de 5% sobre o valor total vendido
        double comissaoPercentual = 0.05 * valorTotalVendas;

        // Calcula a comissão fixa por cada carro vendido
        double comissaoPorCarro = carrosVendidos * valorPorCarro;

        // Calcula o salário total
        double salarioTotal = salarioFixo + comissaoPercentual + comissaoPorCarro;

        // Arredonda o salário total para duas casas decimais
        salarioTotal = Math.round(salarioTotal * 100.0) / 100.0;

        return salarioTotal;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função calcularSalario
        double[] dados = {10, 50000.0, 2000.0, 300.0};

        // Calcula o salário de Pedrinho
        double salario = calcularSalario(dados);

        // Exibe o salário de Pedrinho
        System.out.println(salario);
    }
}