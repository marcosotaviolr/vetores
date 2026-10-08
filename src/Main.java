import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Algoritmo1();
        // Algoritmo2();
        // Algoritmo3();
        // Algoritmo4();
        // Algoritmo5();
        // Algoritmo6(); --
        // Algoritmo7();
        // Algoritmo8();
    }

    private static void Algoritmo1() {
        // Lê 10 inteiros e mostra os que são primos, com suas posições
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            boolean isPrimo = true;

            if (numero < 2) {
                isPrimo = false;
            }

            for (int j = 2; j < numero; j++) {
                if (numero % j == 0) {
                    isPrimo = false;
                }
            }

            if (isPrimo) {
                System.out.println("Número primo " + numero + " na posição " + i);
            }
        }
    }

    private static void Algoritmo2() {
        // intercala 2 vetores em um vetor resultante
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorResultante = new int[20];

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um número para o vetor 1:");
            vetor1[i] = scanner.nextInt();
            System.out.println("Informe um número para o vetor 2:");
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorResultante[i * 2] = vetor1[i];
            vetorResultante[i * 2 + 1] = vetor2[i];
        }

        for (int i = 0; i < vetorResultante.length; i++) {
            System.out.print("Vetor resultante: " + vetorResultante[i]);
        }
    }

    private static void Algoritmo3() {
        // Calcula a média de um vetor com 10 números
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int somaVetor = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe um número:");
            numeros[i] = scanner.nextInt();

            somaVetor += numeros[i];
        }

        double mediaVetor = (double) somaVetor / 10;

        System.out.println("A média dos números do vetor é: " + mediaVetor);
    }

    private static void Algoritmo4() {
        Random random = new Random();

        int[] numeros = new int[20];
        boolean tem25 = false;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(30) + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 25) {
                tem25 = true;
            }
        }
        if (tem25) {
            System.out.println("O número 25 existe no vetor");
        } else {
            System.out.println("Não existe o número 25 no vetor");
        }
    }

    private static void Algoritmo5() {
        Random random = new Random();

        int[] numeros = new int[15];
        boolean tem20 = false;
        int posicao20 = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 25) {
                tem20 = true;
                posicao20 = i;
            }
        }
        if (tem20) {
            System.out.println("O número 20 existe no vetor na posição: " + posicao20);
        } else {
            System.out.println("Não existe o número 20 no vetor");
        }
    }

    private static void Algoritmo6() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[30];
        boolean temNoVetor = false;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.println("Digite um número para saber se existe no vetor e remove-lo");
        int numeroUsuario = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroUsuario) {
                temNoVetor = true;
            }
        }
        if (temNoVetor) {
            System.out.println("O número " + numeroUsuario + " existe no vetor");
        } else {
            System.out.println("Não existe o número " + numeroUsuario + " no vetor");
        }
    }

    private static void Algoritmo7() {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5];
        double maiorNumero = Double.MIN_VALUE;
        double menorNumero = Double.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número decimal: ");
            numeros[i] = scanner.nextDouble();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
        }

        System.out.println("Menor número: " + menorNumero);
        System.out.println("Maior número: " + maiorNumero);
    }

    private static void Algoritmo8() {
        Random random = new Random();

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(50) + 1;
        }
        for (int i = vetorA.length - 1, j = 0; j < vetorA.length ; i--, j++) {
            vetorB[i] = vetorA[j];
        }
        System.out.println("VetorA");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");
        System.out.println("VetorB");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }

    private static void Algoritmo9() {

    }
}