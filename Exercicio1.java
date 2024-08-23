import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas horas foram trabalhadas: ");
        float horas = sc.nextFloat();

        System.out.println("Digite o valor da hora trabalhada: ");
        float valorHora = sc.nextFloat();

        float valorBruto = horas * valorHora;
  
        System.out.println("Valor bruto a receber do trabalho: R$"+ valorBruto);
        
        double valorImposto = 0.30 * valorBruto;

        System.out.println("Valor do imposto a ser pago: R$" + valorImposto);
        System.out.println("Salario reajustado: R$" + (valorBruto - valorImposto));

        sc.close();
    }
}
