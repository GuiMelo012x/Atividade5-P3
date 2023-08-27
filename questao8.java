import java.util.Scanner;
public class questao8 {
    public static void main(String[] args) {
        // Elabore um programa que calcule a soma dos números de 1 a 100 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int soma = 0;
        while (i <= 100){
            soma = soma + i;
            i++;
        }
        System.out.println(soma);
    }
}