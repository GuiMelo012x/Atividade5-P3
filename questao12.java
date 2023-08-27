import java.util.Scanner;
public class questao12 {
    public static void main(String[] args) {
        // Crie um programa que leia uma sequência de números inteiros do usuário e exiba a média dos
        // números digitados. O programa deve parar de ler quando o usuário digitar o número -1 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int n1 = 1;
        int n2 = 1;
        int n3 = 1;

        while (true){
            n1 = sc.nextInt();
            if (n1 == -1){
                System.out.println("Encerrando.");
                break;
            }
            n2 = sc.nextInt();
            if (n2 == -1){
                System.out.println("Encerrando.");
                break;
            }
            n3 = sc.nextInt();
            if (n3 == -1){
                System.out.println("Encerrando.");
                break;
            }
            int media = (n1+n2+n3)/3;
            System.out.println("A média dos 3 números é " + media);
        }
    }
}