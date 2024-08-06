package exercicios;

import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        int numero = input.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        System.out.println(" A soma do número com seus antecessores é: " + soma);

        input.close();
    }
}
