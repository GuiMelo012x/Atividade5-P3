import java.util.Scanner;
public class questao1 {
    public static void main(String[] args) {
        // Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior ou igual a 7).
        Scanner sc = new Scanner(System.in);
        int aprovado = 0;
        int reprovado = 0;
        for(int i = 0;i < 5;i++){
            double nota = sc.nextDouble();
            if(nota >= 7){
                aprovado++;
            }
            if(7 > nota){
                reprovado++;
            }
        }
        System.out.println(aprovado + " alunos foram aprovados e " + reprovado + " foram reprovados");
    }
}