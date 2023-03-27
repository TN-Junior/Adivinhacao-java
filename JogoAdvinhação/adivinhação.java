import java.util.Random;
import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // número aleatório entre 0 e 100
        int tentativas = 0;
        int palpite = -1;

        System.out.println("Bem-vindo ao jogo de adivinhação de números!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");

        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Seu palpite é muito baixo. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite é muito alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
            }
        }

        scanner.close();
    }

}
