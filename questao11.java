import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        // Crie um programa que leia uma sequência de números inteiros do usuário e exiba o maior e o
        // menor valor digitado. O programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int d1 = 1;
        int d2 = 1;
        while (true) {
            d1 = sc.nextInt();
            if(d1 == 0){
                break;
            }
            d2 = sc.nextInt();
            if(d2 == 0){
                break;
            }
            if (d1 > d2) {
                System.out.println(d1 + " é maior que " + d2);
            } else if (d1 == d2) {
                System.out.println(d1 + " é igual a " + d2);
            } else
                System.out.println(d2 + " é maior que " + d1);
        }
    }
}