import java.util.Scanner;

public class ExercioFor {
    public static void main(String[] args) {
        exercio1();

        exercio2();

        exercio3();

        exercio4();

        exercio5();

        exercio6();

        exercio7();
    }

    public static void exercio1() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    public static void exercio2() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int counterIn = 0;
        int counterOut = 0; 

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if(x >= 10 && x <= 20) {
                counterIn++;
            } else {
                counterOut++;
            }
        }

        System.out.println(counterIn + " in");
        System.out.println(counterOut + " out");

        sc.close();
    }

    public static void exercio3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double a;
        double b;
        double c;

        for(int i =0; i < n; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }

    public static void exercio4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if(b == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = a / b;
                System.out.printf("%.1f%n", divisao);
            }

        }
        sc.close();
    }

    public static void exercio5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fatorial = 1;

        for(int i = 1 ; i < n; i++) {
            fatorial *= i;
        }
        
        System.out.println(fatorial);

        sc.close(); 
    }

    public static void exercio6() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    public static void exercio7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
           System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
        }

        sc.close();
    }

}
