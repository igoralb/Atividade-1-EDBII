package q3;

public class Main {
    public static boolean verificaOrdenacao(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //int[] vetor = {1, 2, 3, 4, 5};
        int[] vetor = {5, 4, 3, 2, 1};

        if(verificaOrdenacao(vetor)== true) System.out.println("Vetor está ordenado ->" + verificaOrdenacao(vetor));

        if(verificaOrdenacao(vetor) == false) System.out.println("Vetor não está ordenado ->" + verificaOrdenacao(vetor));
    }
}
