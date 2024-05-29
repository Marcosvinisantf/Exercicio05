import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, esse programa irá ler o valor do seu salário\ne calcular quantos salarios mínimos você ganha,\nlembrando que o salário mínimo base é de R$ 1.293,20\nDigite o seu salario atual: ");
        float salario = sc.nextFloat();
        float salariomin = 1293;
        float qtndsalariomin = salariomin / salario;
        System.out.printf("Voce recebe:  + %.1f" + qtndsalariomin);
    }
}
