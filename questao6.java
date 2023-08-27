import java.util.Scanner;
public class questao6 {
    public static void main(String[] args) {
        // Elabore um programa que leia um número inteiro e exiba a soma dos dígitos pares desse número.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int somaPar = 0;
        while (n > 0) {
            int digito = n % 10;
            if (digito % 2 == 0) {
                somaPar += digito;
            }
            n= n/10;
        }
        System.out.println("A soma dos dígitos pares do número é: " + somaPar);
    }
}
