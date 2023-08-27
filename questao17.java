import java.util.Scanner;
public class questao17 {
    public static void main(String[] args) {
        // Elabore um programa que leia uma sequência de números inteiros do usuário e determine
        // quantos números pares foram digitados antes do primeiro número ímpar. O programa deve parar
        // de ler quando o usuário digitar o número 0 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int par = 0;
        while (true){
            int n = sc.nextInt();
            if (n%2 == 0){
                par++;
            }else
                break;
        }
        System.out.println("Foram digitados " + par + " números pares.");
    }
}