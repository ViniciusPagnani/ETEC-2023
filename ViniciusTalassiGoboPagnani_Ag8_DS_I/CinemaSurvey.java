import java.util.Scanner;

public class CinemaSurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacidade = 40;
        int otimoCount = 0;
        int idadeRuimTotal = 0;
        int pessimoCount = 0;

        for (int i = 1; i <= capacidade; i++) {
            System.out.println("Resposta do espectador #" + i + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Opinião (A/B/C/D/E): ");
            char opiniao = scanner.next().charAt(0);

            if (opiniao == 'A') {
                otimoCount++;
            }

            if (opiniao == 'D') {
                idadeRuimTotal += idade;
            }

            if (opiniao == 'E') {
                pessimoCount++;
            }
        }

        // Calcular média de idade das pessoas que responderam "ruim"
        double mediaIdadeRuim = idadeRuimTotal / (double) (capacidade - otimoCount);

        // Calcular a porcentagem de respostas "péssimo"
        double porcentagemPessimo = (pessimoCount / (double) capacidade) * 100;

        System.out.println("Quantidade de respostas 'ótimo': " + otimoCount);
        System.out.println("Média de idade das pessoas que responderam 'ruim': " + mediaIdadeRuim);
        System.out.println("Porcentagem de respostas 'péssimo': " + porcentagemPessimo + "%");

        scanner.close();
    }
}
