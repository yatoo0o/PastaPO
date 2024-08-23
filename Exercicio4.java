import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valorTotal = 0.0;
        int codigo;
        
        do {
            System.out.println("Digite o codigo do produto desejado (codigos 1 - 40) DIGITE 0 PARA SAIR:");
            codigo = sc.nextInt();
            
            if (codigo == 0) {
                break; 
            }
            
            if (codigo < 1 || codigo > 40) {
                System.out.println("ERRO!!! Digite um codigo valido (entre 1 e 40)");
                continue; 
            }
            
            double preco;

            if (codigo <= 10){
                preco = 10.00;
            }
            else if (codigo <= 20){
                preco = 15.00;
            } 
            else if (codigo <= 30){
                preco = 20.00;
            } 
            else{
                preco = 40.00;
            }
            
            System.out.println("Digite a quantidade do produto comprada: ");
            double quantidade = sc.nextDouble();
            
            valorTotal += preco * quantidade;
            
        } while (codigo != 0);
        
        double desconto;

        if (valorTotal <= 250.00) {
            desconto = valorTotal * 0.05;
        } 
        else if (valorTotal <= 500.00) {
            desconto = valorTotal * 0.10;
        } 
        else {
            desconto = valorTotal * 0.15;
        }

        double valorFinal = valorTotal - desconto;

        System.out.println("Compra finalizada");
        System.out.println("Valor total da nota: R$" + valorTotal);
        System.out.println("Valor com desconto: R$" + valorFinal);
        
        sc.close();
    }
}
