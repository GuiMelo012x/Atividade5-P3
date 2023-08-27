import java.util.Scanner;
public class questao19 {
    public static void main(String[] args) {
        // Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
        // números são divisíveis por 2, quantos são divisíveis por 3 e quantos são divisíveis por 5. O
        // programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int divisivel2 = 0;
        int divisivel3 = 0;
        int divisivel5 = 0;
        while(true){
            int n = sc.nextInt();
            if(n == 0 || 0 > n){
                System.out.println("Fim");
                break;
            }
            if(n%2 == 0){
                divisivel2++;
            }
            if(n%3 == 0){
                divisivel3++;
            }
            if(n%5 == 0){
                divisivel5++;
            }
        }
        System.out.println("Divisíveis por 2: " + divisivel2);
        System.out.println("Divisíveis por 3: " + divisivel3);
        System.out.println("Divisíveis por 5: " + divisivel5);
    }
}