import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };
        String jogador1, jogador2;
        int linha, coluna;
        char simboloAtual = 'X';
        boolean jogoEmAndamento = true;

        System.out.println("Bem-vindo ao Jogo da Velha!");
        System.out.print("Digite o nome do Jogador 1 (X): ");
        jogador1 = scanner.nextLine();
        System.out.print("Digite o nome do Jogador 2 (O): ");
        jogador2 = scanner.nextLine();

        while (jogoEmAndamento) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Vez de " + (simboloAtual == 'X' ? jogador1 : jogador2));
            System.out.print("Digite sua jogada (linha,coluna): ");
            String entrada = scanner.nextLine();

            if (entrada.matches("\\d+,\\d+")) {
                String[] partes = entrada.split(",");
                try {
                    linha = Integer.parseInt(partes[0].trim());
                    coluna = Integer.parseInt(partes[1].trim());

                    if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                        if (tabuleiro[linha][coluna] == '_') {
                            tabuleiro[linha][coluna] = simboloAtual;
                            if (verificarVencedor(tabuleiro, simboloAtual)) {
                                exibirTabuleiro(tabuleiro);
                                System.out.println("O vencedor é " + (simboloAtual == 'X' ? jogador1 : jogador2) + "!");
                                jogoEmAndamento = false;
                            } else if (verificarEmpate(tabuleiro)) {
                                exibirTabuleiro(tabuleiro);
                                System.out.println("Empate!");
                                jogoEmAndamento = false;
                            } else {
                                simboloAtual = (simboloAtual == 'X') ? 'O' : 'X';
                            }
                        } else {
                            System.out.println("Posição já ocupada, tente novamente.");
                        }
                    } else {
                        System.out.println("Entrada inválida, tente novamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida, tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida, tente novamente.");
            }
        }
        scanner.close();
    }

    private static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean verificarVencedor(char[][] tabuleiro, char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo)
                return true;
            if (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo)
                return true;
        }
        if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo)
            return true;
        if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo)
            return true;
        return false;
    }

    private static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '_')
                    return false;
            }
        }
        return true;
    }
}
