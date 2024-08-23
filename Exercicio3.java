import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o comprimento dos tres lados do triangulo:");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        
        System.out.println("Digite os tres angulos do triangulo:");
        double angulo1 = sc.nextDouble();
        double angulo2 = sc.nextDouble();
        double angulo3 = sc.nextDouble();
        
        if (angulo1 + angulo2 + angulo3 != 180) {
            System.out.println("Os angulos fornecidos nao formam um triangulo valido.");
            return;
        }

        String tipoAngulo;
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            tipoAngulo = "Retangulo";
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            tipoAngulo = "Obtusangulo";
        } else {
            tipoAngulo = "Acutangulo";
        }

        String tipoLado;
        if (lado1 == lado2 && lado2 == lado3) {
            tipoLado = "Equilatero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            tipoLado = "Isosceles";
        } else {
            tipoLado = "Escaleno";
        }

        System.out.println("O triangulo e " + tipoAngulo + " e " + tipoLado + ".");
        
        sc.close();
    }
}