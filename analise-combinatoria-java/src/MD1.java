import java.util.Scanner;

public class MD1 {

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
                for (int i = 0; i < vetorSequencia.length; i++) {

                    System.out.print(vetorSequencia[i] + " ");

                }
                System.out.println();

                if (ProximoNumero(vetorSequencia, n) == false) {
                    break;
                }
            }
        }
    }
}
