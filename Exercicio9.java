import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um numero (inteiro e positivo): ");
        int numero = sc.nextInt();

        boolean primo = numero > 1;

        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                primo = false;
                break;
            }
        }
        System.out.println(numero + (primo ? " e primo." : " nao e primo."));

        sc.close();
    }    
}
