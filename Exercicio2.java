import java.util.Scanner;

public class Exercicio2{

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do salario minimo: ");
        float salarioMinimo = sc.nextFloat();

        System.out.println("Digite a quantidade de quilowatt: ");
        float quilowatt = sc.nextFloat();

        double valorQW = salarioMinimo * 0.01;
        double valorPagar = valorQW * quilowatt;

        System.out.println("Valor por cada quilowatt consumido: R$" + valorQW);
        System.out.println("Valor total para pagar pela residencia: R$" + valorPagar);

        sc.close();

    }
}