import java.util.Scanner;

public class Exercicio7 {
    public static long fatorial(int n){
        long resultado = 1;

        for (int i = 1; i <= n; i++){
            resultado *= i;
        }
        return resultado;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("Fatoriais do intervalo de " + inicio + " ate " + fim + " :");
        
        for (int i = inicio; i <= fim; i++){
            System.out.println(i + "! = " + fatorial(i));    
        }
        sc.close();
    } 
}
