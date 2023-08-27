import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        // Faça um programa que exiba a soma dos dígitos de um número inteiro fornecido pelo usuário.
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int soma = 0;
        int numeroOriginal = numero;
        while (numero > 0) {
            int digito = numero % 10;
            soma += digito;
            numero = numero/10;
        }
        System.out.println("A soma dos dígitos de " + numeroOriginal + " é: " + soma);
    }
}
