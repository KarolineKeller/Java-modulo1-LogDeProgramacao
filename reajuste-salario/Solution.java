public class Solution {

    // Função para calcular o novo salário com base no tempo de serviço e inflação
    public static double calcularReajuste(double[] dados) {
        // Extração dos valores do array
        int tempoDeServico = (int) dados[0];
        double percentualInflacao = dados[1];
        double salarioAtual = dados[2];

        // Determina o percentual de reajuste com base no tempo de serviço
        double percentualReajuste;
        if (tempoDeServico < 1) {
            percentualReajuste = 0.0;
        } else if (tempoDeServico <= 5) {
            percentualReajuste = 1.0;
        } else if (tempoDeServico <= 10) {
            percentualReajuste = 1.5;
        } else {
            percentualReajuste = 2.0;
        }

        // Calcula o percentual total do reajuste (tempo de serviço + inflação)
        double percentualTotal = percentualReajuste + percentualInflacao;

        // Calcula o novo salário
        double novoSalario = salarioAtual * (1 + percentualTotal / 100.0);

        // Arredonda o novo salário para duas casas decimais
        novoSalario = Math.round(novoSalario * 100.0) / 100.0;

        return novoSalario;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função calcularReajuste
        double[] dados = {1, 5.0, 2000.0}; // Tempo de serviço, inflação, salário atual 

        // Calcula o novo salário do funcionário
        double novoSalario = calcularReajuste(dados);

        // Exibe o novo salário
        System.out.println(novoSalario); // Saída esperada: 2662.50
    }
}
