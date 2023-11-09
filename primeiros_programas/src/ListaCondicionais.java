import java.util.Scanner;

public class ListaCondicionais {

    public static void main(String[] args) {
        exercio1();

        exercio2();

        exercio3();

        exercio4();

        exercio5();

        exercio6();

        exercio7();

        exercio8();
    }

    public static void exercio1() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }

        sc.close();
    }

    public static void exercio2() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }

    public static void exercio3() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }

    public static void exercio4() {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        
        int duracao ;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
            
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }

    public static void exercio5() {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 2:
                total = quantidade * 4.50;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 3:
                total = quantidade * 5.00;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 4:
                total = quantidade * 2.00;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 5:
                total = quantidade * 1.50;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            default:
                break;
        }
        
        sc.close();
        
        // if (codigo == 1) {
        //     total = quantidade * 4.00;
        // } else if (codigo == 2) {
        //     total = quantidade * 4.50;
        // } else if (codigo == 3) {
        //     total = quantidade * 5.00;
        // } else if (codigo == 4) {
        //     total = quantidade * 2.00;
        // } else {
        //     total = quantidade * 1.50;
        // }
    }

    public static void exercio6(){
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo [25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo [50,75]");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora de intervalo");    
        }

        sc.close();
    }

    public static void exercio7() {
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
    
        } else if(x < 0 && y < 0){
            System.out.println("Q3");
        } else if(x < 0 && y > 0){
            System.out.println("Q2");
        } else if(x > 0 && y < 0){
            System.out.println("Q4");
        } else {
            System.out.println("Q1");
        }

        sc.close();
    }

    public static void exercio8() {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        if (salario < 2000) {
            imposto = 0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            
        }

        System.out.println("R$ " + imposto);

        sc.close();

    }
}