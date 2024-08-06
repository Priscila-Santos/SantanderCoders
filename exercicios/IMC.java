package exercicios;

import java.util.Scanner;

public class IMC {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Informe sua altura em metros?");
            double altura = Double.parseDouble(entrada.nextLine());

            System.out.println("Informe seu peso em Kg?");
            double peso = Double.parseDouble(entrada.nextLine());

            double imc = peso/(altura*altura);
            String classificacaoDoIMC;

            if (imc < 17) {
                classificacaoDoIMC = "Muito abaixo do peso";
            }
            else if (imc >= 17 && imc < 18.49) {
                classificacaoDoIMC = "Abaixo do peso";
            }
            else if (imc >= 18.49 && imc < 24.99) {
                classificacaoDoIMC = "Peso normal";
            }
            else if (imc >= 25 && imc < 29.99) {
                classificacaoDoIMC = "Acima do peso";
            }
            else if (imc >= 30 && imc < 34.99) {
                classificacaoDoIMC = "Obesidade I";
            }
            else if (imc >= 35 && imc < 39.99) {
                classificacaoDoIMC = "Obesidade II (severa)";

            }
            else  {
                classificacaoDoIMC = "Obesidade III (mórbida)";
            }

            System.out.printf("O valor do seu IMC é %.2f (considerado %s)\n", imc, classificacaoDoIMC);
            entrada.close();
        }
    }
