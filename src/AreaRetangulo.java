import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Recebe a base do retângulo
        System.out.print("Digite o valor da base do retângulo: ");
        double base = scanner.nextDouble();

        // 2. Recebe a altura do retângulo
        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = scanner.nextDouble();

        // 3. Calcula a área (base x altura)
        double area = base * altura;

        // 4. Exibe o resultado na tela
        System.out.printf("A área do retângulo com base %.2f e altura %.2f é: %.2f\n", base, altura, area);

        scanner.close();
    }
}