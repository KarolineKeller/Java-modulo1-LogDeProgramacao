]public class Solution {

    // Função para calcular o valor final das frutas com base na quantidade
    public static double calcularValorFinal(int quantidade) {
        // Define os preços unitários
        double precoPromocional = 1.25;
        double precoNormal = 1.45;

        // Calcula o valor total
        double valorTotal;
        if (quantidade > 10) {
            valorTotal = quantidade * precoPromocional;
        } else {
            valorTotal = quantidade * precoNormal;
        }

        // Arredonda o valor total para 2 casas decimais
        valorTotal = Math.round(valorTotal * 100.0) / 100.0;

        return valorTotal;
    }

    public static void main(String[] args) {
        // Exemplos de uso da função calcularValorFinal
        int quantidade1 = 2;
        double resultado1 = calcularValorFinal(quantidade1);
        System.out.println("Valor final para " + quantidade1 + " frutas: " + resultado1);

        int quantidade2 = 12;
        double resultado2 = calcularValorFinal(quantidade2);
        System.out.println("Valor final para " + quantidade2 + " frutas: " + resultado2);
    }
}

