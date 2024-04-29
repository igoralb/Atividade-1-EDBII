package q1;

public class Main {
        public static int busca(int[] vetor, int x, int indice) {
            if (indice >= vetor.length) {
                return -1;
            } else if (vetor[indice] == x) {
                return indice;
            } else {
                return busca(vetor, x, indice + 1);
            }
        }

        public static void main(String[] args) {
            int[] vetor = {1, 3, 5, 7, 9, 11};
            int x = 1;
            int indice = busca(vetor, x, 0);

            if (indice != -1) {
                System.out.println("O valor " + x + " foi encontrado no índice " + indice);
            } else {
                System.out.println("O valor " + x + " não foi encontrado no vetor.");
            }
        }
    }