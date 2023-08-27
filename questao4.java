import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {
        // Desenvolva um programa que calcule a média de altura de 5 pessoas.
        Scanner sc = new Scanner(System.in);
        double altura1 = sc.nextDouble();
        double altura2 = sc.nextDouble();
        double altura3 = sc.nextDouble();
        double altura4 = sc.nextDouble();
        double altura5 = sc.nextDouble();
        double alturaT = altura1 + altura2 + altura3 + altura4 + altura5;
        double media = alturaT/ 5;
        System.out.println("A média é " + media);
    }
}