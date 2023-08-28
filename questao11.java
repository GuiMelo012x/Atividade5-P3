import java.util.Scanner;
public class questao11 {
    public static void main(String[] args) {
        // Crie um programa que leia uma sequência de números inteiros do usuário e exiba o maior e o
        // menor valor digitado. O programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int menor = 50000;
        int maior = 1;
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                System.out.println("Fim.");
                break;
            }
            if(n < menor){
                menor = n;
            }

            if(n > maior){
                maior = n;
            }
        }
        System.out.println("O menor valor digitado foi: " + menor);
        System.out.println("O maior valor digitado foi: " + maior);
    }
}
