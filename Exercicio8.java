import java.util.Scanner;

public class Exercicio8 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor total da compra do cliente em R$");
        double totalCompra = sc.nextDouble();

        System.out.println("Digite o valor recebido do cliente em R$");
        double totalCliente = sc.nextDouble();

        if (totalCliente < totalCompra) {
            System.out.println("Valor insuficiente!!!");
        }
        else{
            double troco = totalCliente - totalCompra;
            System.out.printf("Troco: R$ %.2f%n", troco);

            int trocoCent = (int) Math.round(troco * 100);

            int[] notas = {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

            String[] descricaoNotas = {
            "R$ 200,00", "R$ 100,00", "R$ 50,00", "R$ 20,00", "R$ 10,00", "R$ 5,00", "R$ 2,00",
            "R$ 1,00", "R$ 0,50", "R$ 0,25", "R$ 0,10", "R$ 0,05", "R$ 0,01",
            };

            System.out.println("Troco: ");
            for (int i = 0; i < notas.length; i++){
                int quantidade = trocoCent / notas[i];
                if (quantidade > 0){
                    System.out.println(quantidade + " x " + descricaoNotas[i]);
                }
                trocoCent %= notas[i];
            }
        }
        sc.close();
    }    
}
