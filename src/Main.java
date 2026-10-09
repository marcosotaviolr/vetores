import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algoritmo1();
        Algoritmo2();
        Algoritmo3();
        Algoritmo4();
        Algoritmo5();
        Algoritmo6();
        Algoritmo7();
        Algoritmo8();
        Algoritmo9();
        Algoritmo10();
        Algoritmo11();
        Algoritmo12();
        Algoritmo13();
        Algoritmo14();
        Algoritmo15();
        Algoritmo16();
        Algoritmo17();
        Algoritmo18();
        Algoritmo19();
        Algoritmo20();
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
            boolean isPrimo = true;
            if (numeros[i] < 2) {
                isPrimo = false;
            }

            for (int j = 2; j < numeros[i]; j++) {
                if (numeros[i] % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println("Número primo " + numeros[i] + " na posição " + i);
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

        System.out.println("Vetor resultante:");

        for (int i = 0; i < vetorResultante.length; i++) {
            System.out.print(vetorResultante[i] + " ");
        }
    }

    private static void Algoritmo3() {
        // Calcula a média de um vetor com 10 números
        Random random = new Random();

        int[] numeros = new int[10];
        int somaVetor = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
            somaVetor += numeros[i];
        }

        double mediaVetor = (double) somaVetor / 10;

        System.out.println("A média dos números do vetor é: " + mediaVetor);
    }

    private static void Algoritmo4() {
        // Verifica se o número 25 existe no vetor
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
        // Verifica se o número 20 existe e mostra seu índice
        Random random = new Random();

        int[] numeros = new int[15];
        boolean tem20 = false;
        int posicao20 = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 20) {
                tem20 = true;
                posicao20 = i;
                break;
            }
        }
        if (tem20) {
            System.out.println("O número 20 existe no vetor na posição: " + posicao20);
        } else {
            System.out.println("Não existe o número 20 no vetor");
        }
    }

    private static void Algoritmo6() {
        // Procura um valor e remove sua primeira ocorrência
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
                numeros[i] = 0;
                temNoVetor = true;
            }
        }
        if (temNoVetor) {
            System.out.println("O número " + numeroUsuario + " existe no vetor e foi removido");
        } else {
            System.out.println("Não existe o número " + numeroUsuario + " no vetor");
        }
    }

    private static void Algoritmo7() {
        // Encontra o maior e o menor valor de um vetor decimal
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5];
        double maiorNumero = -Double.MAX_VALUE;
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
        // Cria um vetor B com os elementos de A em ordem reversa
        Random random = new Random();

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(50) + 1;
        }
        for (int i = vetorA.length - 1, j = 0; j < vetorA.length; i--, j++) {
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
        // Armazena e imprime os números dos recibos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de recibos que deseja imprimir:");
        int totalRecibos = scanner.nextInt();
        int[] recibos = new int[totalRecibos];

        int posicao = 0;
        while (posicao < recibos.length) {
            recibos[posicao] = posicao + 1;
            posicao++;
        }

        int impressao = 0;
        while (impressao < recibos.length) {
            System.out.println("Recibo " + recibos[impressao]);
            impressao++;
        }
    }

    private static void Algoritmo10() {
        // Mostra a tabuada de um número até dez
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da tabuada:");
        int numero = scanner.nextInt();
        int[] tabuada = new int[10];

        for (int i = 1; i < tabuada.length; i++) {
            tabuada[i] = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada[i]);
        }
    }

    private static void Algoritmo11() {
        // Calcula a média de dez temperaturas
        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[10];
        double somaTemperaturas = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Informe a temperatura");
            temperaturas[i] = scanner.nextDouble();
            somaTemperaturas += temperaturas[i];
        }

        double mediaTemperaturas = somaTemperaturas / 10;

        System.out.println("A média das temperaturas é: " + mediaTemperaturas);
    }

    private static void Algoritmo12() {
        // Armazena e mostra os números pares de 1 a 50
        int[] numeros = new int[50];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Os números pares são: " + numeros[i]);
            }
        }
    }

    private static void Algoritmo13() {
        // Mostra os números primos menores ou iguais a
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numeroDigitado = scanner.nextInt();
        int[] primos = new int[numeroDigitado];
        int quantidadePrimos = 0;

        for (int i = 2; i <= numeroDigitado; i++) {
            boolean isPrimo = true;

            for (int divisor = 2; divisor < i; divisor++) {
                if (i % divisor == 0) {
                    isPrimo = false;
                }
            }

            if (isPrimo) {
                primos[quantidadePrimos] = i;
                quantidadePrimos++;
            }
        }

        System.out.println("Números primos até " + numeroDigitado + ":");
        for (int i = 0; i < quantidadePrimos; i++) {
            System.out.print(primos[i] + " ");
        }
    }

    private static void Algoritmo14() {
        // Calcula o tempo total somando a duração de cada etapa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de etapas de produção:");
        int quantidadeEtapas = scanner.nextInt();
        double[] tempos = new double[quantidadeEtapas];
        double tempoTotal = 0;

        for (int i = 0; i < tempos.length; i++) {
            System.out.println("Digite o tempo da etapa " + (i + 1) + ":");
            tempos[i] = scanner.nextDouble();
            tempoTotal += tempos[i];
        }

        System.out.println("Tempo total de produção: " + tempoTotal);
    }

    private static void Algoritmo15() {
        // Gera os N primeiros termos da sequência de Fibonacci
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos termos da sequência de Fibonacci deseja mostrar?");
        int n = scanner.nextInt();
        int[] fibonacci = new int[n];

        if (n > 0) {
            fibonacci[0] = 0;
        }

        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Sequência de Fibonacci:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    private static void Algoritmo16() {
        // Mostra cinco respostas na ordem inversa
        Scanner scanner = new Scanner(System.in);
        int[] respostas = new int[5];

        for (int i = 0; i < respostas.length; i++) {
            System.out.println("Digite a resposta do entrevistado " + (i + 1) + ":");
            respostas[i] = scanner.nextInt();
        }

        System.out.println("Respostas na ordem inversa:");
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.print(respostas[i] + " ");
        }
        System.out.println();
    }

    private static void Algoritmo17() {
        // Calcula a média das notas de dez alunos
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
        }

        double media = somaNotas / 10;
        System.out.println("Média das notas: " + media);
    }

    private static void Algoritmo18() {
        // Encontra a maior temperatura entre oito valores
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[8];
        double maiorTemperatura = -Double.MAX_VALUE;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Digite a temperatura " + (i + 1) + ":");
            temperaturas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }

        System.out.println("Maior temperatura: " + maiorTemperatura);
    }

    private static void Algoritmo19() {
        // Procura um código em um vetor predefinido
        Scanner scanner = new Scanner(System.in);
        int[] codigosProdutos = {101, 205, 310, 415, 520, 625};
        boolean encontrado = false;

        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();

        for (int i = 0; i < codigosProdutos.length; i++) {
            if (codigosProdutos[i] == codigo) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Código encontrado no vetor.");
        } else {
            System.out.println("Código não encontrado no vetor.");
        }
    }

    private static void Algoritmo20() {
        // Ordena os preços em ordem crescente
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[10];

        for (int i = 0; i < precos.length; i++) {
            System.out.println("Digite o preço do produto " + (i + 1) + ":");
            precos[i] = scanner.nextDouble();
        }

        for (int i = 0; i < precos.length - 1; i++) {
            for (int j = 0; j < precos.length - 1 - i; j++) {
                if (precos[j] > precos[j + 1]) {
                    double auxiliarTroca = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = auxiliarTroca;
                }
            }
        }
        System.out.println("Preços em ordem crescente:");
        for (int i = 0; i < precos.length; i++) {
            System.out.println(precos[i]);
        }
    }
}