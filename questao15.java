public class questao15 {
    public static void main(String[] args) {
        // Desenvolva um programa que exiba todos os múltiplos de 3 no intervalo de 1 a 50 utilizando o while.
        int i = 0;
        while (i <= 50){
            if(i%3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}