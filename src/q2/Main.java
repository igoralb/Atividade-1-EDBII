package q2;

public class Main {
    public static int buscaBinaria(int[] vetor, int x) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (vetor[meio] == x) {
                return meio;
            }

            if (vetor[meio] < x) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int x = 2;
        int indice = buscaBinaria(vetor, x);

        if (indice != -1) {
            System.out.println("O valor " + x + " foi encontrado no índice " + indice);
        } else {
            System.out.println("O valor " + x + " não foi encontrado no vetor.");
        }
    }
}

