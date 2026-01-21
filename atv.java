import java.util.Scanner;

public class atv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Bem-vindo ao Programa de Treinamento!");
        System.out.println("======================================");

        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Quantos anos você tem? ");
        int idade = scanner.nextInt();

        System.out.println("Escolha seu objetivo:");
        System.out.println("1 - Ganho de Massa (Bulking)");
        System.out.println("2 - Perda de Peso (Corte)");
        int objetivo = scanner.nextInt();

        System.out.println("O que você deseja receber?");
        System.out.println("A - Exercícios + Dieta");
        System.out.println("B - Somente Exercícios");
        scanner.nextLine();
        char opcao = scanner.nextLine().charAt(0);

        int dias;
        do {
            System.out.print("Quantos dias você vai treinar por semana (1 a 6)? ");
            dias = scanner.nextInt();
        } while (dias < 1 || dias > 6);

        System.out.println("\n=======FICHA=======");
        System.out.println("Nome: " + nome.toUpperCase());
        if (objetivo == 1) {
            System.out.println("Objetivo: Ganho de Massa (Bulking)");
        } else {
            System.out.println("Objetivo: Perda de Peso (Corte)");
        }
        System.out.println("Carga horária semanal: " + dias + " horas");
    }
}
