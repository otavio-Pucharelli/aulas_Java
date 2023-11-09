import java.util.Scanner;

public class ListaLogica {
    public static void main(String[] args) {

        exercio1();

        exercio2();

        exercio3();

        exercio4();

        exercio5();
    }

    public static void exercio1() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("a soma é: " + (x + y));

        sc.close();
    }

    public static void exercio2() {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;

        System.out.printf("A = %.4f%n", (pi * (raio * raio)));

        sc.close();
    }
    
    public static void exercio3() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("DIFERENÇA = " + ((a * b) - (c * d)));

        sc.close();
    }

    public static void exercio4() {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valor = sc.nextDouble();

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", (horas * valor));

        sc.close();
    }
    
    public static void exercio5() {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", ((a * c) / 2));
        System.out.printf("CIRCULO: %.3f%n", (3.14159 * (c * c)));
        System.out.printf("TRAPEZIO: %.3f%n", (((a + b) * c) / 2));
        System.out.printf("QUADRADO: %.3f%n", (b * b));
        System.out.printf("RETANGULO: %.3f%n", (a * b));

        sc.close();
    }
}
