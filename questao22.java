import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        //  Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
        //  dos números que estão entre 50 e 100. O programa deve parar de ler quando o usuário digitar o
        //  número 0 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int numeros = 0;
        int contador = 0;
        while (true){
            int n = sc.nextInt();
            if(n==0){
                System.out.println("Fim.");
                break;
            }
            if(n >= 50 && 100 > n){
                contador++;
                numeros += n;
            }
        }
        int media = numeros/contador;
        System.out.println("A média dos numeros entre 50 e 100 é " + media);
    }

}