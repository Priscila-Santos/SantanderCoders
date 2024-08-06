package exercicios;

import java.util.Scanner;

public class SomaNumeros {

    // Enum para armazenar a soma dos antecessores
    public enum Soma {
        CALCULAR;

        public int calcularSoma(int numero) {
            int soma = 0;
            for (int i = 1; i <= numero; i++) {
                soma += i;
            }
            return soma;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que a usuária digite um número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int numero = Integer.parseInt(scanner.nextLine());

        // Calcula a soma do número com todos os seus antecessores positivos
        int soma = Soma.CALCULAR.calcularSoma(numero);

        // Exibe o resultado
        System.out.println("A soma de " + numero + " com todos os seus antecessores positivos é: " + soma);

        scanner.close();
    }
}
