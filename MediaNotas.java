import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");

        String nome = scanner.nextLine();
        System.out.print("Digite a primeira nota: ");

        int nota1 = scanner.nextInt();
        System.out.print("Digite a segunda nota: ");

        int nota2 = scanner.nextInt();
        System.out.print("Digite a terceira nota: ");

        int nota3 = scanner.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("O aluno %s teve a média %d", nome, media);

        
        if (media >= 7) {
            System.out.println(" e está aprovado");
        } else {
            System.out.println(" e está reprovado");
        }

        scanner.close();
    }
}