import java.util.Scanner;

public class MD2 {

   static void confereImprime(int vetor[], int r) {
        boolean repetiu = false;
        int y = vetor.length - 1;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++, y--) {
                if (vetor[i] == vetor[j] && i != j) { 
                    repetiu = true;
                    break;
                }
            }
        }
        if (repetiu == false) {
            for (int k = 0; k < vetor.length; k++) {
                if (repetiu == false) {
                    System.out.print(vetor[k] + " ");
                }
            }
            System.out.println("");
        }
    }
    static boolean ProximoNumero(int vetorSequencia[], int n) {

        int x = vetorSequencia.length - 1;
        while (vetorSequencia[x] == n) {
            x--;
            if (x < 0) {
                break;
            }
        }

        if (x < 0) {
            return false;
        }

        vetorSequencia[x]++;
        for (int i = x + 1; i < vetorSequencia.length; i++) {
            vetorSequencia[i] = 1;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o 'r' e o 'n' respectivamente (dê um espaço para separá-los): ");
        String numeros = sc.nextLine();
        String[] vetNumeros = numeros.split(" ");

        int r = Integer.parseInt(vetNumeros[0]);
        int n = Integer.parseInt(vetNumeros[1]);

        if (r > 10 || r < 2 || n < 1 || n > 20) {
            System.out.println("Erro");
        } else {
            System.out.println("--------------------\n");
            int[] vetorSequencia = new int[r];

            for (int i = 0; i < vetorSequencia.length; i++) {
                vetorSequencia[i] = 1;
            }

            while (true) {

                confereImprime(vetorSequencia,r);

                if (ProximoNumero(vetorSequencia, n) == false) {
                    break;
                }
            }
        }
    }
}
