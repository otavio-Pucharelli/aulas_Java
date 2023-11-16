import java.util.Scanner;

public class ExercicioAlturas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int n = sc.nextInt();
        
        String[] nomes = new String[n];
        double[] alturas = new double[n];
        int[] idades = new int[n];
        double somaAltura = 0;
        double alturaMedia;
        
        int somaIdadesMenorDezeseis = 0;
        double porcentagemIdadesMenorDezeseis = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = sc.next();
            System.out.println("Digite a altura da pessoa " + (i + 1) + ":");
            alturas[i] = sc.nextDouble();
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idades[i] = sc.nextInt();
            somaAltura += alturas[i];
        }

        for( int x : idades) {
            if (x < 16){
                somaIdadesMenorDezeseis += x;
            } 
        }

        alturaMedia = somaAltura / n;
        porcentagemIdadesMenorDezeseis = (double)(somaIdadesMenorDezeseis / n) / 100;

        System.out.println("Altura média: " + alturaMedia);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagemIdadesMenorDezeseis + "%");

        for (int x: idades) {
            if (x < 16) {
                System.out.println("Nome: " + nomes[x]);
            }
        }
        sc.close();        
    }
}
