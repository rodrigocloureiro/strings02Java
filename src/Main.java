/*
    2-) Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em  uma variável inteira),
    imprima cada um dos seus dígitos por extenso.

    Exemplo:  Entre o número: 4571  Resultado: quatro, cinco, sete, um

    Crie uma Classe Utilitaria para ter o método que retorna essa String.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();
        Utilitaria.porExtenso(numero);
    }
}
