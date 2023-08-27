import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        // Crie um programa que leia uma sequência de números inteiros do usuário e exiba quantos
        // números pares e quantos números ímpares foram digitados. O programa deve parar de ler quando
        // o usuário digitar o número 0 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        while (true){
            int n = sc.nextInt();
            if (n == 0){
                System.out.println("Fim.");
                break;
            }
            if(n%2 == 0){
                par++;
            }else
                impar++;
        }
        System.out.println("Foram digitados " + par + " números pares e " + impar + " números ímpares.");
    }
}