import java.lang.Math;
import java.util.Scanner;

public class Exercicio6 {

    public static long fatorial(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n*fatorial(n - 1);
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
            
            System.out.println("Digite um numero (inteiro e positivo), para calcular seu fatorial: ");
            int n = sc.nextInt();

            System.out.println("O FATORIAL DE " + n + " É: " + fatorial(n));
        
    }
}
