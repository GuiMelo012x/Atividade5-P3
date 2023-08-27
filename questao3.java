import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
        // Elabore um programa que leia um número inteiro e exiba todos os seus divisores.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i < n;i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
}