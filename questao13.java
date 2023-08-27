import java.util.Scanner;
public class questao13 {
    public static void main(String[] args) {
        // Faça um programa que leia um número inteiro e exiba a soma dos seus dígitos elevados ao cubo utilizando o while.....
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma = 0;
        while (n > 0) {
            int digito = n % 10;
            soma = soma + (digito * digito * digito); // 3x pois está ao cubo.
            n = n/10;
        }
        System.out.println(soma);
    }
}