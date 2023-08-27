import java.util.Scanner;
public class questao9 {
    public static void main(String[] args) {
        // Faça um programa que calcule o produto dos números de 1 a 5 utilizando o while.
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int produto = 1;
        while (i <= 5){
            produto = produto * i;
            i++;
        }
        System.out.println(produto);
    }
}