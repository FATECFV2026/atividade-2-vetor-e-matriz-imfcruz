import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // TODO: Implementar menu interativo com as seguintes opcoes:
        // 1. Exercicio 01: Progressao Geometrica
        // 2. Exercicio 02: Sequencia Decrescente
        // 3. Exercicio 03: Vetor Dinamico
        // 4. Exercicio 04: Sequencia Crescente com Soma
        // 5. Exercicio 05: Matriz com Valores Incrementais
        // 6. Exercicio 06: Operacao entre Matrizes
        // 0. Sair

        // Utilize o método lerValor para validação de entrada
        // Exiba os resultados utilizando Arrays.toString() para vetores
        // Para matrizes, utilize o método exibirMatriz()
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while(opcao != 0) {
            System.out.println("\n=== MENU DE EXERCICIOS ===");
            System.out.println("1. Exercicio 01: Progressao Geometrica");
            System.out.println("2. Exercicio 02: Sequencia Decrescente");
            System.out.println("3. Exercicio 03: Vetor Dinamico");
            System.out.println("4. Exercicio 04: Sequencia Crescente com Soma");
            System.out.println("5. Exercicio 05: Matriz Incremental");
            System.out.println("6. Exercicio 06: Soma de Matrizes");
            System.out.println("0. Sair");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    int[] res1 = ex01();
                    if(res1 != null) {
                        System.out.println("Resultado: " + Arrays.toString(res1));
                    } else {
                        System.out.println("Valor invalido!");
                    }
                    break;

                case 2:
                    int[] res2 = ex02();
                    if(res2 != null) {
                        System.out.println("Resultado: " + Arrays.toString(res2));
                    } else {
                        System.out.println("Valor invalido!");
                    }
                    break;

                case 3:
                    int[] res3 = ex03();
                    if(res3 != null) {
                        System.out.println("Resultado: " + Arrays.toString(res3));
                    } else {
                        System.out.println("Tamanho invalido!");
                    }
                    break;

                case 4:
                    int[] res4 = ex04();
                    System.out.println("Vetor: " + Arrays.toString(res4));
                    System.out.println("Soma dos elementos: " + calcularSoma(res4));
                    break;

                case 5:
                    int[][] res5 = ex05();
                    System.out.println("Matriz:");
                    exibirMatriz(res5);
                    break;

                case 6:
                    int[][][] res6 = ex06();
                    System.out.println("Matriz N:");
                    exibirMatriz(res6[0]);
                    System.out.println("Matriz Z:");
                    exibirMatriz(res6[1]);
                    System.out.println("Matriz Soma (N+Z):");
                    exibirMatriz(res6[2]);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        }
        sc.close();
    }

    /**
     * Metodo auxiliar para ler e validar entrada do usuario
     * @param scanner Scanner para leitura
     * @param mensagem Mensagem a ser exibida
     * @param min Valor minimo (exclusivo)
     * @param max Valor maximo (inclusivo)
     * @return Valor valido lido
     */
    private static int lerValor(Scanner scanner, String mensagem, int min, int max) {
        // TODO: Implementar validacao de entrada
        // Deve repetir a leitura ate que o valor seja valido (min < valor <= max)
        int valor;
        while(true) {
            System.out.print(mensagem);
            valor = scanner.nextInt();
            if(valor > min && valor <= max) {
                break;
            }
            System.out.println("Valor invalido! Digite um valor entre " + (min+1) + " e " + max);
        }
        return valor;
    }

    /**
     * Metodo auxiliar para exibir matriz formatada
     * @param matriz Matriz a ser exibida
     */
    private static void exibirMatriz(int[][] matriz) {
        // TODO: Implementar exibicao da matriz
        // Use System.out.printf("%4d ", matriz[i][j]) para formatacao
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Exercicio 01: Progressao Geometrica
     * @param valorInicial Valor inicial (deve ser <= 20)
     * @return Vetor de 10 elementos com progressao geometrica (dobro) ou null se invalido
     */
    public static int[] progressaoGeometrica(int valorInicial) {
        // TODO: Implementar progressao geometrica
        // Validar se valorInicial <= 20 (retornar null se invalido)
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] * 2
        if(valorInicial > 20) {
            return null;
        }

        int[] pg = new int[10];
        pg[0] = valorInicial;

        for(int i = 1; i < 10; i++) {
            pg[i] = pg[i-1] * 2;
        }
        return pg;
    }

    /**
     * Exercicio 02: Sequencia Decrescente
     * @param valorInicial Valor inicial (deve ser > 1)
     * @return Vetor de 10 elementos com sequencia decrescente ou null se invalido
     */
    public static int[] sequenciaDecrescente(int valorInicial) {
        // TODO: Implementar sequencia decrescente
        // Validar se valorInicial > 1 (retornar null se invalido)
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] - 1
        if(valorInicial <= 1) {
            return null;
        }

        int[] seq = new int[10];
        seq[0] = valorInicial;

        for(int i = 1; i < 10; i++) {
            seq[i] = seq[i-1] - 1;
        }
        return seq;
    }

    /**
     * Exercicio 03: Vetor Dinamico
     * @param tamanho Tamanho do vetor (deve ser <= 1000)
     * @return Vetor com sequencia de 1 ate tamanho ou null se invalido
     */
    public static int[] vetorDinamico(int tamanho) {
        // TODO: Implementar vetor dinamico
        // Validar se tamanho <= 1000 (retornar null se invalido)
        // Criar vetor com tamanho especifico
        // Para i=0 ate tamanho-1: vetor[i] = i + 1
        if(tamanho <= 0 || tamanho > 1000) {
            return null;
        }

        int[] v = new int[tamanho];
        for(int i = 0; i < tamanho; i++) {
            v[i] = i + 1;
        }
        return v;
    }

    /**
     * Exercicio 04: Sequencia Crescente com Soma
     * @param valorInicial Valor inicial
     * @return Vetor de 10 elementos com sequencia crescente
     */
    public static int[] sequenciaCresenteComSoma(int valorInicial) {
        // TODO: Implementar sequencia crescente
        // Criar vetor de 10 elementos
        // vetor[0] = valorInicial
        // Para i=1 ate 9: vetor[i] = vetor[i-1] + 1
        int[] seq = new int[10];
        seq[0] = valorInicial;

        for(int i = 1; i <= 9; i++) {  // usei <= 9 aqui, mesmo resultado
            seq[i] = seq[i-1] + 1;
        }
        return seq;
    }

    /**
     * Calcula a soma de todos os elementos do vetor
     * @param vetor Vetor para calcular a soma
     * @return Soma de todos os elementos
     */
    public static int calcularSoma(int[] vetor) {
        // TODO: Implementar calculo da soma
        // Percorrer o vetor e somar todos os elementos
        int total = 0;
        for(int i = 0; i < vetor.length; i++) {
            total = total + vetor[i]; // podia usar total += vetor[i] mas assim fica mais claro
        }
        return total;
    }

    /**
     * Exercicio 05: Matriz com Valores Incrementais
     * @param tamanho Tamanho da matriz quadrada
     * @return Matriz NxN com valores incrementais iniciando em tamanho+1
     */
    public static int[][] matrizIncrementais(int tamanho) {
        // TODO: Implementar matriz com valores incrementais
        // Criar matriz quadrada NxN
        // Contador inicial = tamanho + 1
        // Para cada posicao [i][j]: matriz[i][j] = contador++
        int[][] m = new int[tamanho][tamanho];
        int num = tamanho + 1;  // começa em tamanho+1 conforme o roteiro

        for(int i = 0; i < tamanho; i++) {
            for(int j = 0; j < tamanho; j++) {
                m[i][j] = num;
                num++;
            }
        }
        return m;
    }

    /**
     * Exercicio 06: Operacao entre Matrizes
     * @param tamanho Tamanho das matrizes quadradas
     * @return Array com 3 matrizes: [0]=N, [1]=Z, [2]=Soma
     */
    public static int[][][] operacaoEntreMatrizes(int tamanho) {
        // TODO: Implementar operacao entre matrizes
        // Criar 3 matrizes NxN: matrizN, matrizZ, matrizSoma
        // Contador inicial = tamanho + 1
        // Para cada posicao [i][j]:
        //   matrizN[i][j] = contador
        //   matrizZ[i][j] = contador (valores iguais)
        //   matrizSoma[i][j] = matrizN[i][j] + matrizZ[i][j]
        //   contador++
        // Retornar array com as 3 matrizes
        int[][] mN   = new int[tamanho][tamanho];
        int[][] mZ   = new int[tamanho][tamanho];
        int[][] soma = new int[tamanho][tamanho];

        int num = tamanho + 1;

        for(int i = 0; i < tamanho; i++) {
            for(int j = 0; j < tamanho; j++) {
                mN[i][j]   = num;
                mZ[i][j]   = num;  // mesmos valores que N
                soma[i][j] = mN[i][j] + mZ[i][j];
                num++;
            }
        }

        return new int[][][] { mN, mZ, soma };
    }

    // ========================================
    // METODOS REQUERIDOS PELO AUTOGRADER
    // NAO REMOVER - Necessarios para avaliacao automatica
    // ========================================

    /**
     * Metodo ex01 para compatibilidade com autograder
     * @return resultado do exercicio 01
     */
    public static int[] ex01() {
        // TODO: Implementar leitura de entrada e chamar progressaoGeometrica()
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        return progressaoGeometrica(valor);
    }

    /**
     * Metodo ex02 para compatibilidade com autograder
     * @return resultado do exercicio 02
     */
    public static int[] ex02() {
        // TODO: Implementar leitura de entrada e chamar sequenciaDecrescente()
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        return sequenciaDecrescente(valor);
    }

    /**
     * Metodo ex03 para compatibilidade com autograder
     * @return resultado do exercicio 03
     */
    public static int[] ex03() {
        // TODO: Implementar leitura de entrada e chamar vetorDinamico()
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return vetorDinamico(n);
    }

    /**
     * Metodo ex04 para compatibilidade com autograder
     * @return resultado do exercicio 04
     */
    public static int[] ex04() {
        // TODO: Implementar leitura de entrada e chamar sequenciaCresenteComSoma()
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        return sequenciaCresenteComSoma(valor);
    }

    /**
     * Metodo ex05 para compatibilidade com autograder
     * @return resultado do exercicio 05
     */
    public static int[][] ex05() {
        // TODO: Implementar leitura de entrada e chamar matrizIncrementais()
        Scanner sc = new Scanner(System.in);
        int tam = sc.nextInt();
        return matrizIncrementais(tam);
    }

    /**
     * Metodo ex06 pra compatibilidade com autograder
     * @return resultado do exercicio 06
     */
    public static int[][][] ex06() {
        // TODO: Implementar leitura de entrada e chamar operacaoEntreMatrizes()
        Scanner sc = new Scanner(System.in);
        int tam = sc.nextInt();
        return operacaoEntreMatrizes(tam);
    }
}