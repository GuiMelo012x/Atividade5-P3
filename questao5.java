import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {
        // Faça um programa que exiba os números de 1 a 100, substituindo os múltiplos de 3 pela palavra "Fizz"
        // e os múltiplos de 5 pela palavra "Buzz". Para os números que são múltiplos de ambos, utilize a palavra "FizzBuzz".
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i <= 100;i++){
            if(i%3 == 0 && i%5 != 0){
                System.out.println("Fizz " + i);
            }
            if(i%5 == 0 && i%3 != 0){
                System.out.println("Buzz " + i);
            }
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz " + i);
            }
        }
    }
}