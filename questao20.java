import java.util.Scanner;
public class questao20 {
    public static void main(String[] args) {
        // Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
        // dos números divisíveis por 3. O programa deve parar de ler quando o usuário digitar o número 0
        // utilizando o while.
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int div = 0;
        while (true){
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("Fim.");
                break;
            }
            if (n%3 == 0){
                contador++;
                div += n;
            }
        }
        int media = div/contador;
        System.out.println("A média destes números divisíveis por 3 é " + media);
    }
}