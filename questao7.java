import java.util.Scanner;
public class questao7 {
    public static void main(String[] args) {
        // Faça um programa que leia um número inteiro e exiba o número invertido. Por exemplo, se o
        // número lido for 123, o programa deve exibir 321.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inverso = 0;
        while (n > 0){
            int digito = n%10;
            inverso = inverso * 10 + digito;
            n = n/10;
        }
        System.out.println(inverso);
    }
}