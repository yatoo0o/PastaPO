import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        double altura, peso;
        double somaIdadePorTime;
        double somaIdadeTotal = 0;
        double somaAlturaTotal = 0;
        int contIdadeTotal = 0;
        int contPesoAcima80 = 0;
        int totalJogadores = 0;

        for (int time = 0; time < 5; time++) {
            somaIdadePorTime = 0;
            int contIdadePorTime = 0;
            int totalJogadoresPorTime = 0;

            System.out.println("TIME " + (time + 1) + ":");

            for (int i = 0; i < 11; i++) {
                System.out.println("Digite a idade do " + (i + 1) + "° jogador:");
                idade = sc.nextInt();
                somaIdadePorTime += idade;
                somaIdadeTotal += idade;

                System.out.println("Digite a altura do " + (i + 1) + "° jogador:");
                altura = sc.nextDouble();
                somaAlturaTotal += altura;

                System.out.println("Digite o peso do " + (i + 1) + "° jogador:");
                peso = sc.nextDouble();

                if (idade < 18) {
                    contIdadePorTime++;
                    contIdadeTotal++;
                }

                if (peso > 80) {
                    contPesoAcima80++;
                }

                totalJogadores++;
                totalJogadoresPorTime++;
            }

            double mediaIdadesPorTime = somaIdadePorTime / 2;
            System.out.println("A media de idades do time " + (time + 1) + " e: " + mediaIdadesPorTime);
        }

        double mediaAlturaTotal = somaAlturaTotal / totalJogadores;
        double porcentagemAcima80Kg = (totalJogadores > 0) ? (contPesoAcima80 / (double) totalJogadores) * 100 : 0;

        System.out.println("A quantidade total de jogadores com idade inferior a 18 anos e: " + contIdadeTotal);
        System.out.println("A media de alturas de todos os jogadores do campeonato e: " + mediaAlturaTotal);
        System.out.println("A porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato e: " + porcentagemAcima80Kg + "%");

        sc.close();
    }
}
