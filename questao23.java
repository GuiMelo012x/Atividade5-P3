import java.util.Scanner;
public class questao23 {
    public static void main(String[] args) {
        // Elabore um programa que leia uma sequência de números inteiros do usuário e exiba o menor
        // valor digitado que seja positivo e ímpar. O programa deve parar de ler quando o usuário digitar o
        // número 0 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int menor = 50000;
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                System.out.println("Fim.");
                break;
            }
            if(n > 0 && n%2 != 0){
                if(n < menor){
                    menor = n;
                }
            }
        }
        System.out.println("O menor valor digitado positivo e ímpar é: " + menor);
    }
}