import java.util.Scanner;

public class ExercicioNegativos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int n = sc.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextInt();

            if (vet[i] < 0) {
                System.out.println("NUMEROS NEGATIVOS:" + vet[i]);
            }
        }  
        sc.close();
    }
}
