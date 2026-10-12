import java.util.Scanner;

public class aula4Media {
    public static void main(String[] args) {
        Scanner scmn = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scmn.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scmn.nextDouble();

        System.out.println("A média das notas " + nota1 + " e " + nota2 + " é: " + media(nota1, nota2));
    }

    public static double media(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

}
