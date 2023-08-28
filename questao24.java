import java.util.Scanner;
public class questao24 {
    public static void main(String[] args) {
        // Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
        // números são pares e quantos números são ímpares entre o primeiro e o último número digitado.
        // O programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.

        Scanner sc = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("Fim.");
                break;
            }
            if(n%2 == 0){
                par++;
            }else
                impar++;
        }
        System.out.println("Na sequência, existem " + par + " números pares e " + impar + " números ímpares." );
    }
}

