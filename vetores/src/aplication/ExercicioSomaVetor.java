import java.util.Scanner;

public class ExercicioSomaVetor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int n = sc.nextInt();
        double[] vet = new double[n];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            vet[i] = sc.nextInt();
            
            soma += vet[i];
            
        }
        
        media = soma / n;
       
        System.out.println("Valores:");
        for (int i = 0; i < n; i++) {
            System.out.println(vet[i]);
        }
        System.out.println("SOMA: " + soma);
        System.out.println("MEDIA: " + media);
        sc.close();
    }
}