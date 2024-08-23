import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int contPrimos = 0;

        System.out.println("Digite dez numeros inteiros e positivos: ");
        for (int i = 0; i < 10; i++){
            int numero = sc.nextInt();
                if (primo(numero))contPrimos++;
            }
            System.out.println("Quantidade de numeros primos digitados: " + contPrimos);

            sc.close();
        }

    private static boolean primo(int numero){
        if(numero < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0) 
                return false;
        }
            return true;
    }
}    

