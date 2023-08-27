import java.util.Scanner;
public class questao16 {
    public static void main(String[] args) {
        // Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior ou igual a 7) utilizando o while.
        Scanner sc = new Scanner(System.in);
        int aprovado = 0;
        int reprovado = 0;
        int i = 0;
        while (i <  5){
            int nota = sc.nextInt();
            if(nota < 0){
                System.out.println("Fim.");
                break;
            }
            if(nota >= 7){
                aprovado++;
            }else
                reprovado++;
            i++;
        }
        System.out.println("Dos 5 alunos, " + aprovado + " foram aprovados e " + reprovado + " foram reprovados.");
    }
}